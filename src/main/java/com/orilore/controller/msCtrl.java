package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IMsBiz;
import com.orilore.model.Ms;

@RestController
@RequestMapping("/ms")
public class msCtrl {
	@Resource
	private IMsBiz biz;
	private static final Logger log = LoggerFactory.getLogger(msCtrl.class);
	@RequestMapping("/save")
	public boolean save(Ms ms) {
		log.info("------保存短信总量表------");
		return biz.save(ms);
	}
	@RequestMapping("/remove/{appid}")
	public boolean remove(@PathVariable("appid") int appid) {
		log.info("-----删除短信总量表------");
		return biz.remove(appid);
	}
	@RequestMapping("/find/{appid}")
	public Ms find(@PathVariable("appid") int appid) {
		log.info("---- 查找id为"+appid+"的短信总量表 ------");
		return biz.find(appid);
	}
	@RequestMapping("/query")
	public List<Ms> query(){
		log.info("-------查找所有的短信总量表-------");
		return biz.query();
	}
	
}
