package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.DownloadTask;
import test.mypac.SubThread;

public class MainFrame05 extends JFrame implements ActionListener{
	//생성자
	public MainFrame05(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다.!!!");
		//Runnalbe 인터페이스 type 의 참조값을 얻어내서 
		Runnable downTask=new DownloadTask();
		
		Thread t=new Thread(downTask); //run 타입을 전달
		t.start();
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	
	public static void main(String[] args) {
		MainFrame05 f=new MainFrame05("메인 프레임02");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}






