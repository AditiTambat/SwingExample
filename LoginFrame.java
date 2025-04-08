 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
 
public class LoginFrame extends JFrame implements ActionListener {
	JLabel lblusername, lblpassword;
	JTextField txtusername;
	JPasswordField txtpassword;
	JButton btnlogin, btncancel, btnregister;
	JLabel lblimage ;
	User user;
	public LoginFrame(User user) {
		this.user = user;
		lblusername = new JLabel("Enter user Name ");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblusername.setBounds(44, 124, 130, 26);
		lblpassword = new JLabel("Enter Password ");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblpassword.setBounds(44, 160, 119, 19);
		txtusername = new JTextField(20);
		txtusername.setBounds(173, 124, 176, 26);
		txtpassword = new JPasswordField(20);
		txtpassword.setBounds(173, 158, 176, 26);
		btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnlogin.setBounds(44, 202, 85, 26);
		btncancel = new JButton("Cancel");
		btncancel.setBackground(new Color(240, 240, 240));
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btncancel.setBounds(139, 199, 96, 32);
		lblimage = new JLabel();
		lblimage.setIcon(new ImageIcon("C:\\Users\\aditi\\Downloads\\download.png"));
		lblimage.setSize(204, 104);
		lblimage.setLocation(80, 10);
		btnregister = new JButton("Register now");
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnregister.setSize(131, 32);
		btnregister.setLocation(245, 199);
		
		getContentPane().setLayout(null);
		
		getContentPane().add(btnregister);
		getContentPane().add(lblimage);
		getContentPane().add(lblusername);
		getContentPane().add(txtusername);
		getContentPane().add(lblpassword);
		getContentPane().add(txtpassword);
		getContentPane().add(btnlogin);
		getContentPane().add(btncancel);
		// Register the button for event handling
		btnlogin.addActionListener(this);
		btncancel.addActionListener(this);
		btnregister.addActionListener(this);
		setSize(400,300);
		setVisible(true);
		setTitle("My Login Frame ");
		setLocationRelativeTo(null);
	}

	 public static void main(String[] args) {
		new LoginFrame(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnlogin) {
			String un = txtusername.getText();
			String ps = new String(txtpassword.getPassword());
			if(un.equals(user.username) && ps.equals(user.password)) {
				JOptionPane.showMessageDialog(this, "Login Successfull!");
			}
			else {
				//System.out.println("Invalid");
				JOptionPane.showMessageDialog(this, "Invalid username or password");
			}
		}
		else if(e.getSource() == btncancel) {
			this.dispose();
		}
		else if(e.getSource() == btnregister) {
			new RegistrationForm();
		}
	}
}