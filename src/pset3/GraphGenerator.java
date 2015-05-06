package pset3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.*;

import org.apache.bcel.Repository;
import pset3.CFG.Node;

public class GraphGenerator {
    public CFG createCFG(String className) throws ClassNotFoundException {
        CFG cfg = new CFG();
        JavaClass jc = Repository.lookupClass(className);
        ClassGen cg = new ClassGen(jc);
        ConstantPoolGen cpg = cg.getConstantPool();
        for (Method m: cg.getMethods()) {
            MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
            InstructionList il = mg.getInstructionList();
            InstructionHandle[] handles = il.getInstructionHandles();
            for (InstructionHandle ih: handles) {
                int position = ih.getPosition();
                cfg.addNode(position, m, jc);
                Instruction inst = ih.getInstruction();
                // your code goes here
                if (inst instanceof BranchInstruction) {
					BranchInstruction bran_inst = (BranchInstruction) inst;
					cfg.addEdge(position, bran_inst.getTarget().getPosition(),m, jc);
				} else {
					if ((ih.getNext() != null) && !(inst instanceof IRETURN) && !(inst instanceof LRETURN) && !(inst instanceof ARETURN)
							&& !(inst instanceof DRETURN) && !(inst instanceof FRETURN) && !(inst instanceof RETURN)) {
						cfg.addEdge(position, ih.getNext().getPosition(), m, jc);
					}
				}
            }
        }
        return cfg;
}
    public CFG createCFGWithMethodInvocation(String className) throws ClassNotFoundException {
        // your code goes here
    	CFG result = new CFG();
		JavaClass jc = Repository.lookupClass(className);
		ClassGen cg = new ClassGen(jc);
		ConstantPoolGen cpg = cg.getConstantPool();
		Set<Method> invoked = new HashSet<Method>();
		Map<Method, Set<Node>> mapTemp = new HashMap<Method, Set<Node>>();
		for (Method m : cg.getMethods()) {
			MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
			InstructionList il = mg.getInstructionList();
			InstructionHandle[] handles = il.getInstructionHandles();
			for (InstructionHandle ih : handles) {
				int position = 0;
				position = ih.getPosition();
				Instruction inst = ih.getInstruction();
				result.addNode(position, m, jc);
				if (inst instanceof INVOKESTATIC) {
					INVOKESTATIC invsta_inst = null;
					invsta_inst = (INVOKESTATIC) inst;
					Method ived = null;
					for (Method s : cg.getMethods()) {
						if ((invsta_inst.getMethodName(cpg) == s.getName()) && (invsta_inst.getSignature(cpg) == s.getSignature())) {
							ived = new Method(s);
							break;
						}
					}
					result.addEdge(position, m, jc, 0, ived, jc);
					invoked.add(ived);
					Set<Node> setTemp = mapTemp.get(ived);
					if (setTemp == null) {
						setTemp = new HashSet<Node>();
					}
					Node temp = new Node(ih.getNext().getPosition(), m, jc);
					setTemp.add(temp);
					mapTemp.put(ived, setTemp);
					
				} else {
					if (inst instanceof BranchInstruction) {
						BranchInstruction bra_inst = (BranchInstruction) inst;
						result.addEdge(position, bra_inst.getTarget()
								.getPosition(), m, jc);
					} else {
						if (!(inst instanceof IRETURN) && !(inst instanceof LRETURN) && !(inst instanceof ARETURN)
								&& !(inst instanceof DRETURN) && !(inst instanceof FRETURN) && !(inst instanceof RETURN)) {
							result.addEdge(position, ih.getNext().getPosition(),m, jc);
						}
					}
				}

			}
		}
		for (Method m : cg.getMethods()) {
			if (invoked.contains(m)) {
				MethodGen mg = new MethodGen(m, cg.getClassName(), cpg);
				InstructionList il = mg.getInstructionList();
				InstructionHandle[] handles = il.getInstructionHandles();
				Set<Node> setTemp = mapTemp.get(m);
				for (InstructionHandle ih : handles) {
					Instruction inst = ih.getInstruction();
					if ((inst instanceof IRETURN) || (inst instanceof LRETURN) || (inst instanceof ARETURN) || (inst instanceof DRETURN) || (inst instanceof FRETURN) || (inst instanceof RETURN)) {
						for (Node i : setTemp) {		
							result.addEdge(ih.getPosition(), m, jc, i.position,
									i.getMethod(), jc);
						}
					}
				}
			}
		}
		return result;
}
    public static void main(String[] a) throws ClassNotFoundException {
        GraphGenerator gg = new GraphGenerator();
        gg.createCFG("pset3.C"); // example invocation of createCFG
        gg.createCFGWithMethodInvocation("pset3.D"); // example invocation of createCFGWithMethodInovcation
        }
}