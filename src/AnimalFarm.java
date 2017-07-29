import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		String animalChoice;
		
		for (int i = 0; i < 2; i++) {
			
		
		animalChoice = JOptionPane.showInputDialog(
				"Type the name of the animal in which you would like to hear a sound from: Cow, Duck, Dog, Cat, Llama. Type Done to finish.");
		if (animalChoice.equalsIgnoreCase("cow")) {
			playMoo();
		}
		else if(animalChoice.equalsIgnoreCase("duck")){
		playQuack();
		}
		else if(animalChoice.equalsIgnoreCase("dog")){
			playWoof();
		}
		else if(animalChoice.equalsIgnoreCase("llama")){
			playLlama();
		}
		else if(animalChoice.equalsIgnoreCase("cat")){
			playMeow();
		}
		else if(animalChoice.equalsIgnoreCase("done")){
			i=7;
		}
		else{JOptionPane.showMessageDialog(null, "Answer not available.");
	
		}
		i--;
	}
	
	}
	/* 2. Make it so that the user can keep entering new animals. */
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
