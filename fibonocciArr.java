import java.util.Arrays; 
public class fibonocciArr { 
 static int fib(int n, int[] arr){ 
 if(n==0) 
 return 0; 
 if(n==1) 
 return 1; 
 
 if(arr[n-1]!=0) 
 return arr[n-1]; 
 arr[n-1]=fib(n-1,arr)+fib(n-2,arr); 
 return arr[n-1]; 
 } 
 public static void main(String[] args) { 
 int n=10; 
 int[] arr2 = new int[n]; 
 fib(n,arr2); 
 System.out.println(Arrays.toString(arr2)); 
 } 
}