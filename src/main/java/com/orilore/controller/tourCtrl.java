package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.ITourBiz;
import com.orilore.model.Tour;

@RestController
@RequestMapping("/tour")
public class tourCtrl {
	@Resource
	private ITourBiz biz;
	private static final Logger log = LoggerFactory.getLogger(tourCtrl.class);
	@RequestMapping("/save")
	public boolean save(Tour record) {
		log.info("-------保存旅游攻略------");
		return biz.save(record);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------删除旅游攻略--------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Tour find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"的旅游攻略------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<Tour> query(){
		log.info("------查找所有旅游攻略--------");
		return biz.query();
	}
}
