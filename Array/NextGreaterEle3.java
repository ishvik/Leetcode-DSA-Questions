import java.util.*;

public class NextGreaterEle3{
    public static int nextGreaterElement(int n) {
        char[] arr=(""+n).toCharArray();
        
        int i = arr.length-2;
        
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        
        if(i == -1)
            return -1;
        
        int j = arr.length-1;
        while(j>i && arr[j]<=arr[i]){
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        i = i+1;
        j = arr.length-1;
        while(i<j){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        
         try{
        return Integer.parseInt(new String(arr));
        }catch(Exception e){
            return -1;
        }
    }
}