package com.fw.common;

import java.time.LocalTime;

public class BookmarkDTO {
	private int bookmark_id;
	private int user_id;
	private int festival_id;
	private LocalTime created_at;
	
	public BookmarkDTO() { }
	
	public BookmarkDTO(int bookmark_id, int user_id, int festival_id, LocalTime created_at) {
		super();
		this.bookmark_id = bookmark_id;
		this.user_id = user_id;
		this.festival_id = festival_id;
		this.created_at = created_at;
	}
	
	@Override
	public String toString() {
		return "BookmarkDTO [bookmark_id=" + bookmark_id + ", user_id=" + user_id + ", festival_id=" + festival_id
				+ ", created_at=" + created_at + "]";
	}
	
	public int getBookmark_id() {
		return bookmark_id;
	}
	public void setBookmark_id(int bookmark_id) {
		this.bookmark_id = bookmark_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getFestival_id() {
		return festival_id;
	}
	public void setFestival_id(int festival_id) {
		this.festival_id = festival_id;
	}
	public LocalTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalTime created_at) {
		this.created_at = created_at;
	}
}
