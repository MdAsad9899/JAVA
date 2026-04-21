// let's learn Function in JAVA.
// Here is written in function syntax with Example.



// public class Function{
//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
//     public static void main(String arg[]){
//         printHelloWorld();
//     }
// }



// Here is written in function syntax with parameter and  Example as well.


// import java.util.*;
// public class Function{

//     public static void calculateSum() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum is : " + sum);        
//     }

//     public static void main(String arg[]){
//         calculateSum();
//     }
// }



// import java.util.*;
// public class Function{

//     public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("sum is : " + sum);
//     }
// }


// call by value or swaping normal way.

// import java.util.*;
// public class Function{

//     public static void main(String arg[]){
//         // Swap - values exchanges.
//         int a = 5;
//         int b = 10;

//         // swap 
//         int temp = a;
//         a = b;
//         b=temp;
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//     }
// }



// call by value by using function method swaping.

// import java.util.*;
// public class Function{

//     public static void swap(int a , int b){
//         int  tem = a;
//         a = b;
//         b = tem;
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//     }

//     public static void main(String arg[]){
//         // Swap - values exchanges.
//         int a = 5;
//         int b = 10;

//         swap(a, b);
//     }
// }



// Find Product of a & b;


<<<<<<< HEAD
// import java.util.*;
// public class Function{

//     public static void product(int a , int b){
//         int mult = a*b;
//         System.out.println("a : " + mult);
//     }

//     public static void main(String arg[]){
//         // Swap - values exchanges.
//         // int a = 5;
//         // int b = 10;

//         product(4, 9);
//     }
// }



// Factorial of a number, n



// import  java.util.*;
// public class Function{
//     public static int factorial(int n){
//         int f =1;

//         for(int i=1; i<=n; i++){
//             f *= i;
//         }
//         return f;

//     }
//     public static void main(String arg[]){
//         System.out.println(factorial(3));
//     }
// }



// binomial coefficient


// public class Function{
//     public static int factorial(int n){
//         int f = 1;
//         for(int i=1; i<=n; i++){
//             f*=i;
//         }
//         return f;
//     }

//     public static int binCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n / (fact_r*fact_nmr);
//         return binCoeff;

//     }
//     public static void main(String arg[]){
//         System.out.println(binCoeff(5, 2));
//     }
// }




// Here conceept of Function overloading using parameter.


// public class Function{

//     // fuction to calculate sum of 2 number.
//     public static int sum(int a, int b){
//         return a+b;
//     }

//     // fuction to calculate sum of 3 number.
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }

//     public static void main(String arg[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,5,2));
//     }
// }



// Here concept of Function overloading using data type.

// public class Function{
//     // function to calculate int sum.

//     public static int sum(int a, int b){
//         return a+b;
//     }

//     // function to calculate float sum.
//     public static float sum(float a, float b){
//         return a+b;
//     }

//     public static void main(String arg[]){
//         System.out.println(sum(4,2));
//         System.out.println(sum(4.3f,2.7f));
//     }
// }




// check a number is prime or not

// public class Function{

//     public static boolean isPrime(int n){
//         boolean isPrime = true;

//         for(int i=2; i<=(n-1); i++){
//             if(n%i == 0){
//                 isPrime = false;
//             }else{
//                 isPrime = true;
//             }
//         }
//         return isPrime;
//     }

//     public static void main(String arg[]){
//       System.out.println(  isPrime(5));
//     }
// }




// public class Function{
//     public static boolean isPrime(int n){

//         // corner cases
//         // 2
//         if(n == 2){
//             return true;
//         }

//         for(int i=2; i<=(n-1); i++){
//             if(n%i == 0){
//                return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String arg[]){
//       System.out.println(isPrime(5));
//     }
// }



// check a number is prime or not with optimized version.

// import java.util.*;
// public class Function{
//     public static boolean isPrime(int n){

//         if(n == 2){
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String arg[]){
//             System.out.println(isPrime(16));
//     }
// }



// Print all primes in a range


// import java.util.*;
// public class Function{


//     public static boolean isPrime(int n){
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primeInRange(int n){
//         for(int i=2; i<=n; i++){
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String arg[]){
//         primeInRange(20);
//     }
// }



// Convert Binary to decimal

// import java.util.*;
// public class Function{
//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;
        
//         while(binNum > 0){
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//             pow++;
//             binNum = binNum / 10;

//         }
//         System.out.println("decimal of " + myNum +" = " + decNum);
//     }

//     public static void main(String arg[]){
//         binToDec(101);
//     }
// }



// Convert decimal to Binary.

import java.util.*;

// public class Function{
//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n>0){
//             int rem = n%2;

//             binNum = binNum + rem * (int)Math.pow(10, pow);
//             pow++;
//             n = n/2;
//         }
//         System.out.println("binary form of " + myNum + " = " + binNum);
//     }
//     public static void main(String arg[]){
//         decToBin(7);
//     }
// }


// Method scope in scope with expample.

// import java.util.*;
// public class fuction{
//     public static void printS(){
//         int s = 6;
//     }
//     public static void main(String arg[]){
//         System.out.println(s);
//         int s = 9;
//         System.out.println(s);
//     }
// }



// Block scope in scope with expample.

// public class Function{
//     public static void main(String arg[]){
//         int p = 122;
//             System.out.println(p);
//         {
//             int s = 78;
//             // System.out.println(s);
//                 System.out.println(p);
//         }
//         //  System.out.println(p);
//          System.out.println(p);
//     }
// }


// Practice Ouestion.

import java.util.*;
public class Function{
    public static void avgNum0(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a+b+c)/3.0;
        System.out.println(avg); 
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse*10+remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }

    public static int sumDigit(int n){
        int sumOfDigits = 0;

        while(n > 0){
            int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }
 
    public static void main(String arg[]){

        // Practice  question no 01.
        // avgNum0();


        // Practice  question no 02.

        // Scanner sc = new Scanner(System.in);
        // int num ;
        // System.out.println("Enter an integer number :-");
        // num = sc.nextInt();
        // if(isEven(num)){
        //     System.out.println("Number is even");
        // }else{
        //     System.out.println("Number is odd");
        // }


        // Practice  question no 03.


        // System.out.println(" Enter Your number :-");
        // Scanner sc = new Scanner(System.in);
        // int palindrome = sc.nextInt();
        // if(isPalindrome(palindrome)){
        //     System.out.println("Number is " + palindrome + " is palindrome");
        // }else{
        //     System.out.println("Number is " + palindrome + " is not  palindrome");
        // }

        // Practice  question no 04.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an integer :-");
        int digits = sc.nextInt();
        System.out.println(" The sum is " + sumDigit(digits));
=======
import java.util.*;
public class Function{

    public static void product(int a , int b){
        int mult = a*b;
        System.out.println("a : " + mult);
    }

    public static void main(String arg[]){
        // Swap - values exchanges.
        // int a = 5;
        // int b = 10;

        product(4, 9);
>>>>>>> origin/master
    }
}