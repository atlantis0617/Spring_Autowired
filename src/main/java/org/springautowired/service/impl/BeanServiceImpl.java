package org.springautowired.service.impl;

import org.springautowired.dao.BeanDao;
import org.springautowired.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanServiceImpl implements BeanService{
	
	@Autowired
	private BeanDao beanDao;

	@Override
	public void save(String key) {
		System.out.println("BeanServiceImpl接受参数：" + key);
        beanDao.save(key);
	}

}
