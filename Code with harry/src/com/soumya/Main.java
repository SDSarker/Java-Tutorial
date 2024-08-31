package com.soumya;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.

//ctrl+slash = comment out
public class Main {

    static int sum(int a,int b){                //static means main class er kono object er upor depend kore na
        return a+b;
    }
    public static void main(String[] args) {

        /*
        System.out.println("Hello and welcome!");

        //Variables: String,int,float,char,boolean;

        String name = "Soumya";
        System.out.println(name);

        int a = 45;
        float b= 45.22f;
        boolean isAdult=false;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println(isAdult);

        //Rules to constructing names of variable
            //can contain digits,underscore,dollar,signs,letter
            //Should begin with with a letter ,$ or _
            //should not contain whitespace
            //cannot use reserve keyword


        //two types of data type:
            //1.primitive- byte(1byte),short(2bytes),int(4bytes),long(8bytes),float(4bytes),
            double(8bytes),boolean(1bit),char(2bytes).//

            //2.Non-primitive or reference data type=string
                //memories is not fixed
                //we can get object methods
        byte u = -56;
        System.out.println(u);
        //byte u = -678;  //error

        double d=12.33456413432d;
        System.out.println(d);

        char c='A';
        System.out.println(c);


        //Operator

        //Operand,operator,operand= result
        //4         +       7     =  11

        //types of operator in java
        //Arithmetic
        //Assignment
        //logical
        //comparison

        int num1=45,num2=50;
        System.out.print("Num1 + Num2 = ");
        System.out.println(num1+num2);



        //Taking input in java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        String input = scan.nextLine();  //reads a line
        System.out.println(input);

        input= scan.next();
        System.out.println(input); //reads only until white space

        int age= scan.nextInt();
        System.out.println(age);


        */


        //String methods

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scan.nextLine();
        System.out.println("Enter the institution:");
        String ins = scan.next();
        System.out.println("This is "+name+" from "+ins);
        System.out.println(name.length());
        System.out.println(ins.toUpperCase());
        System.out.println("This is \""+name+"\"  from "+ins);
        */


        //Math class
        /*
        int num1=4,num2=7;
        System.out.println(Math.max(4,7));  //math inbuild
        System.out.println(Math.sqrt((36)));
        System.out.println(Math.abs(-3455));
        System.out.println(Math.random());  //random between 0 and 1
        System.out.println(4+Math.random()*(8-4));
        */

        //Conditionals
//        Scanner scan= new Scanner(System.in);
//        int age= scan.nextInt();
//        if(age>18){
//            System.out.println("Not allowed");
//        }
//        else{
//            System.out.println("Allowed");
//        }

        //switch statement:

//        Scanner scan = new Scanner(System.in);
//        int num=scan.nextInt();
//        switch(num){
//            case 80:
//                System.out.println("Your mark is 80");
//                break;
//            case 70:
//                System.out.println("Your mark is 70");
//                break;
//            case 60:
//                System.out.println("Your mark is 60");
//                break;
//            default:
//                System.out.println("You didn't match any of the cases");
//        }

        //Loop

//        int i=0;
//        while(i<20){
//            System.out.println(i);
//            i++;
//        }

        //while , do while, for similar to c


        //arrays:
//        int []arr= {12,23,453,2,1,3};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //for each loop:
//        int []arr= {12,23,453,2,1,3};
//        for(int value:arr){
//            System.out.println(value);
//        }

        //try-catch

//        String []car={"Toyota","Corrolla","Fielder","Axio","Premio"};
//        try{
//            System.out.println(car[5]);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("The end");

    }
}      