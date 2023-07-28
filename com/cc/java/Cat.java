package com.cc.java;

public class Cat {

  private String firstName;
  private String furColor;
  private int age; 

  private int counter;


  
  public Cat(String firstName, String furColor, int age) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
  }

  public String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return firstName;
      case "#color":
        return furColor;
      default:
        return "ERROR!";
    }
  }

  public String getAge() {
      return checkEscalationLevel();
  }

  private String checkEscalationLevel() {

   counter++;

    switch (counter) {
      case 1:
        return "This is an inappropriate question!";   
      case 2:
        return "I've told you once!";
      case 3:
        return "Talk to the hand!";
      default:
        return "1#!?&&%";
    }
    
  }



}
  
