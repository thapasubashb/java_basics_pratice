import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
     
        int[] arr = {2,31,33,2,9,5,90,7};

       int largest = arr[0];
       int sec_l = arr[0];
       for(int i = 0 ; i<arr.length; i++){
        if(largest < arr[i]){
            largest = arr[i];
         } 

         
         } 
for(int i = 0 ; i<arr.length; i++){
    if( sec_l < arr[i] && arr[i] != largest )  {
            sec_l = arr[i];
}
}
    System.out.println(Arrays.toString(arr));
    System.out.println(largest);
    System.out.println(sec_l);
      }
    }

