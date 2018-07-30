package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface UserMapper{
	public boolean insert(User bean);
	public User selectOne(int id);
	public boolean delete(int id);
	public List<User> select();
	public boolean update(User bean);
}