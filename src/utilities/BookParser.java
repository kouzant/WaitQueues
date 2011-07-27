package utilities;

import java.io.*;

public class BookParser {
    private String fileName;
    
    public BookParser(String fileName){
        this.fileName = fileName;
    }
    
    public void parseBooks(){
        try{
            FileInputStream fiStream = new FileInputStream(fileName);
            DataInputStream diStream = new DataInputStream(fiStream);
            BufferedReader breader = new BufferedReader(
                    new InputStreamReader(diStream));
            
            String newLine;
            while((newLine = breader.readLine()) != null){
                String[] newTokens = newLine.split("[-]");
                System.out.println("Name: "+newTokens[0]);
                System.out.println("Publisher: "+newTokens[1]);
                System.out.println("Appearance: "+newTokens[2]);
            }
        }catch(FileNotFoundException e0){
            e0.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }
    }
}
