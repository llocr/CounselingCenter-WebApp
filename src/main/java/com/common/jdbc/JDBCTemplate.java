package com.common.jdbc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class JDBCTemplate {
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        if(sqlSessionFactory == null) {
            String resource = "webapp/WEB-INF/config/mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory.openSession(false);
    }

}
