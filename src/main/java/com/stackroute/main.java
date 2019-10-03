package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MovieName Bahu = context.getBean("MovieName",MovieName.class);
        //MovieName Bahu = new MovieName("Bahubali","Prabas");
        Bahu.displayMovieInfo();
        //ActorName praba = new ActorName("22","prabas","Male");
        ActorName praba = context.getBean("ActorName",ActorName.class);
        praba.displayActorInfo();

    }

}
