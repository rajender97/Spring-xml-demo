package com.stackroute;

import com.stackroute.ActorName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MovieName   {

    private ActorName actor;

    public MovieName(ActorName actor) {
        this.actor = actor;
    }

    public ActorName getActor() {
        return actor;
    }

    public void setActor(ActorName actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}