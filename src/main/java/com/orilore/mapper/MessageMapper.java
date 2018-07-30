package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface MessageMapper{
	public boolean insert(Message bean);
	public Message selectOne(int id);
	public boolean delete(int id);
	public List<Message> select();
	public boolean update(Message bean);
}