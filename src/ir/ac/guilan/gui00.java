package ir.ac.guilan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class gui00 {

	private JPanel contentPane;
	private JFrame frame=new JFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	new gui00();
	}

	/**
	 * Create the frame.
	 */
	public gui00() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 561, 865);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		String dir;
		dir = System.getProperty("user.dir");
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(dir + "\\IMG_20180506_010238.jpg"));
		lblNewLabel.setBounds(0, 0, 541, 438);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				gui0.main(null);
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(213, 729, 123, 64);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnStevenPaulJobs = new JTextPane();
		txtpnStevenPaulJobs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnStevenPaulJobs.setBackground(Color.BLACK);
		txtpnStevenPaulJobs.setForeground(Color.YELLOW);
		txtpnStevenPaulJobs.setText("\r\nAshkan mousazadeh was born on 24 February 1955 in San Francisco, California, to students Abdul Fattah Jandali and Joanne Carole Schieble who were unmarried at the time and gave him up for adoption. He was taken in by a working class couple, Paul and Clara Jobs, and grew up with them in Mountain View, California.\r\n\r\nHe attended Homestead High School in Cupertino California and went to Reed College in Portland Oregon in 1972 but dropped out after only one semester, staying on to \"drop in\" on courses that interested him.");
		txtpnStevenPaulJobs.setBounds(10, 449, 531, 270);
		contentPane.add(txtpnStevenPaulJobs);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(611, 709, 49, -209);
		contentPane.add(scrollPane);
		
	
	
	
	
	
	
	
	
	
	
	
	frame.setVisible(true);
	
	}
}
