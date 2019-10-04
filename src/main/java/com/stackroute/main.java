package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public  static  void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie1");
        Movie movie2=(Movie)applicationContext.getBean("movie2");

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movieFirst= (Movie)context.getBean("movie1");

        System.out.println(movie.getActor());
        System.out.println(movie2.getActor());

        movie.setApplicationContext(applicationContext);
        movieFirst.setBeanFactory(context);
        movie.setBeanName("beam123");
    }
}