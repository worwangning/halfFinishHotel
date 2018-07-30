package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface AdminMapper{
	public boolean insert(Admin bean);
	public Admin selectOne(int id);
	public boolean delete(int id);
	public List<Admin> select();
	public boolean update(Admin bean);
}