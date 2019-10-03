package com.stackroute;

public class MovieName {

   ActorName actor;
    public ActorName getActor() {
        return actor;
    }

    public void setActor(ActorName actor) {
        this.actor = actor;
    }


  // MovieName movie;
    //public MovieName getMovie() {
      //  return movie;
    //}
   // public void setMovie(MovieName movie){
     //   this.movie = movie;
    //}


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';

    }


}