package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface CompanyMapper{
	public boolean insert(Company bean);
	public Company selectOne(int id);
	public boolean delete(int id);
	public List<Company> select();
	public boolean update(Company bean);
}