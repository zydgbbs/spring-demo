package com.zydgbbs.mapper;

import com.zydgbbs.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public User getUserById(Integer id) {
        User user = new User();
        user.setId(35);
        user.setUsername("test");
        insertUser(user);
        deleteUser(35);
        return getSqlSession().getMapper(UserMapper.class).getUserById(id);
    }

    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
