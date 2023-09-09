package ir.ac.guilan;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class gui {
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
	private static JFrame frame = new JFrame();
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new gui();
	}

	/**
	 * Create the frame.
	 */
	public gui() {

		frame.setTitle("specification");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 459, 808);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setLocationRelativeTo(null);

		// first we should set a combox of groups
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "unasigned", "friends", "favorites", "family", "classmates", "colleagues" }));
		comboBox.setBackground(new Color(255, 255, 0));
		comboBox.setBounds(140, 581, 273, 29);
		contentPane.add(comboBox);
		/**
		 * here we make our frame with labels and text fields
		 */
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.YELLOW);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblName.setBounds(15, 295, 69, 20);
		contentPane.add(lblName);

		JLabel lblNumber = new JLabel("number");
		lblNumber.setForeground(Color.YELLOW);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNumber.setBounds(56, 337, 69, 20);
		contentPane.add(lblNumber);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.YELLOW);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEmail.setBounds(75, 379, 69, 20);
		contentPane.add(lblEmail);

		JLabel lblBirthDay = new JLabel("birth day");
		lblBirthDay.setForeground(Color.YELLOW);
		lblBirthDay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblBirthDay.setBounds(50, 421, 94, 20);
		contentPane.add(lblBirthDay);

		JLabel lblLocation = new JLabel("location");
		lblLocation.setForeground(Color.YELLOW);
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblLocation.setBounds(63, 463, 69, 20);
		contentPane.add(lblLocation);

		JLabel lblGender = new JLabel("gender");
		lblGender.setForeground(Color.YELLOW);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGender.setBounds(74, 535, 69, 26);
		contentPane.add(lblGender);

		JLabel lblGroup = new JLabel("group");
		lblGroup.setForeground(Color.YELLOW);
		lblGroup.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGroup.setBounds(74, 584, 69, 23);
		contentPane.add(lblGroup);
		
		String dir;
		dir = System.getProperty("user.dir");

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(dir+"\\download.png"));
		lblNewLabel.setBounds(102, 28, 235, 225);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("(please insert x,y)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(140, 503, 241, 20);
		contentPane.add(lblNewLabel_1);

		tf = new JTextField();
		tf.setBackground(new Color(255, 255, 0));
		tf.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf.setBounds(75, 294, 338, 26);
		contentPane.add(tf);
		tf.setColumns(10);

		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf1.setBackground(new Color(255, 255, 0));
		tf1.setBounds(140, 336, 273, 26);
		contentPane.add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setBackground(new Color(255, 255, 0));
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf2.setBounds(140, 378, 273, 26);
		contentPane.add(tf2);
		tf2.setColumns(10);

		tf3 = new JTextField();
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf3.setBackground(new Color(255, 255, 0));
		tf3.setBounds(140, 421, 273, 26);
		contentPane.add(tf3);
		tf3.setColumns(10);

		tf4 = new JTextField();
		tf4.setBackground(new Color(255, 255, 0));
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf4.setBounds(140, 462, 273, 26);
		contentPane.add(tf4);
		tf4.setColumns(10);

		tf5 = new JTextField();
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf5.setBackground(new Color(255, 255, 0));
		tf5.setBounds(140, 539, 273, 26);
		contentPane.add(tf5);
		tf5.setColumns(10);
		// at add button we fill our fiels of contact class
		JButton button_8 = new JButton("Add");
		button_8.setFocusable(false);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				name = tf.getText();
				number = tf1.getText();
				email = tf2.getText();
				birthdate = tf3.getText();
				location = tf4.getText();
				gender = tf5.getText();
				gpName = (String) comboBox.getSelectedItem();
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
				frame.setVisible(false);
				gui.main(null);// again open our first page to set more contacts
			}
		});
		button_8.setBackground(new Color(255, 255, 0));
		button_8.setBounds(51, 647, 148, 46);
		contentPane.add(button_8);

		JButton btnSave = new JButton("save");// this button take us to next window
		btnSave.setFocusable(false);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				gui2.main(null);
			}
		});
		btnSave.setBackground(new Color(255, 255, 0));
		btnSave.setBounds(245, 647, 154, 46);
		contentPane.add(btnSave);
		frame.setVisible(true);

	}
}
