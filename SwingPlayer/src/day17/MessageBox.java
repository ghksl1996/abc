package day17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MessageBox extends JFrame  {
	public MessageBox(String title,String msg) {
		setTitle(title);
		setLayout(new FlowLayout());
		JButton closeBtn=new JButton("´Ý±â");
		JLabel lbl=new JLabel(msg);
		add(lbl);
		add(closeBtn);
	closeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); 
			}
		});
	   setSize(200,100);
	   setVisible(true);
		

	}

}
