package com.kaishengit;

import com.kaishengit.entity.User;
import com.kaishengit.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author zh
 * Created by Administrator on 2017/11/4.
 */
public class MybatisUserTestCase {
    @Test
    public void save() throws IOException {
//        读取配置文件
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
//        根据reader读取的输入流来创建SQLSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        根据SQLSessionFactory来创建SQLSession
        SqlSession sqlSession = sessionFactory.openSession(true);
        User user = new User("悟空","111","水",2);
        sqlSession.insert("com.kaishengit.mapper.UserMapper.save",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findAll(){
       SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<User> users = sqlSession.selectList("com.kaishengit.mapper.UserMapper.findAll");
        for(User user : users){
            System.out.println(user);
        }
       sqlSession.close();
    }

    @Test
    public void findById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        User user = sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById",2L);
       System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        User user = sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById",1L);
        user.setUserName("tom");
        sqlSession.update("com.kaishengit.mapper.UserMapper.update",user);
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        sqlSession.update("com.kaishengit.mapper.UserMapper.delete",54L);
        sqlSession.close();
    }
}
