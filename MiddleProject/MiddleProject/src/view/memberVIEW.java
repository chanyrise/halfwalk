package view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MemberDAO;
import vo.Member;

public class memberVIEW {
	
	
	
	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		StringBuilder sb = new StringBuilder();
		sb.append("============���� \n");
		sb.append(" 1. ��ü��� \n");
		sb.append(" 2. ��  �� \n");
		sb.append(" 3. ��  �� \n");
		sb.append(" 4. ��  �� \n");
		sb.append(" 5. ��  ��");
		System.out.println(sb);
		System.out.println("input no :");
		int no = sc.nextInt();
		return no;
	}

	public static void main(String[] args) {
		
		ApplicationContext fa =new ClassPathXmlApplicationContext("view/bean.xml");
		
		MemberDAO m =fa.getBean("mydao",MemberDAO.class);
		Member pro = new Member();
		
		 int no;
		 String id;
		 String pw;
		 String n_id;
		 String tel;
		 String sido;
		 String gu;
		 String doro;
		 String d_juso;
		 String postnum;
		 String email;
		 char u_sex;
		 Date u_birthday;
		 String u_name;
		 Date u_enrollday;
		 char status;
		 char manage;
		 int petnum;
		 char friend;
		 String f_id;
		
		do {
			no= menu();
			switch (no) {
			case 1:
					System.out.println("��ü��� \n");
					List<Member> all = m.getAll();
					for(Member r : all) {
						System.out.println(r);
					} break;
					
			case 2:
			System.out.println("�߰� \n");
			System.out.println("id�� �Է�");
			id = sc.next();
			
			System.out.println("pw");
			pw = sc.next();
			
			System.out.println("n_id");
			n_id = sc.next();
			
			System.out.println("tel");
			tel = sc.next();
			
			System.out.println("sido");
			sido = sc.next();
			
			System.out.println("gu");
			gu = sc.next();
			
			System.out.println("doro");
			doro = sc.next();
			
			System.out.println("d_juso");
			d_juso = sc.next();
			
			System.out.println("postnum");
			postnum = sc.next();
			 
			System.out.println("email");
			email = sc.next();
			
			System.out.println("u_sex");
			u_sex = sc.next().charAt(0);
			 
//			System.out.println("u_birthday");
//			u_birthday = sc.nextInt();
//			 
//					Date u_birthday;
//			 String u_name;
//			 Date u_enrollday;
//			 char status;
//			 char manage;
//			 int petnum;
//			 char friend;
//			 String f_id;
//			
			int y,month,d;
			System.out.println("���� �Է�");
			y = sc.nextInt();
			
			System.out.println("���� �Է�");
			month = sc.nextInt();
			
			System.out.println("��¥ �Է�");
			d=sc.nextInt();
			
			
			pro.setId(id);
			pro.setPw(pw);
//			regdate = new Date(y,month,d);
//			pro.setRegdate(regdate);
			int r = m.getInsert(pro);
			if(r>0) {
				System.out.println("�Է� ����");
			}
				
				break;
			case 3: 
				System.out.println("���� �� ��ȣ");
				int del_num=sc.nextInt();
				r = m.getDelete(del_num);
				if(r>0) {
					System.out.println("���� �Ϸ�");
				}
					
				break;
			
			case 4: 
				System.out.println("������ ��ȣ�� ������?");
				System.out.println("�߰� \n");
				System.out.println("no : ");
				int number = sc.nextInt();
				System.out.println("price : ");
//				price=sc.nextInt();
//				pro.setPrice(price);
				pro.setNo(number);
				
				r = m.getUpdate(pro);
				if(r>0) {
					System.out.println("���� ����");
				}
				break;
				
			case 5:
				System.out.println("���� �մϴ�.");
				System.exit(0);
				
			}
		}while (no != 5);		
	}
}
