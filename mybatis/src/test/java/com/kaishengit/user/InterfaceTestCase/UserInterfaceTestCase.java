package com.kaishengit.user.InterfaceTestCase;

import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.user.sqlsession.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/4.
 */
public class UserInterfaceTestCase extends SqlSessionUtil {
    @Test
    public void save(){
        SqlSession sqlSession = getSqlSession();
        //动态代理模式创建接口的实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("八戒","111","水",2);
        int updaterows = userMapper.save(user);

        System.out.println("----------"+updaterows);
        System.out.println("id = "+user.getId());
        sqlSession.close();

    }

    @Test
    public void update(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//创建接口的实现类对象
        User user = userMapper.findById(4L);//根据id查询出user对象
        user.setUserName("王五");//改变user对象中的值
        userMapper.update(user);//调用实现类中的update方法传入User对象
        sqlSession.close();
    }

    @Test
    public void findById(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(5L);
        System.out.println(user);
        sqlSession.close();

    }

    @Test
    public void findAll(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAll();
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delete(55L);
        sqlSession.close();
    }


//    分页查询

    @Test
    public void page(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String , Integer> map = new HashMap<>();
        map.put("offset",0);
        map.put("size",3);
        List<User> userList = userMapper.page(map);
        for (User user : userList){
            System.out.println(user);
        }
    }

    @Test
    public void page1(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.page1(0,4);
        for (User user : userList){
            System.out.println(user);
        }
    }

    @Test
    public void page2(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.page2(0,5);
        for (User user : userList){
            System.out.println(user);
        }
    }


    @Test
    public void page3(){
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.page3(0,6);
        for (User user : userList){
            System.out.println(user);
        }
    }
}
