package com.orilore.controller;

import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IPhotoBiz;
import com.orilore.model.Photo;

@RestController
@RequestMapping("/photo")
public class photoCtrl {
	@Resource
	private IPhotoBiz biz;
	private static final Logger log = LoggerFactory.getLogger(photoCtrl.class); 
	@RequestMapping("/save")
	public boolean save(Photo photo) {
		log.info("------保存房间号的照片-------");
		return biz.save(photo);
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		log.info("-------删除该房间号的照片---------");
		return biz.remove(id);
	}
	@RequestMapping("/find/{id}")
	public Photo find(@PathVariable("id") int id) {
		log.info("---- 查找id为"+id+"房间号的照片 ------");
		return biz.find(id);
	}
	@RequestMapping("/query")
	public List<Photo> query(){
		log.info("-----查找所有房间号的照片-------");
		return biz.query();
	}
	
}
