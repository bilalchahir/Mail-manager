package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import mailManager.Interface;


public class InterfaceLogin extends JFrame implements ActionListener{
	JButton signButton;
	JTextField emailField;
	JPasswordField passwordField;
	JLabel email;
	JLabel password;
	private Bdd base_de_donnee;
	InterfaceLogin(){
		
		Font Font1= new Font("Cooper Black",Font.ITALIC,23);
		Font Font2= new Font("Comic Sans MS",Font.PLAIN,16);
		Font Font3= new Font("Comic Sans MS",Font.PLAIN,15);
		Font Font4= new Font("Times New Roman",Font.BOLD,14);
		Border border = BorderFactory.createLineBorder(new Color(0X96577F),2);		
		
		this.setSize(470,480);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Login");
		this.setResizable(false);
		this.setLayout(null);
		//this.setBackground(Color.white);
		//this.getContentPane().setBackground(new Color(0X909699));
		//CD9B9B  21,27,84
		JPanel panel= new JPanel();
		panel.setBounds(25, 80, 400, 320);
		//panel.setBackground(new Color(21,27,84));
		panel.setBackground(new Color(0,0,0,40));
		panel.setLayout(null);
		
		JLabel msg=new JLabel("Sign in with your account");
		msg.setBounds(80,30,360,30);
		msg.setFont(Font1);
		msg.setForeground(new Color(0X96577F));
		//0XC6E2FF
		
		email = new JLabel("Email:");
		email.setBounds(75,20,360,30);
		email.setFont(Font2);
		email.setForeground(new Color(0XFFFFFF));

	    password = new JLabel("Password:");
	    password.setBounds(75,90,360,80);
	    password.setFont(Font2);
	    password.setForeground(new Color(0XFFFFFF));
	    
	    emailField = new JTextField();
	    emailField.setBounds(70,60,260,30);
	    emailField.setFont(Font3);
	    emailField.setBorder(border);
	    emailField.setBackground(new Color(0XFFFFFF));
	    emailField.setForeground(new Color(0,0,0));
	    emailField.setCaretColor(new Color(0X448B95));
	    
		passwordField = new JPasswordField();
		passwordField.setBounds(70,150,260,30);
	    passwordField.setFont(Font3);
	    passwordField.setBorder(border);
	    passwordField.setBackground(new Color(0XFFFFFF));
	    passwordField.setForeground(new Color(0,0,0));
	    passwordField.setCaretColor(new Color(0X448B95));
	    
	    
	    signButton=new JButton("Sign In");
	    signButton.setBounds(70,230,260,30);
	    signButton.setBackground(new Color(0X96577F));
	    signButton.setFont(Font3);
	    signButton.setForeground(new Color(0XFFFFFF));
	    signButton.setFocusable(false);
	    signButton.addActionListener(this);
	    signButton.setBorder(border);
	    
	    JLabel passforgot = new JLabel("Password forgot");
	    passforgot.setBounds(270,270,200,30);
	    passforgot.setForeground(new Color(0X96577F));
	    passforgot.setFont(Font4);
	    
	    passforgot.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent s) {
	    		System.out.println("did you forgot your password!");
	    		//PasswordForgotten passwordFrgt= new PasswordForgotten();
	    	}
		});
	    
	    
	    JLabel createAcc = new JLabel("Create Account");
	    createAcc.setBounds(40,270,200,30);
	    createAcc.setForeground(new Color(0X96577F));
	    createAcc.setFont(Font4);
	    
	    createAcc.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent s) {
	    		System.out.println("Do you wanna create new account!");
	    		//CreateAccount createAccount = new CreateAccount();
	    	}
		});
	    
	    
	    this.add(msg);
		this.add(panel);
		panel.add(email);
		panel.add(password);
		panel.add(emailField);
		panel.add(passwordField);
		panel.add(signButton);
		panel.add(passforgot);
		panel.add(createAcc);
		
		
		this.setVisible(true);
	}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if ( (JButton)e.getSource() == signButton) {
			new Interface();
		}
		}

}
