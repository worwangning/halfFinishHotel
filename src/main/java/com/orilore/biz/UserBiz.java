package com.orilore.biz;
import com.orilore.model.*;

import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class UserBiz implements IUserBiz{
	@Resource
	private UserMapper mapper;
	private static final Logger log = LoggerFactory.getLogger(UserBiz.class);
	@Override
	public boolean save(User bean) {
		boolean flag = false;
		try {
			if(bean.getId()!=null){
				flag = this.mapper.update(bean);
			}else{
				flag = this.mapper.insert(bean);
			}
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return flag;
	}

	@Override
	public boolean remove(int id) {
		boolean flag = false;
		try {
			flag = this.mapper.delete(id);
		}catch(Exception ex){
			log.error(ex.getMessage());
		}
		return flag;
	}

	@Override
	public User find(int id) {
		try {
			return this.mapper.selectOne(id);
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}

	@Override
	public List<User> query() {
		try {
			return this.mapper.select();
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
		
	}
}

