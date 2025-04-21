import java.util.Arrays;
public class Array {
  public static void main(String[]args){
    String arr[]={"Ritik","Ankita","Shraddha"};
    int i;
    for( i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
     String key="Shraddha";
     for(i=0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.println("Search Element="+key);
        }
     }
     char a[]=key.toCharArray();
     Arrays.sort(a);
     System.out.println(a);
  }
}
