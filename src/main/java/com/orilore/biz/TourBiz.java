package com.orilore.biz;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.orilore.mapper.TourMapper;
import com.orilore.model.Tour;

@Service
public class TourBiz implements ITourBiz{
	@Resource
	private TourMapper mapper;
	private static final Logger log = LoggerFactory.getLogger(TourBiz.class);
	@Override
	public boolean save(Tour bean) {
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
	public Tour find(int id) {
		try {
			return this.mapper.selectOne(id);
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
	}

	@Override
	public List<Tour> query() {
		try {
			return this.mapper.select();
		}catch (Exception ex) {
			log.error(ex.getMessage());
		}
		return null;
		
	}
}

