package org.springautowired.mutil;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MultiBean {
	//使用@Autowired将所有实现BeanInterface接口的类放入list中,可用@Order指定顺序
    @Autowired
    private List<BeanInterface> list;
    
   //使用@Autowired将所有实现BeanInterface接口的类放入map中，bean ID作为key
    @Autowired
    private Map<String, BeanInterface> map;
    
    
    //使用@Qualifier缩小范围(指定唯一)
    @Autowired
    @Qualifier("beanInterfaceImpl2")
    private BeanInterface beanInterface;
    
  //@Resource通过名字注入，与上一样
    @Resource
    private BeanInterface beanInterfaceImpl2;
     
    public void say() {
         
        if(list != null && list.size() > 0) {
            System.out.println("list...");
            for(BeanInterface bean: list) {
                System.out.println(bean.getClass().getName());
            }
        }else{
            System.out.println("List<BeanInterface> is null");
        }
         
        if(map != null && map.size() > 0) {
            System.out.println("map...");
            for(String key: map.keySet()){
                System.out.println(key + "   " + map.get(key).getClass().getName());
            }
        }else{
            System.out.println("Map<String, BeanInterface> is null");
        }
         
        System.out.println("@Qualifier...");
        if(beanInterface != null){
            System.out.println(beanInterface.getClass().getName());
        }else{
            System.out.println("beanInterface is null");
        }
         
        System.out.println("@Resource...");
        if(beanInterfaceImpl2 != null){
            System.out.println(beanInterfaceImpl2.getClass().getName());
        }else{
            System.out.println("beanInterfaceImpl2 is null");
        }
    }
    
}
