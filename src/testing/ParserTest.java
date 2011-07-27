/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.io.File;
import utilities.*;

/**
 *
 * @author antonis
 */
public class ParserTest {
    public static void main(String args[]){
        String config = "config/config";
        ConfigParser cp = new ConfigParser(new File(config));
        String file1 = cp.getFile("file1");
        BookParser bp = new BookParser(file1);
        bp.parseBooks();
    }
}
