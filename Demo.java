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

class caluculator
{

    int num=5;


    public int add(int n1, int n2)
    {
        //System.out.println(num);
        return n1 + n2;
    }
   

}

public class Demo
{
     public static void main(String a[])
     {
        caluculator obj = new caluculator();
        caluculator  obj1 = new caluculator();
        int r1 = obj.add(3,4);
        //System.out.println(r1);

        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);

     }
}
