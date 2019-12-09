package com.zydgbbs.mapper;

import com.zydgbbs.domain.User;

public interface UserMapper {
    User getUserById(Integer id);

    //添加一个用户
    public int insertUser(User user);

    //删除一个用户
    public int deleteUser(int id);
}
