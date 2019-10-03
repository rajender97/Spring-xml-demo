package com.stackroute;

public class ActorName {
    private String ActorName;
    private String Age;
    private String Gender;

    public void setAge(String age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setActorName(String Age) {
        this.Age = Age;
    }
    public void displayActorInfo(){
        System.out.println("Actor Name is : " +ActorName+" And the Actor Gender is : "+Gender+" And Age of Actor is : "+Age);
    }
}
