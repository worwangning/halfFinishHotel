package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IRecordBiz;
import com.orilore.model.Record;

@RestController
@RequestMapping("/record")
public class recordCtrl {
	@Resource
	private IRecordBiz biz;
	private static final Logger log = LoggerFactory.getLogger(recordCtrl.class);
	@RequestMapping("/save")
	public boolean save(Record record) {
		log.info("-------保存入住记录------");
		return biz.save(record);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------删除入住记录--------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Record find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"的入住记录------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<Record> query(){
		log.info("------查找所有入住记录--------");
		return biz.query();
	}
}
