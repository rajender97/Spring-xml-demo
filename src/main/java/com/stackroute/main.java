package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public  static  void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        MovieName movieFirst= (MovieName) context.getBean("movie1");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        MovieName movie=(MovieName) applicationContext.getBean("movie2");


        System.out.println(movieFirst.getActor());
        System.out.println(movie.getActor());


    }
}