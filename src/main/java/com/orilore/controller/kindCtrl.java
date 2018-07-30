package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IKindBiz;
import com.orilore.model.Kind;

@RestController
@RequestMapping("/kind")
public class kindCtrl {
	@Resource
	private IKindBiz biz;//这必须是接口，不能是实现类
	private static final Logger log = LoggerFactory.getLogger(kindCtrl.class);
	@RequestMapping("/find/{kid}")
	public Kind find(@PathVariable("kid") int id) {//接收上面的{kid}，传给int
		log.info("------------查询id为"+id+"的客房类型信息--------------");
		return biz.find(id);
	}
	@RequestMapping("/save")
	public boolean save(Kind kind) {
		log.info("---------------- 保存客房类型 ---------------");
		return biz.save(kind);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("--------------删除客房类型------------------");
		return biz.remove(id);
	}
	@RequestMapping("/query")
	public List<Kind> query(){
		log.info("-------查询客房类型列表--------");//日志级别受日志配置文件影响，手工日志用于记录该方法被调用
		return biz.query();//@requestParam强制填写参数 400传参的参数类型不对
		//年月日中的月用小写是数字，大写是汉字
	}
}
