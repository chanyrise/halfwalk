package biz;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
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

	public int getDelete(String del_name) {

		return memberDao.getDelete(del_name);
	}

	public int getInsert(Member id) {
		return memberDao.getInsert(id);
	}

	public List<Member> getFind(String id) {
		return memberDao.getFind(id);
	}

	public int getUpdate(Member id) {
		return memberDao.getUpdate(id);
	}
	
	 public Member getLog(Member member) {
		   return memberDao.getLog(member);
	   }

}
