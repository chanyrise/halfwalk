package com.vo.member;

import java.util.Date;

public class MemberVo {
	private int no;
	private String id;
	private String pw;
	private String n_id;
	private String tel;
	private String sido;
	private String gu;
	private String doro;
	private String d_juso;
	private String postnum;
	private String email;
	private char u_sex;
	private Date u_birthday;
	private String u_name;
	private Date u_enrollday;
	private char status;
	private char manage;
	private int petnum;
	private char friend;
	private String f_id;
	   
	   public MemberVo() {
	      super();
	   }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getN_id() {
		return n_id;
	}

	public void setN_id(String n_id) {
		this.n_id = n_id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public String getDoro() {
		return doro;
	}

	public void setDoro(String doro) {
		this.doro = doro;
	}

	public String getD_juso() {
		return d_juso;
	}

	public void setD_juso(String d_juso) {
		this.d_juso = d_juso;
	}

	public String getPostnum() {
		return postnum;
	}

	public void setPostnum(String postnum) {
		this.postnum = postnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getU_sex() {
		return u_sex;
	}

	public void setU_sex(char u_sex) {
		this.u_sex = u_sex;
	}

	public Date getU_birthday() {
		return u_birthday;
	}

	public void setU_birthday(Date u_birthday) {
		this.u_birthday = u_birthday;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public Date getU_enrollday() {
		return u_enrollday;
	}

	public void setU_enrollday(Date u_enrollday) {
		this.u_enrollday = u_enrollday;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getManage() {
		return manage;
	}

	public void setManage(char manage) {
		this.manage = manage;
	}

	public int getPetnum() {
		return petnum;
	}

	public void setPetnum(int petnum) {
		this.petnum = petnum;
	}

	public char getFriend() {
		return friend;
	}

	public void setFriend(char friend) {
		this.friend = friend;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

}
