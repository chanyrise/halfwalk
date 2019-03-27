package biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDAO;
import vo.Member;


@Service
public class MemberBiz {
	
	@Autowired
	MemberDAO memberDao;

	public List<Member> getAll() {

		return memberDao.getAll();
	}

	public int getDelete(int del_name) {

		return memberDao.getDelete(del_name);
	}
	
	public int getInsert(Member member) {
		return memberDao.getInsert(member);
	}
	
//	public Member getFind(String name) {
//		return memberDao.getFind(name);
//		
//	}
	

}
