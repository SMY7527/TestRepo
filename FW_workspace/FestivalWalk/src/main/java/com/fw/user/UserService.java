package com.fw.user;

public class UserService {
	UserDAO dao = new UserDAO();
	
	// 로그인
	
	// 회원가입
	public int registerUser(UserDTO user) {
		return dao.insertUser(user);
	}
	
	// 회원 정보 수정
	
	// 회원 탈퇴()
}
