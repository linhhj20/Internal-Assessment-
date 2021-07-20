package synonymsGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class loginScreen1 {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtStudentID;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginScreen1 window = new loginScreen1();
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
	public loginScreen1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 15));
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_gameName = new JLabel("VOCABULARY GAME");
		lbl_gameName.setBounds(147, 20, 372, 51);
		lbl_gameName.setFont(new Font("Verdana", Font.BOLD, 30));
		frame.getContentPane().add(lbl_gameName);
		
		JLabel lbl_username = new JLabel("USERNAME");
		lbl_username.setFont(new Font("Verdana", Font.PLAIN, 15));
		lbl_username.setBounds(76, 253, 102, 16);
		frame.getContentPane().add(lbl_username);
		
		JLabel lbl_studentID = new JLabel("STUDENT ID");
		lbl_studentID.setFont(new Font("Verdana", Font.PLAIN, 15));
		lbl_studentID.setBounds(76, 311, 102, 16);
		frame.getContentPane().add(lbl_studentID);
		
		JLabel lbl_password = new JLabel("PASSWORD");
		lbl_password.setFont(new Font("Verdana", Font.PLAIN, 15));
		lbl_password.setBounds(76, 367, 102, 16);
		frame.getContentPane().add(lbl_password);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtUsername.setBounds(231, 249, 130, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtStudentID = new JTextField();
		txtStudentID.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtStudentID.setBounds(231, 307, 130, 26);
		frame.getContentPane().add(txtStudentID);
		txtStudentID.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtPassword.setBounds(231, 363, 130, 26);
		frame.getContentPane().add(txtPassword);
	}
}
