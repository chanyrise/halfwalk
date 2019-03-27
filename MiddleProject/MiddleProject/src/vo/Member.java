package vo;

import java.sql.Date;

public class Member {

	
	private String id;
	private String pw;
	private String n_id;
	private String tel;
	private String sido;
	private String gu;
	private String doro;
	private String d_juso;
	private String postno;
	private String email;
	private String u_sex;
	private Date u_birthday;
	private String u_name;
	private Date u_enrollday;
	private String status;
	private String manage;
	private int petcount;
	private String friend;
	private String f_id;
	   
	public Member() {
		super();
	}

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
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

	public String getPostno() {
		return postno;
	}

	public void setPostno(String postno) {
		this.postno = postno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManage() {
		return manage;
	}

	public void setManage(String manage) {
		this.manage = manage;
	}

	public int getPetcount() {
		return petcount;
	}

	public void setPetcount(int petcount) {
		this.petcount = petcount;
	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pw=" + pw + ", n_id=" + n_id + ", tel=" + tel + ", sido=" + sido
				+ ", gu=" + gu + ", doro=" + doro + ", d_juso=" + d_juso + ", postno=" + postno + ", email=" + email
				+ ", u_sex=" + u_sex + ", u_birthday=" + u_birthday + ", u_name=" + u_name + ", u_enrollday="
				+ u_enrollday + ", status=" + status + ", manage=" + manage + ", petcount=" + petcount + ", friend="
				+ friend + ", f_id=" + f_id + "]";
	}
	

	   
	}


