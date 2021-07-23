package synonymsGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class chooseOptionScreen2 {

	private JFrame frame;
	private JButton btn_testMode;

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
		
		JLabel lbl_message = new JLabel("Choose 'TEST' mode to play the game or 'LEARN' mode to know more synonyms!");
		lbl_message.setFont(new Font("Verdana", Font.PLAIN, 15));
		lbl_message.setBounds(16, 262, 614, 56);
		frame.getContentPane().add(lbl_message);
		
		JLabel lbl_username = new JLabel("");
		lbl_username.setFont(new Font("Verdana", Font.PLAIN, 15));
		lbl_username.setBounds(234, 221, 145, 29);
		frame.getContentPane().add(lbl_username);
		
		btn_testMode = new JButton("TEST");
		btn_testMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Close previous window
				close(); 
				
				//Open TEST mode frame
				testModeScreen3 tsm = new testModeScreen3(); 
				tsm.setVisible(true);				
			}
		});
		btn_testMode.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn_testMode.setBounds(95, 365, 117, 29);
		frame.getContentPane().add(btn_testMode);
		
		JButton btn_learnMode = new JButton("LEARN");
		btn_learnMode.setBounds(406, 366, 117, 29);
		frame.getContentPane().add(btn_learnMode);
		
		JButton btn_closeFrame = new JButton("CLOSE");
		btn_closeFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close(); 
			}
		});
		btn_closeFrame.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn_closeFrame.setBounds(126, 6, 117, 29);
		frame.getContentPane().add(btn_closeFrame);
		
		Object[] options = {"TEST", "LEARN"}; 
		JOptionPane.showOptionDialog(null, "Choose 'TEST' mode to play the game or 'LEARN' mode to know more synonyms!", "OPTIONS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		
	}
	
	public void close() {
		WindowEvent closeWindow = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
}
