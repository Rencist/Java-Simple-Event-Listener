package id.its.simplekeyboardevent;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 public void run() {
				 JFrame frame = new JFrame("Simple Keyboard Event");
				 
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 frame.setContentPane(new KeyboardPanel(1920, 1080)); 
				 frame.pack(); 
				 frame.setVisible(true); 
			 }
		 });
	}
}
 