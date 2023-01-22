package mailManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileSystemView;

public class Interface extends JFrame implements ActionListener{
	
	JPanel panelDroit;
	
	JButton button1;  //new message
	JButton button2;  //inbox
	JButton button3;  //sent
	JButton button4;  //archived

	Border border = BorderFactory.createLineBorder(new Color(0X96577F),2);
	Border border2 = BorderFactory.createLineBorder((Color.WHITE),1);
	
	JMenuBar menuBar;
	JMenu logMenu;
	JMenu advancedMenu;
	JMenu aboutMenu;
	
	JMenuItem logItem;
	JMenuItem exitItem;
	
	JMenuItem multipleItem;
	JMenuItem autoItem;
	JMenuItem grpItem;
	JMenuItem mobileItem;
	JMenuItem autoSend;

	JMenuItem aboutItem;
	
	NewMsg newMsg;
	AutoEmail autoEmail;
	GrpMsg grpMsg;
	Inbox inbox;
	SentMsg sentMsg;
	ArchivedMsg archivedMsg;
	MobileCom mobileCom;
	AutoClassi autoClassification;
	AboutProject aboutProject;
	
	public Interface(){
		newMsg = new NewMsg();
		autoEmail = new AutoEmail();
		grpMsg = new GrpMsg();
		inbox= new Inbox();
		sentMsg = new SentMsg();
		archivedMsg = new ArchivedMsg();
		mobileCom = new MobileCom();
		autoClassification = new AutoClassi();
		aboutProject = new AboutProject();
		
		Font Font1= new Font("Comic Sans MS",Font.PLAIN,16);
		Font Font2= new Font("Comic Sans MS",Font.BOLD,17);
		Font Font3= new Font("Comic Sans MS",Font.BOLD,19);
		
		this.setSize(700,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Mail Manager");
		this.setResizable(false);
		this.setLayout(null);
		
		JPanel panelGauche= new JPanel();
		panelGauche.setBounds(0,0,180,500);
		//panelGauche.setBackground(Color.GRAY);
		
		JPanel panelgauche= new JPanel();
		panelgauche.setBounds(0,0,180,500);
		panelgauche.setBackground(Color.WHITE);
		
		panelDroit= new JPanel();
		panelDroit.setBounds(180,0, 520, 500);
		panelDroit.setLayout(null);
		//panelDroit.setBackground(Color.BLACK);
		//panelDroit.setBorder();
		
		GridLayout grid = new GridLayout(9,1,0,0);
		panelgauche.setLayout(grid);
		
		menuBar= new JMenuBar();
		
		logMenu = new JMenu("Log");
		logItem = new JMenuItem("Logout");
		exitItem = new JMenuItem("Exit");
		logMenu.add(logItem);
		logMenu.add(exitItem);
		logItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		
		advancedMenu = new JMenu("Advanced function");
		autoItem =new JMenuItem("Atomomatic email classification");
		grpItem = new JMenuItem("Send grouped");
		autoSend = new JMenuItem("Automatic sending");
		mobileItem = new JMenuItem("Mobile communication");
		
		//archivedItem = new JMenuItem("Archive");
		//searchItem = new JMenuItem("Search");
		//multipleItem = new JMenuItem("Multiple box management");
		//advancedMenu.add(searchItem );
		//advancedMenu.add(archivedItem );
		
		advancedMenu.add(grpItem);
		advancedMenu.add(autoSend);
		advancedMenu.add(mobileItem);
		advancedMenu.add(autoItem);
		
		//advancedMenu.add(multipleItem);
		//archivedItem.addActionListener(this);
		//searchItem.addActionListener(this);
		//multipleItem.addActionListener(this);
		
		autoItem.addActionListener(this);
		grpItem.addActionListener(this);
		mobileItem.addActionListener(this);
		autoSend.addActionListener(this);
		
		aboutMenu = new JMenu("About");
		aboutItem =new JMenuItem("About");
		aboutMenu.add(aboutItem);
		aboutItem.addActionListener(this);
		
		menuBar.add(logMenu);
		menuBar.add(advancedMenu);
		menuBar.add(aboutMenu);
		
		
		menuBar.setBounds(0,0,700,15);
		this.setJMenuBar(menuBar);
		
		button1 = new JButton("New Message");
		button2 = new JButton("Inbox");
		button3 = new JButton("Sent");
		button4 = new JButton("Archived");
		
		button1.setBackground(new Color(0X96577F));		//New Message
		button2.setBackground(Color.white);		//Inbox
		button3.setBackground(Color.white);		//Sent
		button4.setBackground(Color.white);		//Archived
		
		
		
		button1.setForeground(Color.white);     //New Message
		button2.setForeground(new Color(0X96577F));     //Inbox
		button3.setForeground(new Color(0X96577F));		//Sent
		button4.setForeground(new Color(0X96577F));		//Archived
		
		button1.setFocusable(false);		//New Message
		button2.setFocusable(false);		//Inbox
		button3.setFocusable(false);		//Sent
		button4.setFocusable(false);		//Archived
		
		button1.setFont(Font2);		//New Message
		button2.setFont(Font1);		//Inbox
		button3.setFont(Font1);		//Sent
		button4.setFont(Font1);		//Archived
		button1.setBorder(border);		//New Message
		
		
		button1.addActionListener(this);		//New Message
		button2.addActionListener(this);		//Inbox
		button3.addActionListener(this);		//Sent
		button4.addActionListener(this);		//Archived
		//button5.addActionListener(this);
		//button6.addActionListener(this);
		
		
		
		panelgauche.add(button2);		//Inbox
		panelgauche.add(button3);		//Sent
		panelgauche.add(button4);		//Archived
		panelgauche.add(button1);		//New Message
		
		this.add(panelgauche);
		this.add(panelGauche);
		
		
		panelDroit=inbox.panelDroit;
		this.add(panelDroit);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logItem) {
			System.out.println("loging out");
		}
		else if(e.getSource()==exitItem) {
			System.out.println("exiting");
		}
		
		else if(e.getSource()==multipleItem) {
			System.out.println("in progress");
		}
		else if(e.getSource()==button1) {
			this.getContentPane().remove(panelDroit);
			panelDroit = newMsg.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
			
			//	this.add(newMsg.panelDroit);
			//this.setContentPane(newMsg.panelDroit);
			//	invalidate();
			//validate();
			
		}
		else if(e.getSource()==button2) {
			this.getContentPane().remove(panelDroit);
			panelDroit=inbox.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
			
			//this.getContentPane().remove(panelDroit);
			//this.getContentPane().revalidate();
			//this.getContentPane().repaint();
			
		}
		else if(e.getSource()==button3) {
			this.getContentPane().remove(panelDroit);
			panelDroit=sentMsg.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
		else if(e.getSource()==button4) {
			this.getContentPane().remove(panelDroit);
			panelDroit=archivedMsg.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
		else if(e.getSource()==autoSend) {
			this.getContentPane().remove(panelDroit);
			panelDroit=autoEmail.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
			
			//this.add(newMsg.panelDroit);
			//this.setContentPane(autoEmail.panelDroit);
			//	invalidate();
			//	validate();
		}
		
		else if(e.getSource()==grpItem) {
			this.getContentPane().remove(panelDroit);
			panelDroit=grpMsg.panelDroit;
			this.getContentPane().add(panelDroit);	
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
		
		else if(e.getSource()==mobileItem) {
			this.getContentPane().remove(panelDroit);
			panelDroit=mobileCom.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
		
		else if(e.getSource()==autoItem) {
			this.getContentPane().remove(panelDroit);
			panelDroit=autoClassification.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
		else if(e.getSource()==aboutItem) {
			this.getContentPane().remove(panelDroit);
			panelDroit=aboutProject.panelDroit;
			this.getContentPane().add(panelDroit);
			this.getContentPane().revalidate();
			this.getContentPane().repaint();
		}
//		else if(e.getSource()==button5) {
//			System.out.println("sending");
//		}
//		else if(e.getSource()==button6) {
//			
//			 JFileChooser choose = new JFileChooser(
//				        FileSystemView
//				        .getFileSystemView()
//				        .getHomeDirectory()
//				    );
//				    // Ouvrez le fichier
//				    int res = choose.showOpenDialog(null);
//				    // Enregistrez le fichier
//				    // int res = choose.showSaveDialog(null);
//				    if (res == JFileChooser.APPROVE_OPTION) {
//				      File file = choose.getSelectedFile();
//				      System.out.println(file.getAbsolutePath());
//				    }}
		
		
	}
	
}
