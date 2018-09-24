/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.*;
/**
 *
 * @author SUBARI
 */
public class cobaaudio {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String audioFile = "c:/cartoon008.wav";
        InputStream in = new FileInputStream(audioFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
