import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

import javazoom.jl.player.Player;

public class Test {
	public static void main(String[] args) {
		
		JFrame f =new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		
		JButton button = new JButton("¢º");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				    FileInputStream fis = new FileInputStream("mysong.mp3");
				    Player playMP3 = new Player(fis);
				    playMP3.play();
				}
				catch(Exception exc){
				    exc.printStackTrace();
				    System.out.println("Failed to play the file.");
				}
				
			}
		});
		
		
	}
}
