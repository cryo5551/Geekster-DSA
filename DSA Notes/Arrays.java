// "static void main" must be defined in a public class.
// Why we need array??
// when we handle big number of data we also need to create that many no. of datatyps
// for ex. we need to handle 4 students marks
//  we'll do it like this 
// int marksOfSuraj = 92; // out of 100
// int marksOfCryo = 69;
// int marksOfJack = 88;
// int marksOfFrankanstine = 100;
// pretty easy haan??
// now imagin you have to handle whole classes marks 
// now what? are you gonna sit down and gonna make N no of datatyps or try to find other way around it
// welp the other way around id array
//  array can be of any type int,char,long,short,double etc even String can be written as array
// how to declare array
// ex:-
//      int type:- int[]|arrayName| = |new| int[n]|; n is lenth of array from 0;
//      String type :- String[] arrayName = new int[n]; lenth of the array
// live ex down there
// public class Main {
    // public static void main(String[] args) {
//         System.out.println("Enter the no of Students in class");
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
//         System.out.println("The no of student in class "+ n +"\nAnd the marks obtained in maths is:-");
        // String[] array = new String[n]; //string array
        // int[] arr = new int[n];        // int array
//         for(int i=0;i<n;i++)
//         {
//             arr[i] = scan.nextInt();
//             scan.nextLine();
//             array[i] = scan.nextLine();
//             System.out.print(arr[i] + " ");
//             System.out.println(array[i]);
//         }
        
//     }
// }

// @importent once declared the sizeof array can't be changed.
// size of array uses static memory allocation
// we can play with the size of array in "array list" its a diff. kind of array we'll be learning in advance DSA

// another way of taking input is 
// 1.first take the no students
// 2.name of the students
// 3.lastly the marks of students
// we need 3 saperate loop for that
// 2 to take input sparetely and one to print them
// public class Main {
    // public static void main(String[] args) {
//         System.out.println("Enter the no of Students in class");
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
//         System.out.println("The no of student in class "+ n + "\nPlease enter the marks and name in order please" +"\nAnd the marks obtained in maths is:-");
//         String[] array = new String[n]; //string array
        // int[] arr = new int[n];        // int array
        // for(int i=0;i<n;i++)
        // {
            // arr[i] = scan.nextInt();
            // scan.nextLine();
        // }
        // for(int j=0;j<n;j++)
        // {
             // array[j] = scan.nextLine();
        // }
        // for(int k=0;k<n;k++){
//             System.out.print(arr[k] + " ");
//             System.out.println(array[k]);
//         }
        
// // sum of an array
//         int sum = 0;
//         for (int l=0;l<n;l++)
//         {
//             sum=sum+arr[l];
//         }
//         System.out.println("The sum of array is "+ sum);
        
// //liner search
//         int target =scan.nextInt();
        
//         // we have to use flag to print not found
        
//         boolean flag = false;
//         for (int r=0;r<n;r++)
//         {
//             if(arr[r]==target)
//             {
//                 System.out.println("target "+target+" found at index:"+r);
//                 flag =true;
//             }
//         }
//         if(flag != true)
//         {
//                 System.out.println("target not found");
//         }
        
// // Largest in array
//         // int largest=0;
//     // @importent corner cases
//     //if all the array is -ve then largest would be 0 for that case we have to do as follows
//         int largest = Integer.MIN_VALUE; 
//     //i'll take minimum value of integer that can be possible and compare it with array;
//         for(int t=0;t<n;t++)
//         {
//             if(arr[t]>largest)
//             {
//                 largest = arr[t];
//             }
//         }
//         System.out.println("the largest value in Array is: "+largest);
     
//     }
// }

                              // // // MEMORY MAPING IN ARRAY'S \\ \\ \\

//                                   int[] arr = new int[n];
//                                                           here:
//                                                                 int = A datatype;
//                                                                 arr = refrence variable;
//                                                                 new = Dynamic memory allocation
//                                                                 n   = no. of variables in array
// Memory maping in array's @importent;
// RAM: Random Access Memory;
// ram is devided into 2 parts in java (stack and heap);
// 1. Stack : Small organised memory part of ram (basically organised on top of each other);
// stack is nothing but information put on top of each other
// it basically works like a bag (last in first out);
// you have to start from top of the stack if you want the information below;
// all primitive datatypes(byte,short,int,long,double,boolean,char,float) are stored in stack;
// more on that:https://www.geeksforgeeks.org/stack-data-structure/
// 2. Heap : Large memory pool of unorganised memory(like trash dumping ground);
// it allocte memory wherever space is remaining
// can enter elements in any order and take it out in any order;
// all the nonprimitive datatypes(String,array,objects) are stored in heap;
// whenever you see "new" keyword that means data will be stored in heap @importent;

                                  // // // STACK V/S HEAP \\ \\ \\

