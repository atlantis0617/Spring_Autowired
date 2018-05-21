package org.springautowired.controller;

import org.springautowired.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BeanController {
	
	 @Autowired
	 private BeanService beanService;

	 public void save(String key) {
	        System.out.println("BeanController开始执行插入方法");
	        beanService.save(key);
     }

}
