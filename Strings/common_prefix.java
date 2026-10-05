package Strings;

public class common_prefix {
    public static void main(String[] args){
        String[] arr={"flowers" , "flow" , "fly", "flight" };
        String ans=arr[0];
        for(int i=1; i<arr.length; i++){
            while(arr[i].indexOf(ans)!=0){
                ans=ans.substring(0,ans.length()-1);
            }
        }
        System.out.println(ans);
    }
}