//Small organised memory.                          // Large pool of unorganised memory.
// when ever memory is allocated in stack.         // when ever memory is allocated in heap.
// It is called "Static memory allocation".        // it is called"Dynamic memory allocation".
// Primitive datatypes are stored in stack.        // Non-primitive datatypes are stored in heap.
// Refrence variables are also stoed in stack.     // data with keyword "new" always stored in heap.
// ex. int,float,char,short,double,long, ETC.      // ex. String, Array, Objects;

// REFRENCE VARIABLE
// syntex of an array:    int[] arr = new int[n] (n size of the array);
// in this "arr is "REFRENCE VARIABLE"
// it is stored in stack and has the address of array stored in heap
// it's like this
//                _______________        _____________
//                ||stack|stack||        ||heap|heap||
//                ||  main     ||        ||    [4k8]||
//                ||  (8byts)  ||        ||[9][4][7]||  in the heap location is allocated randomly.
//                ||  arr^     ||        ||[4000]   ||  arr store that random value to access the array
//                ||  [4000]   ||        ||         ||      
//                ||           ||        ||         ||
//                ||stack|stack||        ||heap|heap||

// "arr" variable stored in stack with the refrence address of an  array thats how we can pronounce the // syntex.
// thats why it is declared a datatype but in reality it is refrence variable for an array 
// so its called "REFRENCE VARIABLE".
// in above ex arr storing 4000 that is the address of the first variable of array.
// arrays are stored in "CONTIGUES METHOD" so 1st elements adress is enough to access the entire array.

// we can say that the refrence variable stores the adress of a data structure stored in heap@importent
// so total memory allocated to a n variable array: { n*4byts(for int) + 8byts }

                                        // // // NEW \\ \\ \\
// new is keyword foe "Dynamic Memory Allocation"
// Dynamic memoryb allocation is nothing but allocation of memory at runtime in heap

                                    // // // CORNER CASES \\ \\ \\
// if the array is declared but not the dynamic memory alloction the
// i.e.      int[] arr;
// it'll show null value for refrence variable
// default value of refrence variable is "NULL".
// and refrence variable size is machine dependent normally its 8 byte.

                                // // // ADDRESS OF ARR[i] \\ \\ \\
// Array starts from 0 index why??
// we can say that if a array(arr) size of 4 is there and storing 0,4,6,10
// i.e    int [] arr = new int[4];
// so
//           arr[0] = 0;
//           arr[1] = 4;
//           arr[2] = 6;
//           arr[3] = 10;
// now if we assume the base address of first variable is 4010 then other adree wil be likew this
//           arr[i] = value;          Address                 formulas
//           arr[0] = 0;            4010 - 4013;             4010 + 0*4
//           arr[1] = 4;            4014 - 4017;             4010 + 1*4
//           arr[2] = 6;            4018 - 4021;             4010 + 2*4
//           arr[3] = 10;           4022 - 4025;             4010 + 3*4

// now we can say that if we know the Base address, diffrence b/w addresses we can get all the addresses
// here differnce is nothing but size of datatype
// 
// we can write formula   
//                              _______________________________________________
//                              | Address = Base address + i * sizeOfDatatype |

// to work this formula right we have to start the index from 0;



                    // // // PRIMITIVE DATATYPES V/S REFRENCE VARIABLE \\ \\ \\


// WAP to find the address of last block of an array
// given base address: 6000;

// @importent you can get the size of array by arr.length
public class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= scan.nextInt();
            System.out.print(arr[i] +" ");
        }
        
        // double[] arr = new double[n];
        // int baseAddress = 6000;
        // int i;
        // for(i=0;i<arr.length;i++)
        // {
        //     arr[i]= scan.nextDouble();
        //     System.out.println(arr[i]);
        // }
        // System.out.println("Address of the last element is " + (baseAddress + ((i-1)*Double.BYTES)));
        
// reverse an array
        // reverse an array
        // System.out.print("\nReverce array is '");
        // for(int j =n-1;j>=0;j--)
        // {
        //     System.out.print(arr[j] +" ");
        // }
        
// 2nd largest element in array@importent;
// if largest element is not repeated;
//         int largest = Integer.MIN_VALUE;
//         int secondLargest=0;
//         for(int j=0; j<n;j++)
//         {
//             if(arr[j]>largest){
//                 secondLargest = largest;
//                 largest= arr[j];
//             }
        
