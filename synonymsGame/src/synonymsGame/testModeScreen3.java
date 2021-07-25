package synonymsGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class testModeScreen3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testModeScreen3 window = new testModeScreen3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testModeScreen3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_goBack = new JButton("BACK");
		btn_goBack.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn_goBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btn_goBack);
	}

	public void setVisible(boolean b) {

		
	}

}
