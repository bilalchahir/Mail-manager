package mailManager;

import java.awt.Color;
import java.awt.Font;



import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AutoEmail {

		JButton sendButton;
		JButton fileButton;
		
		JLabel email;
		JLabel to;
		JLabel subject;
		JLabel msg;
		JLabel set;
		
		JTextField Date;
		JTextField Time;
		JTextField To;
		JTextField Subject;
		JTextArea Msg;
		
		JPanel panelDroit;
		
		AutoEmail(){

				Border border = BorderFactory.createLineBorder(new Color(0X96577F),2);
				Border border2 = BorderFactory.createLineBorder((Color.WHITE),2);
				Font Font3= new Font("Comic Sans MS",Font.BOLD,19);
				
				sendButton = new JButton("Send");
				fileButton = new JButton("file");
				
				set = new JLabel("Set :");
				email= new JLabel("Automatic Email");
				to= new JLabel("To :");
				subject= new JLabel("Subject :");
				msg= new JLabel("Message :");

				long millis = System.currentTimeMillis();
				java.sql.Date date = new java.sql.Date(millis);
				String setDate = date + "";
				
				String setTime = java.time.LocalTime.now() + "";
				
				Date = new JTextField(setDate);
				Time = new JTextField(setTime);
				To=new JTextField();
				Subject=new JTextField();
				Msg=new JTextArea();
				
				
				panelDroit= new JPanel();
				panelDroit.setBounds(180,0, 520, 500);
				panelDroit.setLayout(null);
				
				email.setBounds(200,0,300,80);
				email.setFont(Font3);
				email.setForeground(new Color(0X96577F));
				
				set.setBounds(40,30,100,100);
				to.setBounds(40,80,100,80);
				subject.setBounds(40,120,100,80);
				msg.setBounds(40,160,100,80);
				
				Date.setBounds(130,70,120,25);
				Date.setBorder(border);
				Time.setBounds(330,70,120,25);
				Time.setBorder(border);
				To.setBounds(130,110,320,25);
				To.setBorder(border);
				Subject.setBounds(130,150,320,25);
				Subject.setBorder(border);
				Msg.setBounds(130,190,320,200);
				Msg.setBorder(border);
				
				sendButton.setBounds(370,395,80,25);
				fileButton.setBounds(130,395,53,25);	
				
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
				panelDroit.add(set);
				panelDroit.add(Date);
				panelDroit.add(Time);
				panelDroit.add(to);
				panelDroit.add(subject);
				panelDroit.add(msg);
				panelDroit.add(To);
				panelDroit.add(Subject);
				panelDroit.add(Msg);
				
				
			
		}
		
	}

