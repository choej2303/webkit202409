package org.mybatis.example;

import java.util.List;

public interface BlogMapper {
    Blog selectBlog(int id);

    List<Blog> selectAllBlog();

    void updateBlog(Blog blog);

    void insertBlog(Blog blog);

    void deleteBlog(Blog blog);
}
