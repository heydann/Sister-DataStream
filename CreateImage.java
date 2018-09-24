/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author SUBARI
 */
public class CreateImage {
    public static void main(String[] args) throws Exception{
        int width = 250;
        int height = 250;
        
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        Graphics2D g2d = buffImg.createGraphics();
        
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, width, height);
        
        g2d.setColor(Color.black);
        g2d.fillOval(0, 0, width, height);
        
        g2d.setColor(Color.ORANGE);
        g2d.drawString("Hello Alam Andara", 35, 100);
        g2d.dispose();
        
        //Save File
        File file = new File("this.jpg");
        ImageIO.write(buffImg, "jpg", file);
        
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(buffImg));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
