package org.mybatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class BlogDAO {
    private SqlSessionFactory sqlSessionFactory;
    private BlogMapper blogMapper;
    private Reader reader;

    public BlogDAO(Reader reader) {
        try {
            String resource = "mybatis/mybatis-config.xml";
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BlogDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public Blog selectBlog(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            return blogMapper.selectBlog(id);
        }
    }

    public List<Blog> selectAllBlog() {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            return blogMapper.selectAllBlog();
        }
    }

    public void insertBlog(Blog blog) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            blogMapper.insertBlog(blog);
            sqlSession.commit();
        }
    }

    public void updateBlog(Blog blog) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            blogMapper.updateBlog(blog);
            sqlSession.commit();
        }
    }

    public void deleteBlog(Blog blog) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            blogMapper.deleteBlog(blog);
            sqlSession.commit();
        }
    }

}
