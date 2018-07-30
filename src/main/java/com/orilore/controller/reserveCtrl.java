package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IReserveBiz;
import com.orilore.model.Reserve;

@RestController
@RequestMapping("/reserve")
public class reserveCtrl {
	@Resource
	private IReserveBiz biz;
	private static final Logger log = LoggerFactory.getLogger(reserveCtrl.class);
	@RequestMapping("/save")
	public boolean save(Reserve record) {
		log.info("-------房间预约记录------");
		return biz.save(record);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------删除房间预约记录--------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Reserve find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"的房间预约记录------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<Reserve> query(){
		log.info("------查找所有房间预约记录--------");
		return biz.query();
	}
}
