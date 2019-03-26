package com.viewtest.member;

import java.util.Date;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.member.MemberDao;
import com.vo.member.MemberVo;

public class MemberView {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		StringBuilder sb = new StringBuilder();
		sb.append("==============���� \n");
		sb.append("1. ��ü ��� \n");
		sb.append("2. �߰� \n");
		sb.append("3. ���� \n");
		sb.append("4. ���� \n");
		sb.append("5. ���� \n");
		System.out.println(sb);
		System.out.print("input no : ");
		int num = sc.nextInt();
		return num;
	}
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/com/viewtest/member/bean.xml");
		MemberDao m = factory.getBean("memberdao",MemberDao.class);
		MemberVo vo = new MemberVo();
	
		int num = 0;	int no = 0; 
		String id = null;		String pw = null;		String n_id = null;
		String tel = null;		String sido = null;		String gu = null;
		String doro = null;		String d_juso = null;	String postnum = null;
		String email = null;	Character u_sex = null;		Date u_birthday = null;
		String u_name = null;	Date u_enrollday = null;	Character status = null;
		Character manage = null; int petnum = 0; Character friend = null; String f_id = null;
	
		do {
			num = menu();
			switch(num) {
			case 1 : 
				System.out.println("��ü���\n");
				List<MemberVo> all = m.MemberView();
				for(MemberVo p : all) {
					System.out.println(p);
				}break;
				
			case 2 :
				int u_y,u_month,u_d;
				int e_y,e_month,e_d;
				System.out.println("�߰�\n");
				System.out.println("id : ");
				id = sc.next();
				System.out.println("pw : ");
				pw = sc.next();
				System.out.println("n_id : ");
				n_id = sc.next();
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
				System.out.println("postnum : ");
				postnum = sc.next();
				System.out.println("email : ");
				email = sc.next();
				System.out.println("u_sex : ");
				u_sex = sc.next().charAt(0);
				System.out.println("u_y : ");
				u_y = sc.nextInt();
				System.out.println("u_month : ");
				u_month = sc.nextInt();
				System.out.println("u_d : ");
				u_d = sc.nextInt();
				u_birthday = new Date(u_y,u_month,u_d);
				
				System.out.println("u_name : ");
				u_name = sc.next();
				System.out.println("e_y : ");
				e_y = sc.nextInt();
				System.out.println("e_month : ");
				e_month = sc.nextInt();
				System.out.println("e_d : ");
				e_d = sc.nextInt();
				u_enrollday = new Date(e_y,e_month,e_d);
				
				System.out.println("status : ");
				status = sc.next().charAt(0);
				System.out.println("manage : ");
				manage = sc.next().charAt(0);
				System.out.println("petnum : ");
				petnum = sc.nextInt();
				System.out.println("friend : ");
				friend = sc.next().charAt(0);
				System.out.println("f_id : ");
				f_id = sc.next();
				
				vo.setId(id); vo.setPw(pw);vo.setN_id(n_id);vo.setTel(tel);
				vo.setSido(sido);vo.setGu(gu);vo.setDoro(doro);vo.setD_juso(d_juso);
				vo.setPostnum(postnum);vo.setEmail(email);vo.setU_sex(u_sex);
				vo.setU_birthday(u_birthday);vo.setU_name(u_name);vo.setU_enrollday(u_enrollday);
				vo.setStatus(status);vo.setManage(manage);vo.setPetnum(petnum);
				vo.setFriend(friend);vo.setF_id(f_id);
				
				int r = m.memberInsert(vo);
				if(r>0) {
					System.out.println("�Է¼���");
				}
				break;
			case 3: 
				System.out.println("����\n");
				sc = new Scanner(System.in);
				System.out.print("���� �� �� : ");
				no=sc.nextInt();
				r = m.memberDelete(no);
				System.out.println("no : "+no + " �� �ڷᰡ �����Ǿ����ϴ�.");
				break;
				
			case 4:
				System.out.println("������ ��ȣ�� ����\n");
				System.out.print("no : ");
				int number = sc.nextInt();
				System.out.print("�̸� : ");
				u_name = sc.next() ;
				vo.setU_name(u_name);
				vo.setNo(number);
				r = m.memberUpdate(vo);
				if(r>0) {
					System.out.println("��������");
				}
				break;
			case 5 :
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		
		}while(no != 5);
			}
	}

