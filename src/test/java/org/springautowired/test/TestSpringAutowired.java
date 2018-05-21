package org.springautowired.test;

import org.junit.Test;
import org.springautowired.controller.BeanController;
import org.springautowired.mutil.MultiBean;

public class TestSpringAutowired extends TestBase{
	
	
	/**
     * 构造函数初始化spring配置文件
     */
    public TestSpringAutowired() {
         
        super("classpath:spring_autowired.xml");
         
    }
    
    
    /**
     * 测试@autowired在成员变量、构造器和setter方法上
     */
    @Test
    public void testAutoWired() {
         
        BeanController beanController = (BeanController) super.getBean("beanController");
        beanController.save("test");
         
    }
    
    
    /**
     * 测试@Autowired装配指定类型的数组和key为String的Map
     */
    @Test
    public void testAutoWired2() {
         
        MultiBean bean = (MultiBean) super.getBean("multiBean");
        bean.say();
         
    }
}
