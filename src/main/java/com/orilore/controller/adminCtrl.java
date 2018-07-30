package com.orilore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IAdminBiz;
import com.orilore.model.Admin;
@RestController
@RequestMapping("/admin")
public class adminCtrl {
	private IAdminBiz biz;
	private static final Logger log = LoggerFactory.getLogger(adminCtrl.class);
	@RequestMapping("/find/{id}")
	public Admin find(@PathVariable("id") int id) {
		log.info("--------- 查找id为"+id+"的授权用户登录信息 ---------");
		return biz.find(id);
	}
	@RequestMapping("/save")
	public boolean save(Admin admin) {
		log.info("---------- 保存授权登录用户信息 -------------");
		return biz.save(admin); 
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------- 删除授权用户登录--------");
		return biz.remove(id);
	}
	@RequestMapping("/query")
	public List<Admin> query() {
		log.info("--------列出所有授权用户登录信息-----------");
		return biz.query();
	}
}
