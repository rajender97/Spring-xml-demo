package com.stackroute;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

    public  static  void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        MovieName movie=(MovieName) applicationContext.getBean("movie1");
        MovieName movie1=(MovieName)applicationContext.getBean("movie2");

        System.out.println(movie.getActor());
        System.out.println(movie1.getActor());
    }
}