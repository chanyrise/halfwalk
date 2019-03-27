package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import vo.*;

import java.util.*;

@Repository
public class MemberDAO { // DAO는 연결하고 CRUD 해야함
	static SqlSessionFactory factory;

	static {
		String resource = "conf/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Member> getAll() {
		SqlSession session = factory.openSession();
		List<Member> all = null;
		try {
			all = session.selectList("memberMapper.view");
			System.out.println(all.size());

		} finally {
			session.close();
		}
		return all;
	}
	
	//insert
	public int getInsert(Member no) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("memberMapper.memberInsert",no);
			if(all>0) {
				session.commit();
			}
		}catch (Exception e){
			e.fillInStackTrace();
			session.rollback();

		} finally {
			session.close();
		}
		return all;
	}
	
	//delete
	public int getDelete(int no) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.delete("memberMapper.memberDelete",no);
			if(all>0) {
				session.commit();
			}
		}catch (Exception e){
			session.rollback();
			e.fillInStackTrace();

		} finally {
			session.close();
		}
		return all;
	}

		
	

//updete
	public int getUpdate(Member pro) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.update("memberMapper.memberUpdate",pro);
			if(all>0) {
				session.commit();
			}
		}catch (Exception e){
			session.rollback();

		} finally {
			session.close();
		}
		return all;
	}

	}


