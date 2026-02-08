// public class Demo 
// {
//     public static void main(String[] args) {

//         double x = 8.8;
//         double y = 9.8;

//         int 
//         boolean result = x >= y;

//         System.out.println(result);
//     }
//}

// public class Demo 
// {
//     public static void main(String[] args) {

//         int x = 7;
//         int y = 5;
//         int a = 5;
//         int b = 9;

//         // boolean result = x >y && a < b ;
//         // boolean result = x >y || a < b || a > 1 ;
//         boolean result = a > b ;
//         System.out.println(!result);
//     }
// }

// public class Demo 
// {
//     public static void main(String[] args) {

//         int x = 28;

//         if(x>10 && x<=20) // 11 - 20
//             System.out.println("Sumanth");
//         else
//             System.out.println("Reddy");

//     }
// }

// public class Demo 
// {
//     public static void main(String[] args) {

//         int x = 8;
//         int y = 7;

//         if(x>y) 
//         {
//             System.out.println(x);
//             System.out.println("Thank you");
//         }
//         else
//             System.out.println(y);

//     }
//}

// public class Demo 
// {
//     public static void main(String[] args) {

//         int x = 8;
//         int y = 7;
//         int z = 9;

//         if(x>y && x>z) // by any chance this is false
        
//             System.out.println(x);
//         else if (y>x && y>z)
//             System.out.println(y);
//         else
//             System.out.println(z);

//     }
// }

// ternery operation

// public class Demo 
// {
//     public static void main(String[] args) {

//         int n = 5;
//         int result = 0;

//         // if(n%2==0)
//         //     result = 10;
//         // else
//         //     result = 20;

//         // ?:

//         result = n%2==0? 10 : 20;
//         System.out.println(result);
     

//     }
// }

// Switch Statement

// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         int n= 8;

//         switch(n){

//         case 1:
//         System.out.println("Monday");
//         break;
//         case 2:
//         System.out.println("Tuesday");
//         break;
//         case 3:
//         System.out.println("Wednesday");
//         break;
//         case 4:
//         System.out.println("Thursday");
//         break;
//         case 5:
//         System.out.println("Friday");
//         case 6:
//         System.out.println("Saturday");
//         break;
//         case 7:
//         System.out.println("Sunday");
//         break;
//         default:
//             System.out.println("MyDay");

//         }

//         // if(n==1)
//         // System.out.println("Monday");
//         // else if(n==2)
//         // System.out.println("Tuesday");
//         // else if(n==3)
//         // System.out.println("Wednesday");
//         // else if(n==4)
//         // System.out.println("Thursday");
//         // else if(n==5)
//         // System.out.println("Friday");
//         // else if(n==6)
//         // System.out.println("Saturday");
//         // else
//         // System.out.println("Sunday");

//     }
// }

// LOOPS

// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         // repeat these statement 4 times
//         // loop - while, do while, for

//     int i = 1;

//     while(i<=4)
//         {
//             System.out.println("Sumanth " + i );
//             i++;
//         }

//         System.out.println("Reddy " + i);
//     }
// }

// Nested Loop

// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         // repeat these statement 4 times
//         // loop - while, do while, for

//     int i = 1;

//     while(i<=4)
//         {
//             System.out.println("Sumanth " + i );
//             int j = 1;
//             while(j<=3){
//                 System.out.println("Madhira " + j);
//                 j++;
//             }
//             i++;
//         }

//         System.out.println("Reddy " + i);
//     }
// }

// Do While

// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         // repeat these statement 4 times
//         // loop - while, do while, for

//     int i = 5;

//         do
//         {
//             System.out.println("Sumanth " + i );

//             i++;
//         }while(i<=4);
//     }
    
// }

// FOR LOOP

// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         // repeat these statement 4 times
//         // loop - while, do while, for

    

//         for(int i=0;i<4;i++)
//         {
//             System.out.println("Sumanth " + i );

        
//         }
//     }
    
// }


// public class Demo 
// {
//     public static void main(String[] args)
//     {
//         // repeat these statement 4 times
//         // loop - while, do while, for

    

