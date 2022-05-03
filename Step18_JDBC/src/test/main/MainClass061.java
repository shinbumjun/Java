package test.main;

//각각의 임폴트의 역활과 사용법
import java.util.Scanner; //검색할 번호 입력받음

import java.sql.Connection; 
import java.sql.PreparedStatement; //PreparedStatement(String sql) sql 대신 실행해주는
import java.sql.ResultSet; 

import test.util.DBConnect; //conn=new DBConnect().getConn();



public class MainClass061 {
     public static void main(String[] args) {
    	 
    	 //콘솔창으로 부터 입력 받을 객체 생성 : Scanner
		 Scanner scan=new Scanner(System.in);
		 System.out.println("몇번째 회원을 검색하시겠습니까?");
		 int num=scan.nextInt();
		 
		 //필요한 객체를 담을 지역변수 미리 만들기
		 Connection conn=null; 
		 PreparedStatement pstmt=null; 
		 ResultSet rs=null;
		 
		 try {
			 //*Connection 객체의 참조값 얻어오기
			 conn=new DBConnect().getConn();
			 
			 //실행할 sql문의 뼈대 준비하기, 미완성
			 String sql="SELECT name,addr FROM member WHERE num=?";
			 
			 //실행할 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어오기
			 pstmt=conn.prepareStatement(sql);
			 
			 //미완성인 sql문을 완성 시키기
			 pstmt.setInt(1, num);
			 
			 //SELECT문 수행하고 결과 값을 ResultSet으로 받아오기
			 //executeQuery()와 execute Update() 주로 사용
			 rs=pstmt.executeQuery();
			 
			 if(rs.next()) {
				 //커서가 위치한 곳의 데이터 추출하기
				 String name=rs.getString("name");
				 String addr=rs.getString("addr");
				 System.out.println("번호:"+num+", 이름:"+name+", 주소:"+addr);
				 
			 }else {
				System.out.println(num+" 번 회원은 존재하지 않습니다.");
			 }		
			 
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				//열어준 역순으로
				if(rs!=null)rs.close(); 
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}			
		}
	}
}

















