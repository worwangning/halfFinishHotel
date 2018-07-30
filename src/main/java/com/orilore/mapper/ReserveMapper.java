package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface ReserveMapper{
	public boolean insert(Reserve bean);
	public Reserve selectOne(int id);
	public boolean delete(int id);
	public List<Reserve> select();
	public boolean update(Reserve bean);
}