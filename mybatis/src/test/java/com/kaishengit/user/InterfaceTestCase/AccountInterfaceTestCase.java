package com.kaishengit.user.InterfaceTestCase;

import com.kaishengit.entity.Account;
import com.kaishengit.entity.Tag;
import com.kaishengit.mapper.AccountMapper;
import com.kaishengit.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2017/11/4.
 */
public class AccountInterfaceTestCase extends MybatisUtil{

    @Test
    public void findById(){
        SqlSession sqlSession = getSqlSession();
       AccountMapper accountMapper =  sqlSession.getMapper(AccountMapper.class);
       Account account = accountMapper.findById(1L);
       System.out.println(account);
       System.out.println(account.getUserName()+"--->"+account.getDept().getDeptDepartment());
       sqlSession.close();
    }

    @Test
    public void findById2(){
        SqlSession sqlSession = getSqlSession();
        AccountMapper accountMapper =  sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.findById2(1L);
        System.out.println(account);
        System.out.println(account.getUserName()+"--->"+account.getDept().getDeptDepartment());
        sqlSession.close();
    }

//    测试一个对象中存放封装属性是一个集合的封装查询
    @Test
    public void findByIdWithTag(){
        SqlSession sqlSession = getSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        Account account  = accountMapper.findByIdWithTag(2L);
        System.out.println(account);

        List<Tag> tagList = account.getTagList();

        for(Tag tag : tagList){
            System.out.println(tag);
        }
        sqlSession.close();
    }

}
