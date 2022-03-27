package com.poly;
//Polymorphism: 2 types  compile time -within class function overloading
//run time ->inheritance : function overriding

//we use same name for some purpose
//display
//3 ways you can overload function
//function overloading
//declaring same function name by changing
//1.number of arguments
//2.by changing order of the arguments
//3.by changing the data type of the arguments

class DisplayOverload{
void display()//no argument function
{
System.out.println("No argument display");
}
void display(float i, float j) {
System.out.println("two float argument function "+i+ " and "+j);
}
void display(int i, float j) {//by changing order
System.out.println("int and float 2 arg "+i+ " and "+j);
}
void display( float j,int i) {
System.out.println("int and float 2 arg "+i+ " and "+j);
}
void display(byte p) {
System.out.println("byte int "+p);
}
}

public class Polymorphism {

public static void main(String[] args) {
DisplayOverload ob=new DisplayOverload();
ob.display();//no arguments
ob.display(4.5f,6.5f);//float float
ob.display(4, 4.5f);//int float
ob.display((byte)4);//byte int

}

}



