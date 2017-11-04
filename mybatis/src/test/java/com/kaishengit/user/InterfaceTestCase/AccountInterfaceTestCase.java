package com.kaishengit.user.InterfaceTestCase;

import com.kaishengit.entity.Account;
import com.kaishengit.mapper.AccountMapper;
import com.kaishengit.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
    }

    @Test
    public void findById2(){
        SqlSession sqlSession = getSqlSession();
        AccountMapper accountMapper =  sqlSession.getMapper(AccountMapper.class);
        Account account = accountMapper.findById2(1L);
        System.out.println(account);
        System.out.println(account.getUserName()+"--->"+account.getDept().getDeptDepartment());
    }

}
