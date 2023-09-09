package ir.ac.guilan;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class gui2 {
	private JPanel contentPane;
	private static JFrame frmOpreations = new JFrame();
	private static ArrayList<Integer> shomareha = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new gui2();
	}

	/**
	 * Create the frame.
	 */
	public gui2() {
		frmOpreations.setTitle("opreations");
		frmOpreations.getContentPane().setLayout(null);
		frmOpreations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOpreations.setBounds(100, 100, 711, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmOpreations.setContentPane(contentPane);
		contentPane.setLayout(null);
		frmOpreations.setLocationRelativeTo(null);
		// these are needed objects at executing the program
		AddressBook ab = new AddressBook();
		int members = ab.getMembers();
		Contact c = new Contact();
		// this panel is for place of contacts
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(255, 255, 0));
		panel.setBounds(15, 76, 481, 368);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 0));
		// this panel is for buttons
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(511, 0, 185, 368);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton_2 = new JButton("edit");// this button take us to next window
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmOpreations.setVisible(false);
				gui3.main(null);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnNewButton_1 = new JButton("Add more\r\n\r\n");// at here we can add more contacts
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gui.main(null);

			}
		});

		JButton btnFindSameGp = new JButton("find same gp");// with pressing this button you can find same groups
		panel_1.add(btnFindSameGp);
		btnFindSameGp.setFocusable(false);
		btnFindSameGp.setBackground(new Color(255, 255, 0));
		btnFindSameGp.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton remove = new JButton("Remove");
		panel_1.add(remove);
		remove.setFocusable(false);
		remove.setBackground(new Color(255, 255, 0));
		remove.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnFindNeighbour = new JButton("find neighbour");// with pressing this button you can find neighbours
		btnFindNeighbour.setFocusable(false);
		btnFindNeighbour.setBackground(Color.YELLOW);
		btnFindNeighbour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel_1.add(btnFindNeighbour);

		JButton btnNewButton_3 = new JButton("new phone book\r\n");// this button take us to last window
		panel_1.add(btnNewButton_3);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ab.removeAll();
				frmOpreations.setVisible(false);
				gui.main(null);

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JLabel label = new JLabel("");// this is a label for printing
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setForeground(new Color(255, 255, 0));
		label.setBounds(15, 16, 481, 51);
		contentPane.add(label);

		JButton btnOk = new JButton("ok");
		btnOk.setBounds(511, 361, 178, 83);
		contentPane.add(btnOk);
		btnOk.setFocusable(false);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnOk.setBackground(new Color(255, 255, 0));
		btnOk.setForeground(new Color(0, 0, 0));
		/**
		 * now we make list of contacts with check boxes
		 */
		for (int i = 0; i < members; i++) {
			JCheckBox cb = new JCheckBox(i + ") " + AddressBook.contactlist.get(i).getName());
			cb.setFocusable(false);
			cb.setBackground(new Color(0, 0, 0));
			cb.setForeground(new Color(255, 255, 0));
			cb.setFont(new Font("Tahoma", Font.PLAIN, 21));
			cb.setBounds(11, 63, 414, 63);
			panel.add(cb);
			btnFindSameGp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label.setText("select your contact ");
					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (cb.isSelected()) {
								String s = cb.getText();// this string is for finding the row of contacts
								String f = "";
								String names = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								c.findSameGp(AddressBook.contactlist.get(mark));// send our contact to its function
								for (int i = 0; i < Contact.names.size(); i++)// get our neighbours from array list
									names += " " + Contact.names.get(i);
								label.setText("contacts with same groups are: " + names);
								btnOk.addActionListener(new ActionListener() {// with pressing this button we update the
																				// program
									public void actionPerformed(ActionEvent arg0) {
										frmOpreations.setVisible(false);
										gui2.main(null);
										Contact.names.clear();
									}
								});

							}
						}
					});

				}
			});
			remove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label.setText("select your contact");
					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (cb.isSelected()) {
								String s = cb.getText();// this string is for finding the row of contacts
								String f = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								shomareha.add(mark);// we save our selected rows in the array list for removing contacts

								btnOk.addActionListener(new ActionListener() {// with pressing this button we update the
																				// program
									public void actionPerformed(ActionEvent arg0) {
										/**
										 * for protecting the execption of array bounds we should sort from big numbers
										 * to small
										 */
										Collections.sort(shomareha);
										Collections.reverse(shomareha);
										for (int i = 0; i < shomareha.size(); i++)
											ab.remove(shomareha.get(i));// here we remove them
										frmOpreations.setVisible(false);
										gui2.main(null);
										shomareha.clear();

									}
								});
							}
						}
					});

				}
			});
			btnFindNeighbour.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label.setText("select your contact ");
					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (cb.isSelected()) {
								String s = cb.getText();// this string is for finding the row of contacts
								String f = "";
								String names = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								c.findNeighbours(AddressBook.contactlist.get(mark));// we send them in functions that i
																					// explained them
								for (int i = 0; i < Contact.contactnames.size(); i++)
									names += " " + Contact.contactnames.get(i);// now we get the contact names from our
																				// special array list
								label.setText("the neighbours of its are: " + names);
								btnOk.addActionListener(new ActionListener() {// with pressing this button we update the
																				// program
									public void actionPerformed(ActionEvent arg0) {
										frmOpreations.setVisible(false);
										gui2.main(null);
										Contact.contactnames.clear();
									}
								});

							}
						}
					});

				}
			});

		}
		frmOpreations.setVisible(true);
	}
}
