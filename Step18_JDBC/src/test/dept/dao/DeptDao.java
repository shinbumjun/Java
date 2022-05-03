package test.dept.dao;

import java.sql.Connection; //객체의 참조값 오라클 불러오기, Connection conn
import java.sql.PreparedStatement; //sql실행 ,PreparedStatement pstmt
                                   //메소드 - executeQuery()
import java.sql.ResultSet; //결과(칼럼,로우), ResultSet rs
import java.util.ArrayList; //new ArrayList
import java.util.List; //List<DeptDao>

import test.dept.dto.DeptDto; //DeptDto
import test.util.DBConnect; //new DBConnect().getConn(); -> Connection conn
                            //링크 메소드

//부서정보를 추가하는 메소드(insert)
//부서정보를 수정하는 메소드(update)
//부서정보를 삭제하는 메소드(delete)
//부서 하나의 정보를 리턴하는 메소드(select)
//부서의 목록을 리턴하는 메소드(selectAll)
public class DeptDao {
	//모든 회원의 정보를 SELECT 해서 리턴하는 메소드, selectAll()
	public List<DeptDto> selectAll(){
		//MemberDto 객체를 누적시킬 ArrayList 객체 생성하기 
		List<DeptDto> list=new ArrayList<>();
		Connection conn=null; //객체 참조값(오라클 불러오기)
		PreparedStatement pstmt=null; //sql실행
		ResultSet rs=null; //결과(칼럼,로우)
		try {
			conn=new DBConnect().getConn();
			//실행할 SELECT 문 작성
			String sql="SELECT num,name,addr"
					+ " FROM member"
					+ " ORDER BY num DESC";
			pstmt=conn.prepareStatement(sql);
			//? 에 바인딩 할게 있으면 하고 아님 말고
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//select 된 row 하나의 정보를 MemberDto 객체를 생성해서 담고 
				DeptDto dto=new DeptDto(); //MemberDto
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//새로 생성한 MemberDto 객체의 참조값을 ArrayList 객체에 누적시킨다.
				list.add(dto);
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
		
		return list;
	}
	
	//회원 한명의 정보를 SELECT 해서 리턴하는 메소드, int num
	public DeptDto select(int num) {
		//회원한명의 정보를 담고 있는 MemberDto 객체를 담을 지역변수 만들기 
		DeptDto dto=null; //MemberDto
		//필요한 객체의 참조값을 담을 지역변수 만들기 
		Connection conn=null; //객체 참조값(오라클 불러오기)
		PreparedStatement pstmt=null; //sql실행
		ResultSet rs=null; //결과(칼럼,로우)
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT name,addr FROM member"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setInt(1, num);
			//SELECT 문 수행하고 결과를 ResultSet 으로 받기
			rs=pstmt.executeQuery();
			if(rs.next()) {//만일 select 된 row 가 있다면
				//결과를 MemberDto 객체를 생성해서 담는다.
				dto=new DeptDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
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
		
		return dto;
	}
	
	
	//1. 회원 한명의 정보를 저장하는 메소드를 만들어 보세요.
	// 메소드명 : insert
	// 리턴 type : 알아서
	// 메소드에 전달하는 인자의 type : MemberDto //name, addr
	public boolean insert(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0; //0보다 크다 작냐에 따라
		try {
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member"
					+ " (num,name,addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//INSERT 문 수행하기  ( 1개의 row 가 추가 되었으므로 1 이 러턴된다)
			flag=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	
	}
	//2. 회원 한명의 정보룰 수정하는 메소드를 만들어 보세요.
	// 메소드명 : update
	// 리턴 type : 알아서
	// 메소드에 전달하는 인자의 type : MemberDto 
	public boolean update(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql 문 작성
			String sql="UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값을 바인딩 할게 있으면 여기서 한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			flag=pstmt.executeUpdate(); //0보다 크냐 작냐에 따라
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
			
		
	}
	
	
	//회원 한명의 정보를 삭제하는 메소드 delete
	public boolean delete(int num) {
		
		//필요한 참조값을 담을 지역 변수 미리 만들고 초기화 하기 
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			//실행할 sql 문의 뼈대 준비하기
			String sql="DELETE FROM member WHERE num=?";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			//sql 문 실행하고 변화된 row  의 갯수 리턴 받기
			flag=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//마무리 작업
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}	
	}
}
