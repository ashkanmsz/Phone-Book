package ir.ac.guilan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class gui4  {
	
	private String name;
	private String number;
	private String birthdate;
	private String location;
	private String gender;
	private String email;
	private String gpName;
	private String x = "";
	private String y = "";
	private JPanel contentPane;
	private static JFrame frmNewContact = new JFrame();
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JButton btnAdd;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new gui4();
	}

	/**
	 * Create the frame.
	 */
	public gui4() {
		/**
		 * this gui is for addig new contact to new group
		 */
		frmNewContact.setTitle("new contact");
		frmNewContact.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewContact.setBounds(100, 100, 640, 469);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmNewContact.setContentPane(contentPane);
		contentPane.setLayout(null);
		frmNewContact.setLocationRelativeTo(null);
		
		tf = new JTextField();
		tf.setBackground(Color.YELLOW);
		tf.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf.setBounds(150, 39, 247, 26);
		contentPane.add(tf);
		tf.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBackground(Color.YELLOW);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf1.setBounds(152, 81, 180, 26);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBackground(Color.YELLOW);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf2.setBounds(152, 128, 180, 26);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBackground(Color.YELLOW);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf3.setBounds(152, 170, 180, 26);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBackground(Color.YELLOW);
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf4.setBounds(152, 212, 180, 26);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBackground(Color.YELLOW);
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf5.setBounds(152, 254, 180, 26);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.YELLOW);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblName.setBounds(78, 45, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblNumber = new JLabel("number");
		lblNumber.setForeground(Color.YELLOW);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNumber.setBounds(68, 84, 69, 20);
		contentPane.add(lblNumber);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.YELLOW);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEmail.setBounds(78, 131, 69, 20);
		contentPane.add(lblEmail);
		
		JLabel lblBirthday = new JLabel("birthday");
		lblBirthday.setForeground(Color.YELLOW);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblBirthday.setBounds(68, 170, 69, 20);
		contentPane.add(lblBirthday);
		
		JLabel lblLocation = new JLabel("location");
		lblLocation.setForeground(Color.YELLOW);
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblLocation.setBounds(68, 212, 69, 20);
		contentPane.add(lblLocation);
		
		JLabel lblGender = new JLabel("gender");
		lblGender.setForeground(Color.YELLOW);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGender.setBounds(78, 254, 69, 26);
		contentPane.add(lblGender);
		
		tf6 = new JTextField();
		tf6.setBackground(Color.YELLOW);
		tf6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf6.setBounds(152, 296, 180, 26);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JLabel lblGroup = new JLabel("group");
		lblGroup.setForeground(Color.YELLOW);
		lblGroup.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGroup.setBounds(78, 296, 69, 26);
		contentPane.add(lblGroup);
		
		btnAdd = new JButton("add");
		btnAdd.setFocusable(false);
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//this method is like the method in first gui
				name = tf.getText();
				number = tf1.getText();
				email = tf2.getText();
				birthdate = tf3.getText();
				location = tf4.getText();
				gender = tf5.getText();
				gpName = tf6.getText();
				if (location.length() > 2) {// this if indicate we have group field or not
					int i = 0;
					for (; location.charAt(i) != ','; i++)
						x += location.charAt(i);
					for (int j = i + 1; j < location.length(); j++)
						y += location.charAt(j);
					Location lc = new Location(x, y);
					location = lc.diagnoseLoc(lc.getR());
				}
				Contact contact = new Contact(name, number, birthdate, location, gender, email, gpName);
				Group gp = new Group(gpName, contact);// send our contact object in group class and make its group
				Group.add(gp);
				AddressBook.add(contact);// save our contact object in the contact list
				frmNewContact.setVisible(false);
				gui4.main(null);			
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAdd.setBounds(353, 368, 115, 29);
		contentPane.add(btnAdd);
		
		btnNewButton = new JButton("save");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frmNewContact.setVisible(false);
			gui3.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(483, 369, 115, 31);
		contentPane.add(btnNewButton);
		
		String dir;
		dir = System.getProperty("user.dir");
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(dir+"\\download.png"));
		lblNewLabel.setBounds(384, 39, 214, 313);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		frmNewContact.setVisible(true);
		
	}
}
