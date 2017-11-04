package com.kaishengit.mapper;

import com.kaishengit.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zh
 * Created by Administrator on 2017/11/4.
 * 使用接口注意事项
 * UserMapper.xml文件中的namespace的名字需要和接口的完全限定名称一致，
 * id需要和接口中的方法名一致
 * parameterType需要和接口中方法的返回类型一致
 * resultType需要和接口中方法的参数类型一致
 */
public interface UserMapper {
    int save(User user);
    void update(User user);
    void delete(Long id);
    List<User> findAll();
    User findById(Long id);
   //对于传递多个参数时可以封装在map集合中
    List<User> page(Map<String , Integer> map);
    //mybatis框架是支持直接传递参数的，并且在xml配置中的这连个参数的名称对已经的有两组参数(argo,arg1),(param1,param2)这两组参数时框架所支持的
    List<User> page1(int offset,int size );
    List<User> page2(int offset,int size );
   //如果不使用框架支持的参数，可以起一个别名@Param("offset")
     List<User> page3(@Param("offset") int offset,@Param("size") int size);

}
