package com.stackroute;

public class MovieName{

    ActorName actor;

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