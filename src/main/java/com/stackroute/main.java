package com.stackroute;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

    public  static  void main(String args []) {

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        MovieName movieFirst= (MovieName) context.getBean("movie1");
        MovieName moviesecond=(MovieName)context.getBean("movie1");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        MovieName movie=(MovieName) applicationContext.getBean("movie2");
        MovieName movie2=(MovieName)applicationContext.getBean("movie2");

        MovieName movieB=(MovieName) applicationContext.getBean("movieB");


        System.out.println(movieFirst.getActor());

        System.out.println(movie.getActor());

        System.out.println(movie==movie2);

        System.out.println(movieFirst==moviesecond);
        System.out.println(movie==movie2);

        System.out.println(movieB.getActor());


    }
}


