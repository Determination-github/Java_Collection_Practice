package address_book.module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MDBConnection {
	
	
	//물리적으로 떨어져 있는 오라클 서버에 연결통로를 확보
	Connection con = null;
	//자바코드에서 작성한 select문을 전달함
	Statement  stmt = null;
	//오라클에게 전달된 select문을 처리한 결과를 꺼내기 위해서 커서를 조작해야 하는데
	//그 때 커서를 이동하는데 필요한 메소드를 선언한 인터페이스
	ResultSet  rs   = null;
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String _URL    = "jdbc:oracle:thin:@127.0.0.1:1522:ORCL"; //나중에 로컬로 바꾸기
	public static final String _USER   = "scott";
	public static final String _PW     = "tiger";
	private static MDBConnection mdbc = null;
	
	public static MDBConnection getInstance() { //객체 주입
		// 싱글톤 패턴으로 이 메서드가 없으면
		// 계속해서 인스턴스가 생성됨
		// getinstance를 사용하면
		// 하나의 인스턴스를 계속해서 사용할 수 있음
		if(mdbc == null) {
			mdbc = new MDBConnection();
		}
		return mdbc;
	}
	
	public Connection getConnection() { //인터페이스 주입
		try {
			Class.forName(_DRIVER);
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (Exception e) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
			System.out.println(e.toString());
		}
		return con;
	}
		
	public void freeConnection(Connection con, Statement stmt, ResultSet rs) { //select 일 때
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		} catch (Exception e) {
			
		}
	}
	
	public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) { //select 일 때
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//PreparedStatement 동적 쿼리에서 사용(권장사항)
	//SELECT * FROM member WHERE id = ? -> ?부분만 바뀌면 됨. 이것이 동적 쿼리의 예
	public void freeConnection(Connection con, PreparedStatement pstmt) { //INSERT/UPDATE/DELETE
		try {
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Statement는 정적쿼리 처리할 때 사용
	public void freeConnection(Connection con, Statement stmt) {  //INSERT/UPDATE/DELETE
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}