//             else if(arr[j]>secondLargest)
//             {
//                  secondLargest=arr[j];
//             }
                
//         }
        
//         System.out.println("\nLargest in array is "+largest);
//         System.out.println("second largest in array is "+ secondLargest);
// Smallest element in array;
        // int smallest = Integer.MAX_VALUE;
        //          for(int t=0;t<n;t++)
        // {
        //     if(arr[t]<smallest)
        //     {
        //         smallest = arr[t];
        //     }
        // }
        // System.out.println("\nThe smallest value in Array is: "+ smallest);
    // }
// }

//   find the second smallest also
        // int smallest = Integer.MAX_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;
        //          for(int t=0;t<n;t++)
        // {
        //     if(arr[t]<smallest)
        //     {
        //         secondSmallest = smallest;
        //         smallest = arr[t];
        //     }
        //     else if (arr[t]<secondSmallest)
        //         secondSmallest = arr[t];
        // }
        // System.out.println("\nThe smallest value in Array is: "+ smallest);
        // System.out.println("second smallest in array is "+ secondSmallest);
        
// WAP to find if araay has duplicate present if yes then
// show what is element and how many times its repeated; (times not now it will take some other algo.)
        // for ex stdin  "6" "13 10 45 29 10 29"
        // stdout 10 29
        // if no deplicate present then stdout "no deplicate present"
        // int count = 0;
        // boolean flag = false;
        // int var = 0;
        // int pp = 0;
        // System.out.print("\n");
        // for(int a=0;a<n;a++)
        // {
        //     for(int b=a+1;b<n;b++) 
        //     {
        //         if(arr[a]==arr[b] && a!=b)
        //         {
        //             var = arr[a];
        //             flag = true;
        //             // count++;
        //             if(pp!=var)
        //             {
        //                 System.out.print(var+" ");    
        //             }
        //             pp = var;
        //         }
        //     }
        // }
        // if(flag == false)
        // {
        //     System.out.println("\nno deplicate present");
        // }
        
// Array reversal technique
        
                             // // // TWO POINTER TECHNIQUE \\ \\ \\
        
// in this tachnique fisrt we need to find out - array is even or odd?? 
// even  
         // index              0   1   2   3   4
         // Array elements    10  30  69  45  88
         // Reverce array     88  45  69  30  10
// now lets see what is happnig here an tey to find a relation b/w two Arrays
        // we can here 0th index swapping with ith index i.e
        // 0 <-> 4    0 <-> ith index
        // 1 <-> 3    1 <-> (i-1) index
//                        :
        // 2 === 2    i/2 == i/2  index
        
// odd 
         // index              0   1   2   3   4   5
         // Array elements    10  30  69  45  88  25
         // Reverce array     25  88  45  69  30  10
// now lets see what is happnig here an tey to find a relation b/w two Arrays
        // we can here 0th index swapping with ith index i.e
        // 0 <-> 5    0 <-> ith index
        // 1 <-> 4    1 <-> (i-1) index
//                        :
        // 2 <-> 3    (i-1)/2) == (i+1)/2  index
        
// Prgram to reverce an array.
        // int j=0;
        // int m = arr.length;
        //  if(m == 0)
        // {
        //    System.out.print("Array don't have any element");
        // }
        
        // else if(m % 2 == 0)
        // {
        //     do{                           // int a=5, b=6, c;
        //         int temp = arr[j] ;       //c=a;
        //         arr[j] = arr[m-1];        //a=b;
        //         arr[m-1] = temp;          //b=c;
        //         j++;
        //         m--;
        //     }while(j<m);
        //      System.out.print("\n");
        //     for(int r=0;r<arr.length;r++)
        //     {
        //         System.out.print(arr[r] +" ");
        //     }
        // }
        
        // else
        // {
        //     do{
        //         int temp = arr[j] ;
        //         arr[j] = arr[m-1];
        //         arr[m-1] = temp;
        //         j++;
        //         m--;
        //     }while(j<=m);
        //      System.out.print("\n");
        //     for(int r=0;r<arr.length;r++)
        //     {
        //         System.out.print(arr[r] +" ");
        //     }
        // }
        
        
// gfg code for testcases
        // Scanner sc= new Scanner (System.in);
        // int t=sc.nextInt();
        
        // while(t > 0){
            // int n=sc.nextInt();
            // int arr[]=new int[n];
            // for(int i=0;i<n;i++)
                // arr[i]=sc.nextInt();
            
            // for(int i=0;i<n/2;i++){
                // int temp=arr[i];
                // arr[i]=arr[n-i-1];
                // arr[n-i-1]=temp;
            // }
            
            // for(int i=0;i<n;i++)
                // System.out.print(arr[i]+" ");
            
            // System.out.println();
            // t--;
        // }
