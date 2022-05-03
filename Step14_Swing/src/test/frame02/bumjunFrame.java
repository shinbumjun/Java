package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//JFrame 상속 받기 위해서는 import
//Jbutton 사용하기 위해서 import
//implements ActionListener하기 위해 import
//bumjunFrame 에러 잡기 위해서 import java.awt.event.ActionEvent; @Override 생성
//@Override - JOptionPane 에러를 잡기위해 import javax.swing.JOptionPane;
public class bumjunFrame extends JFrame implements ActionListener{
	
    public bumjunFrame(String title) {
    	
    	//부모 생성자에게로 전달
    	//범준프레임이 제목으로 나타남
    	super(title);
    	
    	//레이아웃 법칙 지정하기
    	//this는 생략가능
    	//Class FlowLayout의 Interfaces는 LayoutManager, Serializable이다
    	setLayout(new FlowLayout()); // LayoutManager manager = new FlowLayout();
    	//버튼 만들어서
    	JButton runBtn=new JButton("달리기");
    	//버튼을 프레임에 추가하기
    	add(runBtn);
    	
    	//implements ActionListener
    	//액션리스너 인터페이스를 구현
    	runBtn.addActionListener(this);

    	
    }
	
    //static이라는 같은 공간에 있기 때문
	public static void main(String[] args) {
		
		bumjunFrame f = new bumjunFrame("범준프레임");
		//프레임
		f.setBounds(100, 100, 500, 300);
		f.setVisible(true);
		
		//창을 닫았을때 프로세스도 종료되게 하려면 
		//JFrame 클래스의 상수값  EXIT_ON_CLOSE = 3
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "달려 달려!!");
	}
}
