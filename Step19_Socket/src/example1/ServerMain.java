package example1;

import java.net.ServerSocket; //처음보는 객체
import java.net.Socket; //처음보는 객체

public class ServerMain {
	
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			//*5000 번 통신 port 를 열고 클라이언트의 접속을 기다린다.
			serverSocket=new ServerSocket(5000);
			/*
			 *  .accept() 메소드는 클라이언트가 접속을 해야지 리턴하는 메소드이다.
			 *  클라이언트가 접속을 해오면 해당 클라이언트와 연결된 Socket 객체의
			 *  참조값을 리턴한다. 
			 */
			while(true) {
				System.out.println("클라이언트의 Socket 접속을 기다립니다...");
				Socket socket=serverSocket.accept(); //메소드 호출, 누군가 접속을하면 리턴
				System.out.println("클라이언트가 접속을 했습니다.");
				String ip=socket.getInetAddress().getHostAddress(); //ip주소
				System.out.println("접속한 클라이언트의 ip 주소:"+ip);
				socket.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("ServerMain main 메소드가 종료 됩니다.");
	}
}





