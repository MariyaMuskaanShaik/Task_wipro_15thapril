public class SumArray { 
    static int sum(int []arr, int n){ 
    if(n==1){ 
    return arr[0]; 
    } 
    else{ 
    return arr[n-1]+sum(arr,n-1); 
    } 
    } 
    public static void main(String[] args) { 
    int[] arr = {1,2,3,4,5,6}; 
    int sum = sum(arr, arr.length); 
    System.out.println("Sum of array element : "+ sum); 
    } 
   } 
   