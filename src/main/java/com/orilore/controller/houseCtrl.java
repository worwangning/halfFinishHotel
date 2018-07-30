package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IHouseBiz;
import com.orilore.model.House;

@RestController
@RequestMapping("/house")
public class houseCtrl {
	@Resource
	private IHouseBiz biz;
	private static final Logger log = LoggerFactory.getLogger(houseCtrl.class);
	@RequestMapping("/save")
	public boolean save(House house) {
		log.info("-------保存住房信息-------");
		return biz.save(house);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("-------删除住房信息--------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public House find(@PathVariable("id") int id) {
		log.info("------查找id为"+id+"的住房信息-------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<House> query(){
		log.info("------查找所有住房信息-----");
		return biz.query();
	}
	
}
