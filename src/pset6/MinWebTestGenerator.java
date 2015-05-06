package pset6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MinWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( "/Users/Lucifer/Documents/Development/workspace/software_testing/src/pset6/MinWebTestSuite.java"));
            writer.write(suite);
        }
        catch ( IOException e)
        {
        }
        finally
        {
            try
            {
                if ( writer != null)
                writer.close( );
            }
            catch ( IOException e)
            {
            }
        }
        //System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n\n"
        	+ "import org.junit.AfterClass;\n"
        	+ "import org.junit.BeforeClass;\n"
            + "import org.junit.Test;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }
    
    

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        String valuePool[] = {"-1", "0", "1", "Four"};
        String clickPool[] = {"\t\twe.click();\n", ""};
        sb.append("public class MinWebTestSuite {\n");
        

        // your code goes here
        // declare the variables
        sb.append("\tprivate static WebDriver wd;\n");
        sb.append("\tprivate WebElement we;\n");
        sb.append("\tprivate WebElement result;\n");
        sb.append("\tprivate String output;\n\n");
        
        // setup before class
        sb.append("\t@BeforeClass public static void setup()\n");
        sb.append("\t{\n");
        sb.append("\t\twd = new FirefoxDriver();\n");
        sb.append("\t\twd.get(\"file:///Users/Lucifer/Documents/Development/workspace/software_testing/src/pset6/min.html\");\n");
        sb.append("\t}\n\n");
        
        //test cases
        int count = 0;
        for(String i: valuePool){
        	for(String j : valuePool){
        		for(String k : valuePool){
        			for(String m : clickPool){
        				sb.append("\t@Test public void t" + count + "() {\n");
        				sb.append("\t\twe = wd.findElement(By.id(\"x\"));\n");
        				sb.append("\t\twe.sendKeys(\"" + i + "\");\n");
        				sb.append("\t\twe = wd.findElement(By.id(\"y\"));\n");
        				sb.append("\t\twe.sendKeys(\"" + j + "\");\n");
        				sb.append("\t\twe = wd.findElement(By.id(\"z\"));\n");
        				sb.append("\t\twe.sendKeys(\"" + k + "\");\n");
        				sb.append("\t\twe = wd.findElement(By.id(\"computeButton\"));\n");
        				sb.append(m);
        				sb.append("\t\tresult = wd.findElement(By.id(\"result\"));\n");
        				sb.append("\t\toutput = result.getText();\n");
        				if (i == "Four" || j == "Four" || k == "Four" || m.length() == 0) {
        					if(m.length() != 0){
        						//sb.append("\t\tassertEquals(\"\", output);\n");
          			          	String tmp = "Please enter integer values only!";
          			          	sb.append("\t\tassertEquals(\"" + tmp + "\", output);\n");
        					}
        			    }else{
        			    	String tmp = Integer.toString(Math.min(Math.min(Integer.parseInt(i), Integer.parseInt(j)), Math.min(Integer.parseInt(j), Integer.parseInt(k))));
        			    	sb.append("\t\tassertEquals(\"min("+ i + ", " + j + ", " + k + ") = " + tmp +  "\", output);\n");
        			    }
        				sb.append("\t\twd.navigate().refresh();\n\t}\n\n");
        				count++;
        			}
        		}
        	}
        }
        
        // setup after class
        sb.append("\t@AfterClass public static void close()\n");
        sb.append("\t{\n");
        sb.append("\t\twd.quit();\n");
        sb.append("\t}\n");
        sb.append("}\n");
        return sb.toString();
    }
    // implement any helper methods that you need in this class
}
