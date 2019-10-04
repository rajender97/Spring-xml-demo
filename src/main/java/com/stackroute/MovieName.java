package com.stackroute;

import com.stackroute.ActorName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private ActorName actor;
    private ApplicationContextAware applicationContextAware;
    private  BeanFactoryAware beanFactoryAware;
    private  BeanNameAware beanNameAware;

    public Movie(ActorName actor) {
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

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println(s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}