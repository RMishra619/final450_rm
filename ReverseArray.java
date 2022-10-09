// ToDO: reverse an array 
// 1. we can reverse it using 2 methods by swapping the array or
// 2. using stack operations.

import java.util.*;
import java.util.Stack;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        revArray(arr, start , end);
        for(int i=0 ; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        
    }

    // using loop

    // static void revArray(int[] arr , int start, int end ){
    //     while(start < end){
    //         int temp = arr[start];
    //         arr[start ] = arr[end];
    //         arr[end]= temp;
    //         start++;
    //         end--;
    //     }
    // }

    // using stack

    // static int[] revArray(int[] arr, int n){
    //     Stack<Integer> st = new Stack<>();
    //     int[] newarr = new int[n];
    //     for(int i=0; i<n; i++){
    //         st.push(arr[i]);
            
    //     }
    //     for(int i=0 ; i <n ; i++){
    //         newarr[i] = st.pop();
    //         System.out.print("popping element" + newarr[i] + " ");
    //     }
    //    return newarr;
    // }

    // using recusive array;
    static void revArray(int[] arr ,int start , int end){

        int temp ;
        if(start >= end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        revArray(arr, start+1, end-1);
    }
}