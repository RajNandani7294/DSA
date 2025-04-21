import java.util.Arrays;
public class Sort {
  static void Array(String str){
    char arr[]=str.toCharArray();
    System.out.println("Array Element=");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println("Sorted Array=");
    Arrays.sort(arr);
    System.out.println(arr);
  }
  public static void main(String[]args){
    String str="efGHABC";
    Array(str);
  }
}
