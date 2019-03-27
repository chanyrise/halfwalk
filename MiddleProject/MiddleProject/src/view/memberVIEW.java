package view;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MemberDAO;

import vo.Member;

public class memberVIEW {
	 
	
	static String id;
	static String pw;
	static String n_id;
	static String tel;
	static String sido;
	static String gu;
	static String doro;
	static String d_juso;
	static String postno;
	static String email;
	static String u_sex;
	static Date u_birthday;
	static String u_name;
	static Date u_enrollday;
	static String status;
	static String manage;
	static int petcount;
	static String friend;
	static String f_id;
	

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		StringBuilder sb = new StringBuilder();
		sb.append("============선택 \n");
		sb.append(" 1. 전체출력 \n");
		sb.append(" 2. 추  가 \n");
		sb.append(" 3. 삭  제 \n");
		sb.append(" 4. 수  정 \n");
		sb.append(" 5. 찾  기 \n");
		sb.append(" 6. 로그인\n");
		sb.append(" 7. 비밀번호 찾기\n");
		sb.append(" 8. 종  료");
		System.out.println(sb);
		System.out.println("input no :");
		int no = sc.nextInt();
		return no;
	}

	public static void main(String[] args) {

		ApplicationContext fa = new ClassPathXmlApplicationContext("view/bean.xml");

		MemberDAO m = fa.getBean("mydao", MemberDAO.class);
		Member pro = new Member();
		List<Member> all = null;
		int no = 0;
		do {
			no = menu();
			switch (no) {
			case 1:
				
				System.out.println("전체출력 \n");
				 all = m.getAll();
				for (Member r : all) {
					System.out.println(r);
				}
				break;

			case 2:
				System.out.println("추가 \n");
				System.out.println("id :");
			    id = sc.next();

				System.out.println("pw :");
				 pw = sc.next();

				System.out.println("n_id :");
				 n_id = sc.next();

				System.out.println("tel :");
				 tel = sc.next();

				System.out.println("sido :");
				sido = sc.next();

				System.out.println("gu :");
				gu = sc.next();

				System.out.println("doro :");
				doro = sc.next();

				System.out.println("d_juso :");
				d_juso = sc.next();

				System.out.println("postno :");
				postno = sc.next();

				System.out.println("email :");
				email = sc.next();

				System.out.println("u_sex :");
				u_sex = sc.next();
				
				System.out.println("u_birthday");
				int y, month, d;
				System.out.println("태어난 연도 입력 :");
				y = sc.nextInt();

				System.out.println("태어난 월을 입력 :");
				month = sc.nextInt();

				System.out.println("태어난 일 입력 :");
				d = sc.nextInt();
				
				u_birthday = new Date(y,month,d);
				pro.setU_birthday(u_birthday);
				
				System.out.println("u_name :");
				u_name = sc.next();
				
				System.out.println("u_enrollday :");
				int yy, mmonth, dd;
				System.out.println("가입 연도 입력 :");
				yy = sc.nextInt();

				System.out.println("가입 월 입력 :");
				mmonth = sc.nextInt();

				System.out.println("가입 일 입력 :");
				dd = sc.nextInt();
				
				u_enrollday = new Date(yy, mmonth, dd);
				pro.setU_enrollday(u_enrollday);
				
				System.out.println("status :");
				status = sc.next();
				
				System.out.println("manage :");
				manage = sc.next();
				
				System.out.println("petcount :");
				petcount = sc.nextInt();
				
				System.out.println("friend :");
				friend = sc.next();
				
				System.out.println("f_id :");
				f_id = sc.next();
				
				pro.setId(id);
				pro.setPw(pw);
				pro.setN_id(n_id);
				pro.setTel(tel);
				pro.setSido(sido);
				pro.setGu(gu);
				pro.setDoro(doro);
				pro.setD_juso(d_juso);
				pro.setPostno(postno);
				pro.setEmail(email);
				pro.setU_sex(u_sex);
				pro.setU_birthday(u_birthday);
				pro.setU_name(u_name);
				pro.setU_enrollday(u_enrollday);
				pro.setStatus(status);
				pro.setManage(manage);
				pro.setPetcount(petcount);
				pro.setFriend(friend);
				pro.setF_id(f_id);
				
	
				int r = m.getInsert(pro);
				if (r > 0) {
					System.out.println("입력 성공");
				} else {
					System.out.println("실패");
					
				}

				break;
			case 3:
				System.out.println("삭제 할 ID  :");
				id = sc.next();
				r = m.getDelete(id);
				if (r > 0) {
					System.out.println("삭제 완료");
				}

				break;

			case 4:
				System.out.println("수정할 ID :");
				
				id = sc.next();
				
				System.out.println("pw : ");
				pw = sc.next();
				
				System.out.println("n_id : ");
				n_id=sc.next();
				
				System.out.println("tel : ");
				tel = sc.next();
				
				System.out.println("sido : ");
				sido = sc.next();
				
				System.out.println("gu : ");
				gu = sc.next();
				
				System.out.println("doro : ");
				doro = sc.next();
				
				System.out.println("d_juso : ");
				d_juso = sc.next();
				
				System.out.println("postno : ");
				postno = sc.next();
				
				System.out.println("email : ");
				email = sc.next();
				
				System.out.println("u_name : ");
				u_name = sc.next();
				
				System.out.println("manage : ");
				manage = sc.next();
				
				System.out.println("petcount : ");
				petcount = sc.nextInt();
				
				System.out.println("friend : ");
				friend = sc.next();
				
				pro.setId(id);
				pro.setPw(pw);
				pro.setN_id(n_id);
				pro.setTel(tel);
				pro.setSido(sido);
				pro.setGu(gu);
				pro.setDoro(doro);
				pro.setD_juso(d_juso);
				pro.setPostno(postno);
				pro.setEmail(email);
				pro.setU_name(u_name);
				pro.setManage(manage);
				pro.setPetcount(petcount);
				pro.setFriend(friend);
				
				r = m.getUpdate(pro);
				if (r > 0) {
					System.out.println("수정 성공");
				}
				break;
				
				
			case 5:
				System.out.println("찾 기 \n");
				System.out.print("찾을 아이디 : ");
				id = sc.next();
				
				 all = m.getFind(id);
				for (Member res : all) {
					System.out.println(res);
					
				}
				
			case 6:
				System.out.println("로그인");
				System.out.println("ID 입력 :");
				id = sc.next();
				System.out.println("비밀번호 입력 :");
				pw = sc.next();
				
				pro.setId(id);
				pro.setPw(pw);
				
				pro = m.getLog(pro);
				
				if(pro != null) {
					System.out.println(pro.getId() + "님 안녕하세요");
				}else {
					System.out.println("로그인에 실패 하였습니다.");
				}
				
				break;
				
			case 7:
				System.out.println("비밀번호 찾기");
				System.out.println("ID 입력 :");
				id = sc.next();
				System.out.println("email 입력 :");
				email = sc.next();
				
				pro.setId(id);
				pro.setEmail(email);
				
				pro = m.getPwcheck(pro);
				
				if(pro != null) {
					System.out.println("당신의 비밀번호는   "+pro.getPw()+"  입니다");
				}else {
					System.out.println("개인정보가 일치하지 않습니다.");
				}
				
				break;
			case 8:
				System.out.println("종료 합니다.");
				System.exit(0);

			}
		} while (no != 7);
	}
}
