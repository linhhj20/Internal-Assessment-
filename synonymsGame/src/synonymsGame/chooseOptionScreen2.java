package synonymsGame;

import java.awt.BorderLayout;
import java.awt.Window; 
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chooseOptionScreen2 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			chooseOptionScreen2 dialog = new chooseOptionScreen2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public chooseOptionScreen2() {
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER); 
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			{
				JButton testModeButton = new JButton("TEST");
				testModeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						testModeScreen3 tms3 = new testModeScreen3(); 
						tms3.setVisible(true); 
					}
				});
				testModeButton.setActionCommand("TEST");
				buttonPane.add(testModeButton);
				getRootPane().setDefaultButton(testModeButton);
			}
			{
				JButton learnModeButton = new JButton("LEARN");
				learnModeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						learnModeScreen4 lms4 = new learnModeScreen4(); 
						lms4.setVisible(true); 
					}
				});
				learnModeButton.setActionCommand("LEARN");
				buttonPane.add(learnModeButton);
			}
			
			//Prompt user
			Object[] options = {"TEST", "LEARN"}; 
			Object pane = JOptionPane.showOptionDialog(null, "Choose 1 out of 2 options!", "OPTIONS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); 
			Object chosenOption = ((JOptionPane) pane).getValue(); 		
			
		}
	}

	
}
