import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;

public class Euros {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Euros window = new Euros();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Euros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Euro Millions Draw");
		label.setBounds(98, 32, 393, 30);
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 18));
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Get Numbers ");
		btnNewButton.setBounds(236, 262, 149, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(142, 158, 349, 54);
		frame.getContentPane().add(lblNewLabel);
	}
}
