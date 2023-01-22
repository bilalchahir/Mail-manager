package mailManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inbox {

	JPanel panelDroit;
	JLabel text;
	Font font= new Font("Comic Sans MS",Font.BOLD,40);
	Inbox(){
		panelDroit = new JPanel();
		panelDroit.setBounds(180,0, 520, 500);
		panelDroit.setLayout(null);
		panelDroit.setBackground(Color.gray);
		
		text = new JLabel("Inbox");
		text.setFont(font);
		text.setBounds(200,160,200,50);
		text.setForeground(Color.WHITE);
		
		panelDroit.add(text);
		
	}
}
