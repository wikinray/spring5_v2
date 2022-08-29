package com.tsing.learn.spring.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
    public static void main(String[] args) {
        XmlBeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean=beanFactory.getBean("myTestBean",MyTestBean.class);
        System.out.println(myTestBean.getTestStr());

        System.out.println("---------------------------------------");

        DefaultListableBeanFactory beanFactory2=new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory2).loadBeanDefinitions(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean2=beanFactory.getBean("myTestBean",MyTestBean.class);
        System.out.println(myTestBean2.getTestStr());
    }
}
