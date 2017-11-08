package cn.javaee.ch3.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类，用于创建SqlSessionFactory和获取SqlSession对象
 * @author lwk
 * @date 2017/11/7 22:27
 */
public class SqlSessionFactoryUtils {

    private final  static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory sqlSessionFactory = null;

    private static SqlSessionFactory getSqlSessionFactory(){

        synchronized (LOCK){
            if (sqlSessionFactory != null){
                return sqlSessionFactory;
            }
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try{
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }

        /*
        //单例模式，可以采用双重检查锁的方式
        if (sqlSessionFactory == null){
            synchronized (SqlSessionFactory.class){
                if (sqlSessionFactory == null){
                    String resource = "mybatis-config.xml";
                    InputStream inputStream;
                    try{
                        inputStream = Resources.getResourceAsStream(resource);
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                    }catch (IOException e){
                        e.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return sqlSessionFactory;
        */
    }

    public static SqlSession openSqlSession(){
        if (sqlSessionFactory == null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
