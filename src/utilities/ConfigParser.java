package utilities;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigParser {
    private static Properties props = new Properties();
    
    public ConfigParser(File configFile){
        if(configFile.exists()){
            try{
                InputStream is = new FileInputStream(configFile);
                props.load(is);
            }catch(FileNotFoundException e0){
                e0.printStackTrace();
            }catch(SecurityException e1){
                e1.printStackTrace();
            }catch(IOException e2){
                e2.printStackTrace();
            }
        }
    }
    
    public String getConfigFile(){
        return props.getProperty("Config");
    }
    public String getFile(String file){
        return props.getProperty(file, "/home/antonis/NetBeansProjects/"
                + "WaitQueues/config/defaultFile");
    }
}
