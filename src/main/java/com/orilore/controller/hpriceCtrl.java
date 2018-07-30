package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IHpriceBiz;
import com.orilore.model.Hprice;

@RestController
@RequestMapping("/hprice")
public class hpriceCtrl {
	@Resource
	private IHpriceBiz biz;
	private static final Logger log = LoggerFactory.getLogger(hpriceCtrl.class);
	@RequestMapping("/save")
	public boolean save(Hprice hprice) {
		log.info("-------保存客房价格数据--------");
		return biz.save(hprice);
	}
	@RequestMapping("/remove/{id}")
	private boolean remove(@PathVariable("id") int id) {
		log.info("------- 删除客房价格数据 ----------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	private Hprice find(@PathVariable("id") int id) {
		log.info("------查找id为"+id+"的客房价格数据 -----");
		return biz.find(id);
	}
	@RequestMapping("/query")
	private List<Hprice> query(){
		log.info("--------查找所有客房价格数据----------");
		return biz.query();
	}
}
