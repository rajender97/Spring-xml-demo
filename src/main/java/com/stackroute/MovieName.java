package com.stackroute;

public class MovieName {
    private String MovieName;
    private String actorName;

    public void setMovieName(String MovieName) {
     this.MovieName= MovieName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void displayMovieInfo(){
        System.out.println("Movie Name is : " +MovieName+" And the Actor Name is : "+actorName);
    }
}
