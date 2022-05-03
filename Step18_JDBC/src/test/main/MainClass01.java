package test.main;

import java.sql.Connection; //컬렉션 객체의 참조값
import java.sql.DriverManager; //DriverManager 스태틱 메소드를 활용해서 오라클을 받음
import java.sql.PreparedStatement; //sql문 대신 실행해주는, 참조값
import java.sql.ResultSet; //칼럼과 로우, 결과 데이터가 들어 있음, 참조값

/*
 *  Java DataBase Connectivity (JDBC)
 *  
 *  - oracle 에 연결하기 위해서는 드라이버가 들어 있는 ojdbc6.jar 파일이 필요하다 
 *  - 프로젝트 설정에서 ojdbc6.jar 를 사용할 준비를 해야한다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결 객체를 담을 지역변수
		Connection conn=null; //*컬렉션 객체 참조값 잘 들어와야함
		try {
			//*드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //다운 받은 오라클, 1
			
			//*접속할 DB 정보
			String url="jdbc:oracle:thin:@localhost:1521:xe"; 
			
			//*접속하고 Connection 객체의 참조값 얻어오기	
			conn=DriverManager.getConnection(url, "scott", "tiger"); //에러가 발생하면 catch로 이동
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		} //여기까지 코드는 그대로 사용
		
		
		//*Member 테이블의 내용을 select 해서 console  에 출력해보기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num,name,addr FROM member ORDER BY num ASC";
			//sql 문을 대신 실행해주는 PreparedStatement 객체의 참조값 얻어오기 
			pstmt=conn.prepareStatement(sql); //3
			//*SELECT 문 수행하고 결과 row 를 ResultSet 객체로 받아오기 
			rs=pstmt.executeQuery(); //업데이트, 델리트 등 사용, 3
			
			//rs.next() 메소드가 false 를 리턴할때 까지 while 반복문 돌기 
			while(rs.next()) { //*cursor를 한칸씩 내리면서 데이터가 있으면 true, 3
				//*현재 커서가 위치한 곳에서 num 칼럼의 값을 정수로 얻어내기
				int num=rs.getInt("num"); //3
				//현재 커서가 위치한 곳에서 name 칼럼의 값을 문자로 얻어내기 
				String name=rs.getString("name");
				//현재 커서가 위치한 곳에서 addr 칼럼의 값을 문자로 얻어내기 
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr); //System.out 2, out.println 3
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}






