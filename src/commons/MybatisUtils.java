package commons;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * Mybatis的工具类
 */
public class MybatisUtils {
	private static SqlSessionFactory fac;
	
	static {
		//读取核心配置文件
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			fac = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 创建一个创建SqlSession对象的方法
	public static SqlSession createSqlSession() {
		SqlSession sqlSession = fac.openSession(false);
		return sqlSession;
	}
	// 创建一个关闭SqlSession对象的方法
	public static void closeSqlSession(SqlSession sqlSesion) {
		if(sqlSesion != null) {
			sqlSesion.close();
		}
	}
	
}
