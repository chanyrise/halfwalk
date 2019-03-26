package com.dao.member;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.vo.member.MemberVo;

public class MemberDao {
	static SqlSessionFactory factory;
	static {String resource = "com/conf/member/mybatis-config.xml";
	
	InputStream inputStream;
	
	try {
	inputStream = Resources.getResourceAsStream(resource);
	factory = new SqlSessionFactoryBuilder().build(inputStream);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	public int memberInsert(MemberVo vo) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("MemberMapper.MemberInsert",vo);
			if(all > 0) {
				session.commit();
			}
		}catch(Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return all;
	}

	public List<MemberVo> MemberView() {
		SqlSession session = factory.openSession();
		List<MemberVo> all = null;
		try {
			all = session.selectList("MemberMapper.MemberView");
		}finally {
			session.close();
		}
		return all;
	}

	public int memberDelete(int no) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.delete("MemberMapper.MemberDelete",no);
			if(all > 0) {
				session.commit();
			}
		}catch(Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return all;
	}

	public int memberUpdate(MemberVo vo) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.update("MemberMapper.MemberUpdate",vo);
			if(all > 0) {
				session.commit();
			}
		}catch(Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return all;
	}



}
