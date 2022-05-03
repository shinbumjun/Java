package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

/*
 *  member 테이블에 있는 회원 목록을 SELECT 하고  
 *  num 에 대해서 오름차순 정렬을 해서
 *  List<MemberDto> 형태로 만들어 보세요.
 */
public class MainClass081 {
   
   public static void main(String[] args) {
      //MemberDto 객체의 참조값을 저장할 ArrayList 객체 생성 
      List<MemberDto> list=new ArrayList<>();
      
      //필요한 객체를 담을 지역변수 미리 만들기
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         //Connection 객체 얻어오기 
         conn=new DBConnect().getConn();
         //실행할 select 문을 미리 만들기
         String sql="SELECT num, name, addr"
               + " FROM member"
               + " ORDER BY num ASC";
         //PreparedStatement 의 참조값 
         pstmt=conn.prepareStatement(sql);
         //SELECT 문 수행하고 결과를 ResultSet 객체에 담아오기
         rs=pstmt.executeQuery();
         //반복문 돌면서 ResultSet 에 담긴 내용 추출
         while(rs.next()) {
            int num=rs.getInt("num");
            String name=rs.getString("name");
            String addr=rs.getString("addr");
            //MemberDto 객체에 회원 한명의 정보를 담고 
            MemberDto dto=new MemberDto();
            dto.setNum(rs.getInt("num"));
            dto.setName(name);
            dto.setAddr(addr);
            //MemberDto 객체의 참조값을 ArrayList 객체에 누적 시키기 
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
   }
}
