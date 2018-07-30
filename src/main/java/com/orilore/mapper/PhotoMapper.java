package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface PhotoMapper{
	public boolean insert(Photo bean);
	public Photo selectOne(int id);
	public boolean delete(int id);
	public List<Photo> select();
	public boolean update(Photo bean);
}