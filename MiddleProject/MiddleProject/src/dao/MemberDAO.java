package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.jdbc.core.RowMapper;
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
	public int getInsert(Member pro) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.insert("memberMapper.memberInsert",pro);
				
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
	public int getDelete(String id) {
		SqlSession session = factory.openSession();
		int all = 0;
		try {
			all = session.delete("memberMapper.memberDelete",id);
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
	
	

	   public List<Member> getFind(String id) {
		   
	      SqlSession session = factory.openSession();
	      List<Member> all =null;
	      
	      try {
	    	  
	    	  all=session.selectList("memberMapper.memberFind", id);
	    	  
	      } finally {
				session.close();
			}
	      
	      return all;
	      
	}
	   
	   public Member getLog(Member member) {
		   SqlSession session = factory.openSession();
		   Member all = null;
		   try {
			   all=session.selectOne("memberMapper.memberLog", member);
			   
		   }catch(Exception e) {
			   System.out.println("로그인 실패");
			   e.printStackTrace();
		   }finally {
			   session.close();
		   }
		   return all;
	   }
	   
	   public Member getPwcheck(Member member) {
		   SqlSession session = factory.openSession();
		   Member all = null;
		   try {
			   all=session.selectOne("memberMapper.memberPwcheck", member);
			   
		   }catch(Exception e) {
			   System.out.println("비번찾기 실패");
			   e.printStackTrace();
		   }finally {
			   session.close();
		   }
		   return all;
	   }
}

