package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.ICompanyBiz;
import com.orilore.model.Company;

@RestController
@RequestMapping("/company")
public class companyCtrl {
	@Resource
	private ICompanyBiz biz;
	private static final Logger log = LoggerFactory.getLogger("companyCtrl.class");
	@RequestMapping("/save")
	public boolean save(Company company) {
		log.info("--------保存公司信息--------");
		return biz.save(company);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("------删除公司信息------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Company find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"的公司 ------");
		return biz.find(id);
	}
	@RequestMapping("query")
	public List<Company> query(){
		log.info("------列出所有公司信息-------");
		return biz.query();
	}
}
