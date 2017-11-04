package com.kaishengit.user.sqlsession.util;

import com.kaishengit.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Administrator on 2017/11/4.
 */
public class SqlSessionUtil {
    public SqlSession getSqlSession(){

        return  MybatisUtil.getSqlSession();
    }
}