//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Day " + i );
//             for(int j=1;j<9;j++)
//             {
//             System.out.println("  " + (j+8) + "-" + (j+9));
//             }
        
//         }
//     }
    
//}

//OOPS
// object oriented programming
// object - properties and behaviours

// class caluculator
// {
//     int a;
//     public int add(int n1, int n2)
//     {
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int num1=4;
//         int num2=5;

//         caluculator clac = new caluculator();

//         int result = clac.add(num1,num2);

//         //int result = num1 + num2;
//         System.out.println(result);

//     }
// }

// class Computer
// {
//     public void palyMusic()
//     {
//         System.out.println("Music Playing");

//     }

//     public String getMePen(int cost)
//     {
//         if(cost >+10)
//             return "pen";
//         else
//             return "Nothing";
//     }
// }
// public class Demo
// {
//     public static void main(String a[])
//     {
//        Computer obj = new Computer();
//        obj.palyMusic();
//        String str = obj.getMePen(2);
//        System.out.println(str);

//     }
// }

import java.lang.classfile.instruction.StackInstruction;

/// method overloading

// class caluculator
// {
//     public int add(int n1, int n2, int n3)
//     {
//         return n1 + n2 + n3;
//     }
//     public int add(int n1,int n2)
//     {
//         return n1 + n2;
//     }
//     public double add(double n1, int n2)
//     {
//         return n1 + n2;
//     }

// }

// public class Demo
// {
//      public static void main(String a[])
//      {
//         caluculator obj = new caluculator();
//         int r1 = obj.add(3,4);
//         System.out.println(r1);

//      }
// }

// class caluculator
// {

//     int num=5;


//     public int add(int n1, int n2)
//     {
//         //System.out.println(num);
//         return n1 + n2;
//     }
   

// }

// public class Demo
// {
//      public static void main(String a[])
//      {
//         caluculator obj = new caluculator();
//         caluculator  obj1 = new caluculator();
//         int r1 = obj.add(3,4);
//         //System.out.println(r1);

//         obj.num = 8;

//         System.out.println(obj.num);
//         System.out.println(obj1.num);

//      }
// }

// Array

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[] = {3,7,2,4};
//         nums[1] = 6;

//         System.out.println(nums[1]);
//     }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[] = new int[4];
//         nums[0] = 4;
//         nums[1] = 8;
//         nums[2] = 3;
//         nums[3] = 9;


//         for(int i=0;i<=3;i++)
//         {
//             System.out.println(nums[i]);

//         }
        
//     }
// }



// Multi dimentional Array


// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[][] = new int [3][4];

//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//                 nums[i][j] = (int)(Math.random() * 10);
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }

//         for(int n[] : nums)
//         {
//             for(int m: n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }

        
//     }
// }


// jagged array

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[][] = new int [3][]; //jagged array

//         nums[0] = new int[3];
//         nums[1] = new int[4];
//         nums[2] = new int[2];

//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
    
//         }

//         for(int n[] : nums)
//         {
//             for(int m: n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }

        
//     }
// }


// 3 Dimentional array

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[][][] = new int [3][4][5]; // 3D Array


//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
    
//         }

//         for(int n[] : nums)
//         {
//             for(int m: n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }

        
//     }
// }



// class Student
// {
//     int rollno;
//     String name;
//     int marks;
// }


// public class Demo
// {
//     public static void main(String a[])
//     {
//         Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Sumanth";
//         s1.marks = 88;

//         Student s2 = new Student();
//         s2.rollno = 2;
//         s2.name = "Madhira";
//         s2.marks = 67;

//         Student s3 = new Student();
//         s3.rollno = 3;
//         s3.name = "Reddy";
//         s3.marks = 99;

//         Student students[] = new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for(int i=0;i<students.length;i++)
//         {
//             System.out.println(students[i].name + " : " + students[i].marks);
//         }
        


        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.println(nums[i]);
        // }
//     }
// }


// For each loop


