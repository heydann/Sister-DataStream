/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author SUBARI
 */
public class contohimage {
    public static void main(String[] args) {
        Image image = null;
        try {
            //Read from a file
            File sourceimage = new File("c:/matlab/duik.jpg");
            image = ImageIO.read(sourceimage);
            
            //Read from an input stream
            InputStream is = new BufferedInputStream(new FileInputStream("c:/matlab/duik.jpg"));
            image = ImageIO.read(is);
        } catch (Exception e) {
            
        }
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
