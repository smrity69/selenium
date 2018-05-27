package DataDriverFramework;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
    
    
    public static Properties getValuesFromFile() throws Exception
    {
        
        File f = new File("/Users/achint/eclipse-workspace/DataDrivenFramework/src/DataDriverFramework/data.properties");
        FileInputStream fis = new FileInputStream(f);
        // load a properties file
        Properties prop = new Properties();
        prop.load(fis);
        
        
        return prop;
        
    }
    
    public static void main(String[] args) throws Exception {
        
    Properties  p = ReadPropertyFile.getValuesFromFile();
//    System.out.println("p value id"   +p);
    String EURL = p.getProperty("URL");
    String EUserName=p.getProperty("userloc");
    String ENextbutton=p.getProperty("Nextbutton");
    String Epassloc=p.getProperty("passloc");
    String EPasswordnext=p.getProperty("Passwordnext");
    System.out.println(EURL);
    System.out.println(EUserName);
    System.out.println(ENextbutton);
    System.out.println(Epassloc);
    System.out.println(EPasswordnext);
    
    }

}
