package com.fw.festival;

import java.time.LocalDate;
import java.time.LocalTime;

public class FestivalDTO {
	private int festival_id;
	private String title;
	private String subTitle;
	private String description;
	private String content;
	private String tel;
	private String institute;
	private String location;
	private String homepage;
	private String youtube;
	private LocalDate start_date;
	private LocalDate end_date;
	private int view_cnt;
	private LocalTime create_at;
	private int rating;
	private int rating_cnt;
	private int category_id;
	
	public FestivalDTO() { }
	
	public FestivalDTO(int festival_id, String title, String subTitle, String description, String content, String tel,
			String institute, String location, String homepage, String youtube, LocalDate start_date,
			LocalDate end_date, int view_cnt, LocalTime create_at, int rating, int rating_cnt, int category_id) {
		this.festival_id = festival_id;
		this.title = title;
		this.subTitle = subTitle;
		this.description = description;
		this.content = content;
		this.tel = tel;
		this.institute = institute;
		this.location = location;
		this.homepage = homepage;
		this.youtube = youtube;
		this.start_date = start_date;
		this.end_date = end_date;
		this.view_cnt = view_cnt;
		this.create_at = create_at;
		this.rating = rating;
		this.rating_cnt = rating_cnt;
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "FestivalDTO [festival_id=" + festival_id + ", title=" + title + ", subTitle=" + subTitle
				+ ", description=" + description + ", content=" + content + ", tel=" + tel + ", institute=" + institute
				+ ", location=" + location + ", homepage=" + homepage + ", youtube=" + youtube + ", start_date="
				+ start_date + ", end_date=" + end_date + ", view_cnt=" + view_cnt + ", create_at=" + create_at
				+ ", rating=" + rating + ", rating_cnt=" + rating_cnt + ", category_id=" + category_id + "]";
	}

	public int getFestival_id() {
		return festival_id;
	}

	public void setFestival_id(int festival_id) {
		this.festival_id = festival_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public int getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}

	public LocalTime getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalTime create_at) {
		this.create_at = create_at;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating_cnt() {
		return rating_cnt;
	}

	public void setRating_cnt(int rating_cnt) {
		this.rating_cnt = rating_cnt;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
}
