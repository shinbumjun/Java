package test.main;


import java.awt.BorderLayout; //new BorderLayout()
import java.awt.event.ActionEvent; //test 오버라이드
import java.awt.event.ActionListener; //implements ActionListener 

import javax.swing.JButton; //new JButton("알림 띄우기")
import javax.swing.JFrame; //extends JFrame 상속
import javax.swing.JOptionPane; //JOptionPane.showMessageDialog(this, "알림입니다~!");

public class test extends JFrame implements ActionListener {

	//생성자
	public test(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//(Component parentComponent, Object message)
		JOptionPane.showMessageDialog(this, "알림입니다~!");
		
		
		   
	}
	
}	
