package synonymsGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class chooseOptionScreen2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chooseOptionScreen2 window = new chooseOptionScreen2();
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
	public chooseOptionScreen2() {
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
		
		JLabel lbl_profilePic = new JLabel("");
		lbl_profilePic.setBounds(183, 34, 268, 139);
		frame.getContentPane().add(lbl_profilePic);
		
		JButton btn_goBack = new JButton("BACK");
		btn_goBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btn_goBack);
	}
}
