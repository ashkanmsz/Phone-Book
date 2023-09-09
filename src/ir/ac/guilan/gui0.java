package ir.ac.guilan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui0  {

	private JPanel contentPane;
	private JFrame frame=new JFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new gui0();
	}

	/**
	 * Create the frame.
	 */
	public gui0() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 619, 914);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		String dir;
		dir = System.getProperty("user.dir");
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(dir + "\\IMG_20180506_010241-1.jpg"));
		lblNewLabel.setBounds(0, 0, 597, 433);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrHeTookA = new JTextArea();
		txtrHeTookA.setBackground(Color.BLACK);
		txtrHeTookA.setForeground(Color.YELLOW);
		txtrHeTookA.setFont(new Font("Nirmala UI", Font.PLAIN, 19));
		txtrHeTookA.setText("He took a job with video game manufacturer Atari to raise \r\nenough money for a trip to India and returned from there a Buddhist.\r\n\r\nBack in Cupertino he returned to Atari where his old friend \r\nSteve Wozniak was still working. Wozniak was building his own computer and\r\n in 1976 Jobs pre-sold 50 of the as-yet unmade computers to a local store and managed\r\n to buy the components on credit solely on the strength of the order, enabling them to \r\nbuild the Apple I without any funding at all.\r\n\r\nThe Apple II followed in 1977 and the company Apple Computer was formed shortly afterwards. The Apple II was credited with starting the personal computer boom, its popularity prompting IBM to hurriedly develop their own PC. By the time production of the Apple II ended in 1993 it had sold over 6 million units.");
		txtrHeTookA.setBounds(0, 440, 608, 302);
		contentPane.add(txtrHeTookA);
		
		JButton btnNext = new JButton("thanks ashkhan!\r\n");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				gui.main(null);
			}
		});
		btnNext.setBackground(Color.YELLOW);
		btnNext.setFocusable(false);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNext.setBounds(205, 759, 191, 53);
		contentPane.add(btnNext);
	
	
	
	
	
	frame.setVisible(true);
	}
}
