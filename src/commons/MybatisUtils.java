package commons;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * Mybatis�Ĺ�����
 */
public class MybatisUtils {
	private static SqlSessionFactory fac;
	
	static {
		//��ȡ���������ļ�
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			fac = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ����һ������SqlSession����ķ���
	public static SqlSession createSqlSession() {
		SqlSession sqlSession = fac.openSession(false);
		return sqlSession;
	}
	// ����һ���ر�SqlSession����ķ���
	public static void closeSqlSession(SqlSession sqlSesion) {
		if(sqlSesion != null) {
			sqlSesion.close();
		}
	}
	
}
