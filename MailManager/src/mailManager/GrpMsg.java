package mailManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GrpMsg {

	JButton sendButton;
	JButton fileButton;
	
	JLabel email;
	JLabel to;
	JLabel subject;
	JLabel msg;
	
	
	//String[] emails= {"email1","email2","email3","email4","email5"};
	//JComboBox To;
	JTextField To;
	JTextField Subject;
	JTextArea Msg;
	JPanel panelDroit;
	GrpMsg(){

		
	Border border = BorderFactory.createLineBorder(new Color(0X96577F),2);
	Border border2 = BorderFactory.createLineBorder((Color.WHITE),2);
	Font Font3= new Font("Comic Sans MS",Font.BOLD,19);
	
	sendButton = new JButton("Send");
	fileButton = new JButton("file");
	
	email= new JLabel("New Email");
	to= new JLabel("To :");
	subject= new JLabel("Subject :");
	msg= new JLabel("Message :");
	
	//To = new JComboBox(emails);
	To=new JTextField();
	Subject=new JTextField();
	Msg=new JTextArea();
	
	panelDroit= new JPanel();
	panelDroit.setBounds(180,0, 520, 500);
	panelDroit.setLayout(null);
	
	email.setBounds(220,5,100,80);
	email.setFont(Font3);
	email.setForeground(new Color(0X96577F));
	
	to.setBounds(40,60,100,80);
	subject.setBounds(40,100,100,80);
	msg.setBounds(40,140,100,80);
	
	To.setBounds(130,90,320,25);
	To.setBorder(border);
	Subject.setBounds(130,130,320,25);
	Subject.setBorder(border);
	Msg.setBounds(130,170,320,200);
	Msg.setBorder(border);
	
	sendButton.setBounds(370,375,80,25);
	fileButton.setBounds(130,375,53,25);	
	
	sendButton.setBackground(new Color(0X96577F));
	fileButton.setBackground(new Color(0X96577F));
	sendButton.setForeground(Color.white);
	fileButton.setForeground(Color.white);
	
	sendButton.setFocusable(false);
	fileButton.setFocusable(false);
	sendButton.setBorder(border2);
	fileButton.setBorder(border2);
	
	panelDroit.add(sendButton);
	panelDroit.add(fileButton);
	
	panelDroit.add(email);
	panelDroit.add(to);
	panelDroit.add(subject);
	panelDroit.add(msg);
	panelDroit.add(To);
	panelDroit.add(Subject);
	panelDroit.add(Msg);
	
	
}
}
