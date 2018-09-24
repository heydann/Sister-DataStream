/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import com.sun.media.sound.WaveFileWriter;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;
/**
 *
 * @author SUBARI
 */
public class JavaSound {
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        AudioFormat format = new AudioFormat(16000, 8, 2, true, true);
        
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        
        if (! AudioSystem.isLineSupported(info)) {
            System.out.println("Line is not supported");
        }
        
        TargetDataLine targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
        targetDataLine.open();
        System.out.println("Starting recording");
        targetDataLine.start();
        
        Thread stopper = new Thread (new Runnable(){
            
            @Override
            public void run(){
                AudioInputStream audioStream = new AudioInputStream(targetDataLine);
                
                File wavFile = new File("C://Recording.wav");
                
                try {
                    AudioSystem.write(audioStream, AudioFileFormat.Type.WAVE, wavFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        stopper.start();
        Thread.sleep(5000);
        targetDataLine.stop();
        targetDataLine.close();
        System.out.println("ended sound test");
    }
}
