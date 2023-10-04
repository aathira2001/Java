package com.exception;
public class example1{
  public static void main(String[] args)
  {
    System.out.println("START");
    int a=10;
    int b=0;
    try
      {
        int c=a/b;
        int b=0;
      }
    catch(ArithmeticException e)
      {
        System.out.println("can't divide by zero");
      }
    System.out.println("END")
      }
  }
