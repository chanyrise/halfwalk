package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Product;

public class ProductDAO {
	static SqlSessionFactory factory;
	static {String resource = "conf/mybatis-conf.xml";
	InputStream inputStream;
	try {
		inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	public List<Product> getAll(){
		SqlSession session = factory.openSession();
		List<Product> all = null; //ºó¹æ¸¸µé±â
		try {
	/*
	  <select id="productAll" resultType="entity.Product">
		    select * from Product
	  </select>
	 */
			all = session.selectList("ProductMapper.productAll"); 
		}finally {
			session.close();
		}return all;
	}
	
}
