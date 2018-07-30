package com.orilore.biz;
import com.orilore.model.*;

import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class AdminBiz implements IAdminBiz{
	@Resource
	private AdminMapper mapper;
	private static final Logger log = LoggerFactory.getLogger(AdminBiz.class);
	@Override
	public boolean save(Admin bean) {
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
	public Admin find(int id) {
		try {
			return this.mapper.selectOne(id);
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}

	@Override
	public List<Admin> query() {
		try {
			return this.mapper.select();
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
		
	}
}
