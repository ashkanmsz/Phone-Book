package ir.ac.guilan;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class gui3 {

	private JPanel contentPane;
	private static JFrame frmEdit = new JFrame();
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		new gui3();
	}

	/**
	 * Create the frame.
	 */
	public gui3() {
		frmEdit.setTitle("edit");
		frmEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEdit.setBounds(100, 100, 545, 1009);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmEdit.setContentPane(contentPane);
		contentPane.setLayout(null);
		frmEdit.setLocationRelativeTo(null);
		// these are needed objects at executing the program
		AddressBook ab = new AddressBook();
		Contact c = new Contact();
		Group gr = new Group();
		Location lc = new Location();
		int members = ab.getMembers();
		/**
		 * now we make our window
		 */
		tf = new JTextField();
		tf.setForeground(new Color(255, 255, 0));
		tf.setBackground(new Color(0, 0, 0));
		tf.setHorizontalAlignment(SwingConstants.LEFT);
		tf.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tf.setBounds(15, 192, 503, 26);
		contentPane.add(tf);
		tf.setColumns(10);

		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setBounds(15, 106, 385, 29);
		contentPane.add(label_1);

		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 255, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(15, 64, 385, 29);
		contentPane.add(label);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 507, 518, 370);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 234, 503, 195);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3, 0, 0));

		JButton editName = new JButton("edit name");
		panel_1.add(editName);
		editName.setFocusable(false);
		editName.setBackground(new Color(255, 255, 0));
		editName.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton gender = new JButton("edit gender\r\n");
		gender.setFocusable(false);
		gender.setBackground(new Color(255, 255, 0));
		panel_1.add(gender);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton editloc = new JButton("edit loc");
		editloc.setFocusable(false);
		editloc.setBackground(new Color(255, 255, 0));
		panel_1.add(editloc);
		editloc.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton editEmail = new JButton("edit Email");
		editEmail.setFocusable(false);
		editEmail.setBackground(new Color(255, 255, 0));
		panel_1.add(editEmail);
		editEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton editNumber = new JButton("   edit\r\n number");
		editNumber.setFocusable(false);
		editNumber.setBackground(new Color(255, 255, 0));
		panel_1.add(editNumber);
		editNumber.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton editBirth = new JButton("edit birth\r\n\r\n");
		panel_1.add(editBirth);
		editBirth.setFocusable(false);
		editBirth.setBackground(new Color(255, 255, 0));
		editBirth.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton editGroup = new JButton("edit group\r\n");
		panel_1.add(editGroup);
		editGroup.setFocusable(false);
		editGroup.setBackground(new Color(255, 255, 0));
		editGroup.setFont(new Font("Tahoma", Font.PLAIN, 19));
		JButton mog = new JButton("members of gp");
		panel_1.add(mog);
		mog.setFocusable(false);
		mog.setBackground(new Color(255, 255, 0));
		mog.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnNewButton_1 = new JButton("members of loc\r\n");
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(402, 16, 113, 168);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JButton ok = new JButton("ok");
		panel_2.add(ok);
		ok.setFocusable(false);
		ok.setBackground(new Color(255, 255, 0));
		ok.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton btnBack = new JButton("back");
		btnBack.setFocusable(false);
		panel_2.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEdit.setVisible(false);
				gui2.main(null);
			}
		});
		btnBack.setBackground(Color.YELLOW);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnFinish = new JButton("finish");
		panel_2.add(btnFinish);
		btnFinish.setFocusable(false);
		btnFinish.setBackground(new Color(255, 255, 0));
		btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JButton btnNewButton = new JButton("add new group\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(15, 426, 255, 65);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				gui4.main(null);

			}
		});

		JButton removeGroup = new JButton("remove group\r\n");
		removeGroup.setBounds(263, 427, 255, 64);
		contentPane.add(removeGroup);
		removeGroup.setFocusable(false);
		removeGroup.setBackground(new Color(255, 255, 0));
		removeGroup.setFont(new Font("Tahoma", Font.PLAIN, 18));

		/**
		 * now we make our contact list with check baxes
		 */
		for (int i = 0; i < members; i++) {
			JCheckBox cb = new JCheckBox(i + ") " + AddressBook.contactlist.get(i).getName());
			cb.setFocusable(false);
			cb.setBackground(new Color(0, 0, 0));
			cb.setForeground(new Color(255, 255, 0));
			cb.setFont(new Font("Tahoma", Font.PLAIN, 21));
			cb.setBounds(11, 63, 414, 63);

			panel.add(cb);
			/**
			 * this is edit section
			 */
			editName.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					label.setText("please insert your new name : ");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							label.setText("select your contact :");
							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {

									if (cb.isSelected()) {
										String name = tf.getText();// get the new name
										String s = cb.getText();// get the contact's row
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										c.editname(mark, name);
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});
						}
					});

				}
			});

			gender.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please insert your new gender : ");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {

									if (cb.isSelected()) {
										String gender = tf.getText();// get the new gender
										String s = cb.getText();// get the contacts's row
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										c.editgender(mark, gender);
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});
						}
					});

				}
			});
			editGroup.addActionListener(new ActionListener() {// in this method we can change the last groups name
				public void actionPerformed(ActionEvent arg0) {

					label.setText("please write your new group :");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							label.setText("select your contact :");

							cb.addActionListener(new ActionListener() {// select our contact
								public void actionPerformed(ActionEvent arg0) {
									if (cb.isSelected()) {
										String name = tf.getText();// new name
										String s = cb.getText();
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										gr.edit(mark, name);

										btnFinish.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												frmEdit.setVisible(false);
												gui3.main(null);
											}
										});

									}

								}
							});
						}
					});

				}
			});

			removeGroup.addActionListener(new ActionListener() {// in this method we remove the goups and make them
																// unsigned
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please select your contact: ");
					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							if (cb.isSelected()) {
								String s = cb.getText();
								String f = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								gr.remove(mark);
								frmEdit.setVisible(false);
								gui3.main(null);

							}
						}
					});
				}
			});
			mog.addActionListener(new ActionListener() {// this method show the members of groups
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please select your contact :");
					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (cb.isSelected()) {
								String s = cb.getText();
								String f = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								label_1.setText(String.valueOf(gr.membrsOfGp(gr.showGroup(mark))));// we send our group
																									// name to fanctin
																									// and then afrtet
																									// calculating we
																									// convert it to
																									// string
								btnFinish.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										frmEdit.setVisible(false);
										gui3.main(null);
									}
								});

							}
						}
					});

				}
			});

			editBirth.addActionListener(new ActionListener() {// this method edit birth date
				public void actionPerformed(ActionEvent arg0) {

					label.setText("please insert your new birthdate : ");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {

									if (cb.isSelected()) {
										String birth = tf.getText();
										String s = cb.getText();
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										c.editbirth(mark, birth);
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});
						}
					});

				}
			});

			editEmail.addActionListener(new ActionListener() {// this method edit email
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please insert your new email: ");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {

									if (cb.isSelected()) {
										String email = tf.getText();
										String s = cb.getText();
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										c.editemail(mark, email);
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});
						}
					});

				}
			});

			editNumber.addActionListener(new ActionListener() {// this method edit number
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please insert your new number: ");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {

									if (cb.isSelected()) {
										String numb = tf.getText();
										String s = cb.getText();
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										c.editnumber(mark, numb);
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});

						}
					});

				}
			});

			editloc.addActionListener(new ActionListener() {// in this method we edit the locatian
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please insert your new x,y :");

					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							label.setText("please select a contact :");
							cb.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									if (cb.isSelected()) {
										String name = tf.getText();
										String s = cb.getText();// get the contact row
										String f = "";
										for (int i = 0; s.charAt(i) != ')'; i++)
											f += s.charAt(i);
										int mark = Integer.parseInt(f);
										String x = "";
										String y = "";
										int i = 0;
										for (; name.charAt(i) != ','; i++)// now we fill our location with new x,y
											x += name.charAt(i);
										for (int j = i + 1; j < name.length(); j++)
											y += name.charAt(j);
										Location lc = new Location(x, y);
										AddressBook.contactlist.get(mark).location = lc.diagnoseLoc(lc.getR());
										frmEdit.setVisible(false);
										gui3.main(null);

									}
								}
							});

						}
					});

				}
			});

			btnNewButton_1.addActionListener(new ActionListener() {// in this method we earn members of location
				public void actionPerformed(ActionEvent arg0) {
					label.setText("please select a contact :");

					cb.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (cb.isSelected()) {
								String name;
								String s = cb.getText();
								String f = "";
								for (int i = 0; s.charAt(i) != ')'; i++)
									f += s.charAt(i);
								int mark = Integer.parseInt(f);
								name = AddressBook.contactlist.get(mark).location;// we send it to its function
								label_1.setText(String.valueOf(lc.membersOfLocation(name)));// after calculating we
																							// convert it
								btnFinish.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										frmEdit.setVisible(false);
										gui3.main(null);
									}
								});

							}
						}
					});

				}
			});

		}
		frmEdit.setVisible(true);
	}
}
