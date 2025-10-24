package com.fw.common;

import java.time.LocalTime;

public class LikeDTO {
	private int like_id;
	private int user_id;
	private int review_id;
	private LocalTime like_date;
	
	public LikeDTO() { }
	
	public LikeDTO(int like_id, int user_id, int review_id, LocalTime like_date) {
		super();
		this.like_id = like_id;
		this.user_id = user_id;
		this.review_id = review_id;
		this.like_date = like_date;
	}
	
	@Override
	public String toString() {
		return "LikeDTO [like_id=" + like_id + ", user_id=" + user_id + ", review_id=" + review_id + ", like_date="
				+ like_date + "]";
	}
	
	public int getLike_id() {
		return like_id;
	}
	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public LocalTime getLike_date() {
		return like_date;
	}
	public void setLike_date(LocalTime like_date) {
		this.like_date = like_date;
	}
}
