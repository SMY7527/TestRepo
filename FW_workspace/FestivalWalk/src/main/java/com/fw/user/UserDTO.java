package com.fw.user;

import java.time.LocalDate;

public class UserDTO {
	private int user_id;
	private String id;
	private String password;
	private String name;
	private String phone;
	private String email;
	private char gender;
	private LocalDate birthday;
	private boolean is_admin;
	private boolean is_use;
	
	public UserDTO() { }
	
	public UserDTO(int user_id, String id, String password, String name, String phone, String email, char gender,
			LocalDate birthday) {
		super();
		this.user_id = user_id;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
	}

	public UserDTO(int user_id, String id, String password, String name, String phone, String email, char gender,
			LocalDate birthday, boolean is_admin, boolean is_use) {
		this.user_id = user_id;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.is_admin = is_admin;
		this.is_use = is_use;
	}

	@Override
	public String toString() {
		return "UserDTO [user_id=" + user_id + ", id=" + id + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", email=" + email + ", gender=" + gender + ", birthday=" + birthday + ", is_admin="
				+ is_admin + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public boolean is_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public boolean isIs_use() {
		return is_use;
	}

	public void setIs_use(boolean is_use) {
		this.is_use = is_use;
	}
}
