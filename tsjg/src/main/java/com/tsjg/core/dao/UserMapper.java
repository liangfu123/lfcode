package com.tsjg.core.dao;

import com.tsjg.core.bean.User;
import com.tsjg.core.bean.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);
    
    int findCountCollege(String college);
    List<User> findCollegePage(User user);
    int findCountType(String type);
    List<User> findTypePage(User user);
    int findCountSex(String sex);
    List<User> findSexPage(User user);
    int findCountPage(User user);
    List<User> findAllPage(User user);
    
    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}