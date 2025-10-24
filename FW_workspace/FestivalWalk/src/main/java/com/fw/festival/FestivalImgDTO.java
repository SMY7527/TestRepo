package com.fw.festival;

public class FestivalImgDTO {
	private int festival_img_id;
	private int festival_id;
	private String festival_img_url;
	private char festival_img_flag;
	
	public FestivalImgDTO() { }
	
	public FestivalImgDTO(int img_id, int festival_id, String img_url, char img_flag) {
		this.festival_img_id = img_id;
		this.festival_id = festival_id;
		this.festival_img_url = img_url;
		this.festival_img_flag = img_flag;
	}
	
	@Override
	public String toString() {
		return "FestivalImgDTO [img_id=" + festival_img_id + ", festival_id=" + festival_id + ", img_url=" + festival_img_url
				+ ", img_flag=" + festival_img_flag + "]";
	}
	
	public int getImg_id() {
		return festival_img_id;
	}
	public void setImg_id(int img_id) {
		this.festival_img_id = img_id;
	}
	public int getFestival_id() {
		return festival_id;
	}
	public void setFestival_id(int festival_id) {
		this.festival_id = festival_id;
	}
	public String getImg_url() {
		return festival_img_url;
	}
	public void setImg_url(String img_url) {
		this.festival_img_url = img_url;
	}
	public char getImg_flag() {
		return festival_img_flag;
	}
	public void setImg_flag(char img_flag) {
		this.festival_img_flag = img_flag;
	}
}
