package edu.xalead.dao;

import edu.xalead.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@Repository
public interface UserMapper extends Mapper<User>{
    }
