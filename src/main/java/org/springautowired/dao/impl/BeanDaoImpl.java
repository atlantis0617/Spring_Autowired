package org.springautowired.dao.impl;

import org.springautowired.dao.BeanDao;
import org.springframework.stereotype.Repository;

@Repository
public class BeanDaoImpl  implements BeanDao{

	@Override
	public void save(String key) {
		System.out.println("BeanDaoImpl保存成功，保存的数据为：" + key);
	}

}
