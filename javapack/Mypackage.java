package javapack;
import java.util.Scanner;
//package javapackages;

public class Mypackage {
  public static void main(String [] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your Name :");
    String name = myObj.nextLine();
    System.out.println("Thank you "+name);
  } 
}