// class Student
// {
//     int rollno;
//     String name;
//     int marks;
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         // int nums[] = new int[4];
//         // nums[0] = 4;
//         // nums[1] = 8;
//         // nums[2] = 3;
//         // nums[3] = 9;

//         // // for(int i=0;i<nums.length;i++)
//         // // {
//         // //     System.out.println(nums[i]);
//         // // }

//         // for(int n : nums)
//         // {
//         //     System.out.println(n);
//         // }

//         Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Sumanth";
//         s1.marks = 88;

//         Student s2 = new Student();
//         s2.rollno = 2;
//         s2.name = "Madhira";
//         s2.marks = 67;

//         Student s3 = new Student();
//         s3.rollno = 3;
//         s3.name = "Reddy";
//         s3.marks = 99;

//         Student students[] = new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         // for(int i=0;i<students.length;i++)
//         // {
//         //     System.out.println(students[i].name + " : " + students[i].marks);
//         // }

//         for(Student stud : students)
//         {
//             System.out.println(stud.name + " : " + stud.marks);
//         }
//     }
// }


//STRINGS


// public class Demo
// {
//     public static void main(String a[])
//     {
//         String  name = "Sumanth";
//         name = name + " Reddy";
//         System.out.println("hello " + name);
        


//     }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         StringBuffer sb = new StringBuffer("Sumanth");
//         sb.append(" Reddy");

        

//          //sb.insert(7, " java ");
//         //sb.setLength(30);

//         String str = sb.toString();

//         System.out.println(sb);
      
//     }
//}


// STATIC KEYWORD

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;

//     public void show()

//     {

//     System.out.println(brand + " : " + price + " : " + name);
// }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//       Mobile obj1 = new Mobile();
//       obj1.brand = "Apple";
//       obj1.price = 15000;
//       Mobile.name = "SmartPhone";

//       Mobile obj2 = new Mobile();
//       obj2.brand = "Samsung";
//       obj2.price = 1700;
//       Mobile.name = "SmartPhone";

//       obj1.name = "Phone";

//       obj1.show();
//       obj2.show(); 


//     }
// }


// STATIC 

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;

//     static 
//     {
//         name ="Phone";
//         System.out.println("in static block");

//     }

//     public Mobile()
//     {
//         brand = "";
//         price = 200;
//         System.out.println("in Constructor");
        
//     }

//     public void show()

//     {

//     System.out.println(brand + " : " + price + " : " + name);
//     }

// }

// public class Demo
// {
//     public static void main(String a[]) throws ClassNotFoundException
//     {
//         Class.forName("Mobile");
//     //   Mobile obj1 = new Mobile();
//     //   obj1.brand = "Apple";
//     //   obj1.price = 15000;
//     //   Mobile.name = "SmartPhone";

//     //   Mobile obj2 = new Mobile();
 
//     }
// }

//Static Method

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;

//     public void show()

//     {

//     System.out.println(brand + " : " + price + " : " + name);
//     }
//     public static void show1(Mobile obj)
//     {
//         System.out.println(obj.brand + " : " + obj.price + " : " + name);
//     }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//       Mobile obj1 = new Mobile();
//       obj1.brand = "Apple";
//       obj1.price = 15000;
//       Mobile.name = "SmartPhone";

//       Mobile obj2 = new Mobile();
//       obj2.brand = "Samsung";
//       obj2.price = 1700;
//       Mobile.name = "SmartPhone";

//       obj1.name = "Phone";

//       obj1.show();
//       obj2.show(); 

//       Mobile.show1(obj1);

//     }
// }


//ENCASPULATION////

// class Human
// {
//     private int age;
//     private String name;

//     public int getAge() 
//     {
//         return age;
//     }
//     public void setAge(int a) 
//     {
//         Human obj1 = new Human();
//         obj1.age = age;
//     }
//     public String getName() 
//     {
//         return name;
//     }
//     public void setName(String n) 
//     {
//         n = name;
//     }

    


// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         Human obj = new Human();
//         obj.setAge(30);
//         obj.setName("Sumanth");

//         System.out.println(obj.getName() + " : " + obj.getAge());

//     }
// }