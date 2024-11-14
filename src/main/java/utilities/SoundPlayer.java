package utilities;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {


	    public static void playErrorSound(String soundFilePath) {
	        try {
	            File soundFile = new File(soundFilePath); // Path to the .wav file
	            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
	            Clip clip = AudioSystem.getClip();
	            clip.open(audioStream);
	            clip.start();
	            
	            // Keep the program running long enough to hear the sound
	            Thread.sleep(2000);
	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
	            ex.printStackTrace();
	        }
	    }
	        public static void playPassSound(String soundFilePath) {
		        try {
		            File soundFile = new File(soundFilePath); // Path to the .wav file
		            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
		            Clip clip = AudioSystem.getClip();
		            clip.open(audioStream);
		            clip.start();
		            
		            // Keep the program running long enough to hear the sound
		            Thread.sleep(2000);
		        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
		            ex.printStackTrace();
	    }
	}

}