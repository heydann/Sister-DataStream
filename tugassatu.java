/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author SUBARI
 */
public class tugassatu {
    public static void main (String[] args){        
        FileInputStream instream = null;
        FileOutputStream outstream = null;        
        try {
            File infile = new File("E:\\text.txt");
            File outfile = new File("E:\\initext.txt");
            
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            
            byte[] buffer = new byte[1024];
            
            int length;
            
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }
                    
            instream.close();
            outstream.close();
            
            System.out.println("File copied successfully!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
