package com.fw.review;

import java.time.LocalTime;

public class ReviewDTO {
	private int review_id;
	private int fetival_id;
	private int user_id;
	private String review_txt;
	private int rating;
	private LocalTime create_at;
	private LocalTime update_at;
	private int like_cnt;
	
	public ReviewDTO() { }
	
	public ReviewDTO(int review_id, int fetival_id, int user_id, String review_txt, int rating, LocalTime create_at,
			LocalTime update_at, int like_cnt) {
		this.review_id = review_id;
		this.fetival_id = fetival_id;
		this.user_id = user_id;
		this.review_txt = review_txt;
		this.rating = rating;
		this.create_at = create_at;
		this.update_at = update_at;
		this.like_cnt = like_cnt;
	}
	
	@Override
	public String toString() {
		return "ReviewDTO [review_id=" + review_id + ", fetival_id=" + fetival_id + ", user_id=" + user_id
				+ ", review_txt=" + review_txt + ", rating=" + rating + ", create_at=" + create_at + ", update_at="
				+ update_at + ", like_cnt=" + like_cnt + "]";
	}
	
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public int getFetival_id() {
		return fetival_id;
	}
	public void setFetival_id(int fetival_id) {
		this.fetival_id = fetival_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getReview_txt() {
		return review_txt;
	}
	public void setReview_txt(String review_txt) {
		this.review_txt = review_txt;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LocalTime getCreate_at() {
		return create_at;
	}
	public void setCreate_at(LocalTime create_at) {
		this.create_at = create_at;
	}
	public LocalTime getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(LocalTime update_at) {
		this.update_at = update_at;
	}
	public int getLike_cnt() {
		return like_cnt;
	}
	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}
}
