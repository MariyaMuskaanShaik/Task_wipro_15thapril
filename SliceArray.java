public class SliceArray { 
    static int[] Slice_Array(int[] arr, int start, int end){ 
    int x=0; 
    int arr2[]=new int[end-start]; 
    for (int i = start; i < end; i++) { 
    arr2[x++]=arr[i]; 
    } 
    return arr2; 
    } 
    public static void main(String[] args) { 
    int arr[] ={1,2,3,4,5,6,7}; 
    int arr2[]=Slice_Array(arr, 2, 6); 
    for(int i : arr2){ 
    System.out.print(i+" "); 
    } 
    } 
   }