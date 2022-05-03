package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.DownloadTask;
import test.mypac.SubThread;

public class MainFrame09 extends JFrame implements ActionListener{
	//생성자
	public MainFrame09(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("시작하기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		new Thread(()->{
			for(int i=0; i<20; i++) {
				System.out.println("안녕하세요");
				try {
		               Thread.sleep(1000);
		            } catch (InterruptedException e) {
		               e.printStackTrace();
		            }
		         }

		}).start(); //Thread 시작, Thread() <- Runnable interface type 전달
		
		new Thread(()->{
			for(int i=0; i<20; i++) {
				System.out.println("반갑습니다");
				try {
		               Thread.sleep(5000);
		            } catch (InterruptedException e) {
		               // TODO Auto-generated catch block
		               e.printStackTrace();
		            }
		         }
		}).start(); //Thread 시작, Thread() <- Runnable interface type 전달
		
	}
	
	
	
	public static void main(String[] args) {
		MainFrame09 f=new MainFrame09("메인 프레임09");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
