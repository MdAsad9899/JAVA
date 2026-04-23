import java.util.*;
// public class Array{
//     public static void main(String arg[]){

//         // creating an array.

//         int marks[] = new int[50];

//         // Taking input in array from user

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         // output.

//         System.out.println(" Phy : " + marks[0]);
//         System.out.println(" Che : " + marks[1]);
//         System.out.println(" Math : " + marks[2]);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("Total percentage :- " + percentage + "%");

//         // Updated

//         // marks[2] = marks[2] +1;
//         // System.out.println(" Math : " + marks[2]);

//         // length of an array

//         System.out.println("lenghth of an array is = "+ marks.length);
//     }
// }



// Passing arrays in function as an argunments

// public class Array{
//     public static void update(int marks[], int nonchangeable){
//         nonchangeable = 10;
//         for(int i=0; i<marks.length; i++){
//             marks[i] =  marks[i] + 1;
//         }
//     }

//     public static void main(String arg[]){
//         int marks[] = {97,98,99};
//         int nonchangeable = 5;
//         update(marks, nonchangeable);
//         System.out.println(nonchangeable);

//         // print updated value

//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }



//  Linear Search.


// public class Array{
//     public static int linearSearch(int numbers[], int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String arg[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 20;
//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("NOT Found");
//         }else{
//             System.out.println("Key is at index : " + index);
//         }
//     }
// }



// Largest Number
// Smallest value is : 1
// Largest value is : 6


// public class Array{
//   public static int getLargest(int nums[]){
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;
//     for(int i=0; i<nums.length; i++){
//       if(largest < nums[i]){
//           largest = nums[i];
//       }
//       if(smallest > nums[i]){
//         smallest = nums[i];
//       }
//     }
//     System.out.println("Smallest value is : " + smallest);
//     return largest;
//   }

//   public static void main(String arg[]){
//     int nums[] = {1,2,6,3,5};
//     System.out.println("Largest value is : " + getLargest(nums));
       
//   }
// }


// Binary Search code.
// index for key is : 4

// public class Array{
//   public static int binarySearch(int numbers[], int key){
//     int start = 0, end = numbers.length-1;

//     while(start <= end){
//       int mid = (start+end)/2;
      
//       if(numbers[mid] == key){
//         return mid;
//       }

//       if(numbers[mid] < key){
//         start = mid + 1;
//       }

//       if(numbers[mid] > key){
//         end = mid - 1;
//       }
//     }

//     return -1;
//   }

//   public static void main(String arg[]) {
//     int numbers[] = {2,4,6,8,10,12,14};
//     int key = 10;

//     System.out.println("index for key is : " + binarySearch(numbers, key));
//   }
// }



// Reverse of an Array
// 10 8 6 4 2 

// public class Array{

//   public static void reverse(int numbers[]){
//     int start = 0, last = numbers.length-1;

//     while(start < last){
//       //swap
//       int temp = numbers[last];
//       numbers[last] = numbers[start];
//       numbers[start] = temp;
//       start++;
//       last--;
//     }
//   }
//   public static void main(String arg[]){
//     int numbers[] = {2,4,6,8,10};

//     reverse(numbers);

//     for(int i=0; i<numbers.length; i++){
//       System.out.print(numbers[i] + " ");
//     }
//     System.out.println();
//   }
// }



// Pair of an Array
// (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)
// (6,8)(6,10)
// (8,10)

// public class Array{
//   public static void printPair(int numbers[]){
//     int tp = 0;
//     for(int i=0; i<numbers.length; i++){
//       int current = numbers[i];

//       for(int j=i+1; j<numbers.length; j++){
//         System.out.print("(" + current + "," + numbers[j] + ")");
//         tp++;
//       }
//       System.out.println();
//     }
//      System.out.println("totl pair is " + tp);

//   }
 
//   public static void main(String arg[]){
//     int numbers[] = {2,4,6,8,10};
//     printPair(numbers);
//   }
// }




// Print subarray
// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

public class Array{
  public static void printSubarrays(int numbers[]){
    int ts = 0;
    for(int i=0; i<numbers.length; i++){
      int start = i;
      for(int j=i; j<numbers.length; j++){
        int end = j;

        for(int k=start; k<=end; k++){
          System.out.print(numbers[k] + " ");
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total subarrays is : " + ts);

  }

  public static void main(String arg[]){
    int numbers[] = {2,4,6,8,10};
    printSubarrays(numbers);
  }
}