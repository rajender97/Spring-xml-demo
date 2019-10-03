package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public  static  void main(String[] args) {

        ApplicationContext movie1=new ClassPathXmlApplicationContext("beans.xml");
        MovieName movieFirst= (MovieName) movie1.getBean("movie1");


        ApplicationContext movie2 = new ClassPathXmlApplicationContext("beans.xml");
        MovieName movie=(MovieName) movie1.getBean("movie2");

       // ApplicationContext movie1Again = new ClassPathXmlApplicationContext("beans.xml");
        ///MovieName movieagain= (MovieName)  movie1Again.getBean("movie1Again");



        System.out.println(movieFirst.getActor());
        System.out.println(movie.getActor());

        if(movieFirst == movie)
        {

            if(movieFirst.equals(movie))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}

