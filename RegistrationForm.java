
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Dimension;
public class RegistrationForm extends JFrame implements ActionListener {
    JLabel lblFirstName, lblLastName, lblMobile, lblEmail, lblUsername, lblPassword;
    JTextField txtFirstName, txtLastName, txtMobile, txtEmail, txtUsername;
    JPasswordField txtPassword;
    JButton btnRegister, btnCancel;
    JLabel lblimage ;
    public RegistrationForm() {
    	getContentPane().setMaximumSize(new Dimension(889, 811));
        lblFirstName = new JLabel("Enter First Name:");
        lblFirstName.setBounds(53, 157, 113, 13);
        txtFirstName = new JTextField(20);
        txtFirstName.setBounds(197, 154, 166, 19);
        lblLastName = new JLabel("Enter Last Name:");
        lblLastName.setBounds(53, 180, 113, 19);
        lblMobile = new JLabel("Enter Mobile Number:");
        lblMobile.setBounds(37, 207, 129, 16);
        txtMobile = new JTextField(20);
        txtMobile.setBounds(197, 206, 166, 19);
        lblEmail = new JLabel("Enter Email ID:");
        lblEmail.setBounds(63, 232, 93, 13);
        txtEmail = new JTextField(20);
        txtEmail.setBounds(197, 229, 166, 19);
        lblUsername = new JLabel("Enter Username:");
        lblUsername.setBounds(56, 255, 100, 13);
        txtUsername = new JTextField(20);
        txtUsername.setBounds(197, 252, 166, 19);
        lblPassword = new JLabel("Enter Password:");
        lblPassword.setBounds(56, 278, 100, 13);
        txtPassword = new JPasswordField(20);
        txtPassword.setBounds(197, 275, 166, 19);
        btnRegister = new JButton("Register");
        btnRegister.setBounds(69, 313, 93, 21);
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(197, 313, 87, 21);
        
        lblimage = new JLabel();
        lblimage.setIcon(new ImageIcon("C:\\Users\\aditi\\Downloads\\download.jpeg"));
        lblimage.setBounds(97, 21, 203, 112);
        getContentPane().setLayout(null);
        getContentPane().add(lblFirstName);
        getContentPane().add(txtFirstName);
        getContentPane().add(lblLastName);
        getContentPane().add(lblMobile);
        getContentPane().add(txtMobile);
        getContentPane().add(lblEmail);
        getContentPane().add(txtEmail);
        getContentPane().add(lblUsername);
        getContentPane().add(txtUsername);
        getContentPane().add(lblPassword);
        getContentPane().add(txtPassword);
        txtLastName = new JTextField(20);
        txtLastName.setBounds(197, 180, 166, 19);
        getContentPane().add(txtLastName);
        getContentPane().add(btnRegister);
        getContentPane().add(btnCancel);
        getContentPane().add(lblimage);
        btnRegister.addActionListener(this);
        btnCancel.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new RegistrationForm();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegister) {
        	String fn = txtFirstName.getText();
        	String ln = txtLastName.getText();
        	String mb = txtMobile.getText();
        	String em = txtEmail.getText();
        	String un = txtUsername.getText();
        	String ps = new String(txtPassword.getPassword());
        	User user = new User(fn,ln,mb,em,un,ps);
        	this.dispose();
        	JOptionPane.showMessageDialog(this, "Registration Successfull!! Login Now!");
        	new LoginFrame(user);
        }
        else if(e.getSource()==btnCancel){
        	this.dispose();
        }
    }
}
