package Learn_The_Basics;
import java.util.*;
public class reverseArray {
  
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
