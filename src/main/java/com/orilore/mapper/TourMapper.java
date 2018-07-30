package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface TourMapper{
	public boolean insert(Tour bean);
	public Tour selectOne(int id);
	public boolean delete(int id);
	public List<Tour> select();
	public boolean update(Tour bean);
}