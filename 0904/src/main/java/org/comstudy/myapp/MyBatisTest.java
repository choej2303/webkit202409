package org.comstudy.myapp;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Blog;
import org.mybatis.example.BlogDAO;
import org.mybatis.example.BlogMapper;

public class MyBatisTest {
    private static BlogDAO blogDAO;

    public static void main(String[] args) {
//        인터페이스 맵퍼를 이용.
        String resource = "mybatis/mybatis-config.xml"; // MyBatis 설정 파일 경로
        try (Reader reader = Resources.getResourceAsReader(resource)) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            BlogDAO blogDAO = new BlogDAO(sqlSessionFactory);
            try (SqlSession session = sqlSessionFactory.openSession()) {
                BlogMapper blogMapper = session.getMapper(BlogMapper.class);
                Blog blog = blogMapper.selectBlog(1);
                System.out.println(blog);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