// in this example two pointers move in opposite direction;     
// Other examples of two pointer techniques
        // fabbonaci series : in this two pointers move in same direction
        
// frequncy Array
        // WAP to find the frequncy of each alphabet present in array
        
        // int m = scan.nextInt();
        // char[] charArr = new char[m];
        // System.out.print("\n");
        // for(int i=0;i<m;i++)
        // {
        //     charArr[i]= scan.next().charAt(0);
        //     System.out.print(charArr[i] +" ");
        // }
        
        // Now to print frequncy of every char 
        // brute force approch
        
        // for(char i= 97;i<123;i++)
        // {
        //     int count =0;
        //     boolean flag = false;
        //     for(int j=0;j<m;j++)
        //     {
        //         if(i== charArr[j])
        //         { 
        //             count++;
        //             flag =true;
        //         }
        //     }
        //     if(flag == true)
        //     {
        //         System.out.print("\n");
        //         System.out.print("The frequncy of char "+ i +": "+ count);
        //     } 
        // }
        
        
// Frequncy Array concept
        // First make a frequncy array for a-z frequncys so size will be of 26
        // initial value in int array will be zero;
        // so leta assume we find char 'c' in char array
        // now we need to increase the frequncy of index c in frequncy array;
        // so as we know arrays are indexed from 0-(n-1) 
        // so convert c to index we need to substract ASCII values of c and a 
        // 'c'- 'a' that will give the index of c
        // cz 'a'-'a' = 97-97 = 0 that is a's index;
        // so 'b-'a' = b's index and so on
        // 'z'-'a' = z's index;
        
        // int[] freq = new int[26];
        // for(int i=0;i<m;i++)
        // {
        //     int index = charArr[i]-'a';
        //     freq[index]++;
        // }
        // System.out.print("\n[ ");
        // for(int i=0;i<26;i++)
        // {
        //         System.out.print(+freq[i]+" ");
        // }
        //  System.out.println("]");

// QUS: there are n students in a class thier marks are stored in a array 
// We have to determine how many students got 'O' grade 'A','B','C', 'D' grade
        // O>=91; A>=80; B>=70; C>=55; D>=33; F<33;
        // int countO=0;
        // int countA=0;
        // int countB=0;
        // int countC=0;
        // int countD=0;
        // int countF=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]>=91)
        //         countO++;
        //     else if(arr[i]>=80) countA++;
        //     else if(arr[i]>=70) countB++;
        //     else if(arr[i]>=55) countC++;
        //     else if(arr[i]>=33) countD++;
        //     else countF++;
        // }
        // System.out.println("\n");
        // System.out.println("The number of students who got 'O' Grade:"+countO);
        // System.out.println("The number of students who got 'A' Grade:"+countA);
        // System.out.println("The number of students who got 'B' Grade:"+countB);
        // System.out.println("The number of students who got 'C' Grade:"+countC);
        // System.out.println("The number of students who got 'D' Grade:"+countD);
        // System.out.println("The number of students who got 'F' Grade:"+countF);

// Right solution
        // optimized brute forece solution
        
        // int[] freq = new int[10];
        // System.out.print("\n");
        // for(int i=90;i>=0;i=i-10)
        // {
        //     int count=0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[j]>=i && arr[j]< i+10)
        //         {
        //             count++;
        //         }
        //     }
        //  System.out.print(count+" ");
        // }
        
// Now by using frequncy Array
        // size of array will be the no of grade you are giving to students
        // for example if youre giving only A, B, C, D, F grade then length will be 5
        // int thid case were taking grades O, A+,B,B+............F so n=10
        // o>=90. a+>=80, a>=70, b+>=60.......f<10
        // now array =
        //       F    D    D+   C   C+    B    B+   A   A+   O
        //      >=0 >=10 >=20 >=30 >=40 >=50 >=60 >=70 >=80 >=90
        // if we need the index number for these we need to do is use divide (/) oprator 
        // /10
        
        
        // int[] freq = new int[10];
        // System.out.print("\n");
        // for(int i=0;i<n;i++)
        // {
        //    int index = arr[i]/10;
        //    freq[index]++;
        // }
        // for(int i=0;i<10;i++)
        // {
        //     System.out.print(+freq[i]+" ");
        // }
        
// sum of all Ranges in an Array
        // System.out.print("\n");
        // for(int i=0;i<n;i++)
        // {
        //     int count=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         count= count +arr[j];
        //         System.out.println("["+i+","+j+"] = "+count+" "); 
        //     }
        // }
        
