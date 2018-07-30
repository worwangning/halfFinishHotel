package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface HpriceMapper{
	public boolean insert(Hprice bean);
	public Hprice selectOne(int id);
	public boolean delete(int id);
	public List<Hprice> select();
	public boolean update(Hprice bean);
}