package mav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empolyee {
  String name ;
  static int count=1;
  int id ;






  public Empolyee() {

  }

  double salary =id*1000 ;
  public Empolyee(String name){

this.name = name ;
this.id =count;
this.salary=count*1000;
count ++;

  }

  public String getName() {
    return name;
  }

  public static int getCount() {
    return count;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void setCount(int count) {
    Empolyee.count = count;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public java.lang.String toString(){
    return "Empolyee"+
            "name"+ name +" id " +id + " " + salary;



  }
public void display(){


  System.out.println("name" + " " +name +"" + " "+"id" + " "+ id + " "+ salary);





}
  public void array(){
    List<String> Emp=new ArrayList<String>();
    Emp.add("ahmed");
    Emp.add("mohamed");
    Emp.add("sasa");
    Emp.add("tolpa");
    Emp.add("jskj");
    Emp.add("abdo");
    Emp.add("nono");
    Emp.add("khaled");
    Emp.add("tamer");
    Emp.add("oamr");

    System.out.println(Emp);



  }

}
