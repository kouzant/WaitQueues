package utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    File output;
    
    public Writer(){
        ConfigParser cp = new ConfigParser();
        output = new File(cp.getFile("output"));
        
        if(!output.exists()){
            try{
                output.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }else{
            output.delete();
            try{
                output.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public void writeString(String buffer){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(output,true));
            bw.write(buffer);
            bw.newLine();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
