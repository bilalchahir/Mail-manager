package mailManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutProject {
	JPanel panelDroit ;
	JLabel text ;
	Font font= new Font("Comic Sans MS",Font.BOLD,20);
	
	public AboutProject() {
		panelDroit = new JPanel();
		panelDroit.setBounds(180,0, 520, 500);
		panelDroit.setLayout(null);
		text = new JLabel("Entreprise Mail Manager");
		text.setFont(font);
		text.setBounds(130,160,300,50);
		text.setForeground(new Color(0X96577F));
		
		panelDroit.add(text);
		
	}
}
