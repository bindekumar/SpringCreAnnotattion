package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestClient {

	public static void main(String[] args) {
   ApplicationContext ac=new ClassPathXmlApplicationContext("TestCfg.xml");
    Test t=(Test) ac.getBean(TestBean.class);
    t.display();
	}

}
