package com.orilore.controller;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IMessageBiz;
import com.orilore.model.Message;

@RestController
@RequestMapping("/message")
public class messageCtrl {
	@Resource
	private IMessageBiz biz;
	private static final Logger log = LoggerFactory.getLogger(messageCtrl.class);
	@RequestMapping("/save")
	public boolean save(Message message) {
		log.info("-----保存短信记录表-----");
		return biz.save(message);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------删除短信记录表--------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Message find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"的短信记录表 ------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<Message> query(){
		log.info("--------查找所有短信记录表---------");
		return biz.query();
	}
}
