package com.auto.finland;

public class Car {
    //    power - numb(power/float)
//    year - numb(inter)
//    fabrik - tetx String
//переменная экземпляра класса
   public double power;
   public int year = 2021;
   public String fabric = "audi";

//   статическая переменная
  public static int histYear = 1993;

  public void printParameters(){
//      декларация + аллокация = инициализация
      int year1;
      year1 = 1999;

      String result = "Our car is " + fabric + ", year = " + year;
      System.out.println(result);
  }
}
