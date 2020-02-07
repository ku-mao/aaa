package edu.xalead.service;

import edu.xalead.dao.UserMapper;
import edu.xalead.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User findById(Long id){
        return  userMapper.selectByPrimaryKey(id);
    }
}