//sum of given range
        // means sum of a given range
        // so well have to takr input for the ranges first and run the loop accordigly
        // System.out.print("\n");
        // int rS = scan.nextInt();
        // int rE = scan.nextInt();
        // int sum =0;
        // for(int i=rS;i<=rE;i++)  // time complaxity for this is: (rS-rE)+1   @importent
        // {
        //     sum = sum+ arr[i];
        // }
        // System.out.println(sum);
        
// sum of multiple given ranges
        // if user is asking multiple quries then we have to take that AS INPUT FIRST
        // int noOfQ = scan.nextInt();
        // System.out.print("\n");
        // for(int j=1;j<=noOfQ;j++)
        // {
        //     int rS = scan.nextInt();
        //     int rE = scan.nextInt();
        //     int sum =0;
        //     for(int i=rS;i<=rE;i++)  // time complaxity for this is: (rS-rE)+1   @importent
        //     {
        //         sum = sum+ arr[i];
        //     }
        //     System.out.println(sum);
        // }
        
// Now well try optimizes approach for this problem
        // that is called prefix sum
        // first well make a prefix sum array that sotores the sum of all rangesthat starts form 
        // for example if length id 3 then prefixsum array is  sum of (0,0), (0,1), (0,2)
        
        // int[] prefix = new int[n];  //prefix sum Array
        // int sum =0;
        // System.out.print("\n");
        // for(int i=0;i<n;i++)
        // {
        //     sum =sum + arr[i];
        //     prefix[i] = sum;
        //     System.out.print(prefix[i]+" ");
        // }
        // // now take no of queries
        // int noOfQ = scan.nextInt();
        // System.out.print("\n");
        // for(int j=1;j<=noOfQ;j++)
        // {
        //     int rS = scan.nextInt();
        //     int rE = scan.nextInt();
        //     if(rS>rE) System.out.println(0);
        //     else if(rS==0)
        //     {
        //         System.out.println(prefix[rE]);
        //     }
        //     else
        //     {
        //         int ans = prefix[rE]-prefix[rS-1];
        //         System.out.println(ans);    
        //     }
        // }
        
// 1732. Find the Highest Altitude
        // My Approach
        // int n = gain.length;
        // int[] arr = new int [n+1];
        // for(int i=1;i<n+1;i++)
        // {
        //     arr[0]=0;
        //     arr[i]= gain[i-1]+arr[i-1];
        // }
        // Arrays.sort(arr);
        // return(arr[n]);
      
        // Class Approach
        // int hight=0;
        // int max= 0;
        // for(int i=0;i<gain.length;i++)
        // {
        //     hight = hight + gain[i];
        //     if(max<hight) max=hight;
        // }
        // return max;
        
// 724. Find Pivot Index
        // Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.
    // https://leetcode.com/problems/find-pivot-index/
    // Find Pivot Index
// The pivot index is the index where the sum of all the numbers strictly to the left of the  index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
    //so now we are creating prefix sum array starting with 0 sum;
    // after that we have to make another sum array but backward direction so we can compare the sums;
        
        // int[] prefix = new int[n+1];  //prefix sum Array
        // int sum =0;
        // System.out.print("\n");
        // for(int i=0;i<n;i++)
        // { 
        //   prefix[i+1] = prefix[i] + arr[i];
        // }
        // for(int i=0;i<n+1;i++)
        // { 
        //     System.out.print(prefix[i]+" ");
        // }
        // int[] backSum = new int[n+1];
        // for(int i=n;i>0;i--)
        // { 
        //     backSum[i-1] = prefix[n]-prefix[i-1] ;
        // }
        // System.out.print("\n");
        // for(int i=0;i<n+1;i++)
        // { 
        //     System.out.print(backSum[i]+" ");
        // }
        // System.out.print("\n");
        // for(int i=0;i<n;i++)
        // { 
        //     if(prefix[i]==backSum[i+1])
        //     {
        //         System.out.println(i);
        //         return;
        //     }
        // }
        // System.out.println(-1);
        
        
        
// print a N*N matrix
        // int N= scan.nextInt();
        // System.out.print("\nMatrix\n");
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<N;j++)
        //     {
        //         System.out.print(i+""+j+" ");
        //     }
        //     System.out.println("");
        // }
        // System.out.print("\nSum of row and colums\n");
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<N;j++)
        //     {
        //         System.out.print(i+j+" ");
        //     }
        //     System.out.println("");
        // }
        // System.out.print("\nDiffrence of row and colums\n");
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<N;j++)
        //     {
        //         System.out.print(i-j+" ");
        //     }
        //     System.out.println("");
        // }
        
        
    }
}
