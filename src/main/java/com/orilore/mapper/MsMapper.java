package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface MsMapper{
	public boolean insert(Ms bean);
	public Ms selectOne(int appid);
	public boolean delete(int id);
	public List<Ms> select();
	public boolean update(Ms bean);
}