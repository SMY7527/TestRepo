package com.fw.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class UserDAO {
	// DB 정보
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:testdb";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	
	// DB Connection
	public Connection getConnection() {
		try {
            // Oracle JDBC 드라이버 로드
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Oracle JDBC Driver 로딩 실패", e);
        }
	}
	
	// 로그인(id, pw)
	
	// 회원 정보 조회
	public UserDTO selectUserById(int user_id) {
		Connection conn = getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select * from USERS where USER_ID = ?;";
		UserDTO user = null;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, user_id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				int key = rs.getInt(1);
				String id = rs.getString(2);
				String pw = rs.getString(3);
				String nm = rs.getString(4);
				String ph = rs.getString(5);
				String em = rs.getString(6);
				char gender = rs.getString(7).charAt(0);
				LocalDate birth = rs.getDate(8).toLocalDate();
				
				user = new UserDTO(key, id, pw, nm, ph, em, gender, birth);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(rs, pst, conn);
		}
		
		return user;
	}
	
	// 회원가입
	public int insertUser(UserDTO user) {
		Connection conn = getConnection();
		PreparedStatement pst = null;
		
		String sql = "insert into USERS (ID, PASSWORD, NAME, PHONE, EMAIL, GENDER, BIRTHDAY, IS_ADMIN)"
							   + "values(?, ?, ?, ?, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			pst = conn.prepareStatement(sql);
			
			String admin = user.is_admin() ? "Y" : "N";
			
			pst.setString(1, user.getId());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getName());
			pst.setString(4, user.getPhone());
			pst.setString(5, user.getEmail());
			pst.setString(6, String.valueOf(user.getGender()));
			pst.setDate(7, java.sql.Date.valueOf(user.getBirthday()));
			pst.setString(8, admin);
			
			result = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pst, conn);
		}
		
		return result;
	}
	
	// 회원 정보 수정
	public int updatetUser(UserDTO user) {
		Connection conn = getConnection();
		PreparedStatement pst = null;
		
		String sql = "update USERS set PASSWORD = ?, \r\n"
				+ "				 	   NAME = ?, \r\n"
				+ "  				   PHONE = ?,\r\n"
				+ "  				   EMAIL = ?,\r\n"
				+ "  				   GENDER = ?,\r\n"
				+ "  				   BIRTHDAY = ?,\r\n"
				+ "where USER_ID = ?;";
		int result = 0;
		
		try {
			pst = conn.prepareStatement(sql);
			
			String admin = user.is_admin() ? "Y" : "N";
			
			pst.setString(1, user.getPassword());
			pst.setString(2, user.getName());
			pst.setString(3, user.getPhone());
			pst.setString(4, user.getEmail());
			pst.setString(5, String.valueOf(user.getGender()));
			pst.setDate(6, java.sql.Date.valueOf(user.getBirthday()));
			pst.setInt(7, user.getUser_id());
			
			result = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pst, conn);
		}
		
		return result;
	}
	
	// 회원 탈퇴
	public int deleteUser(int user_id) {
		Connection conn = getConnection();
		PreparedStatement pst = null;
		
		String sql = "update USERS set IS_USE = N where USER_ID = ?;";
		int result = 0;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, user_id);
			
			result = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pst, conn);
		}
		
		return result;
	}
	
	// close
 	public void close(AutoCloseable... autoCloseables) {
 		for(AutoCloseable closeable : autoCloseables) {
 			try {
 				if(closeable != null) closeable.close();
 			
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
 	}
}
