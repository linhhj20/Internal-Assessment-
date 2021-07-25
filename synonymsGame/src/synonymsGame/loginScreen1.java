package synonymsGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Canvas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.io.File; 

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

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
		
		JLabel lbl_profilePic = new JLabel("");
		lbl_profilePic.setBounds(181, 83, 268, 139);
		frame.getContentPane().add(lbl_profilePic);
		
		JButton btn_browseImageFiles = new JButton("Browse Image");
		btn_browseImageFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser browseImages = new JFileChooser(); 
				
				//Offer different image options; filter image extensions
				FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpeg", "jpg"); 
				browseImages.addChoosableFileFilter(fnef);
				int showOpenDialogue = browseImages.showOpenDialog(null);
				if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
					File selectedImageFile = browseImages.getSelectedFile();
					String selectedImagePath = selectedImageFile.getAbsolutePath(); 
					JOptionPane.showMessageDialog(null, selectedImagePath);
					
					//Display chosen image  
					ImageIcon ii = new ImageIcon(selectedImagePath); 
					//Resizes chosen image
					Image pfp = ii.getImage().getScaledInstance(lbl_profilePic.getWidth(), lbl_profilePic.getHeight(), Image.SCALE_SMOOTH);
					lbl_profilePic.setIcon(new ImageIcon(pfp));
				}
			}
		});
		btn_browseImageFiles.setBounds(30, 139, 117, 29);
		frame.getContentPane().add(btn_browseImageFiles);
			
		}
	
		
		//public void close() {
		//WindowEvent closeWindow = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		//Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
		//}
		
		
	}

