package com.stackroute;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

    public  static  void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("cycle");
    }
}