public class Result {
   public static void main(String[]args){
    int a[]={3,0,2,0,4};
    int i, n=a.length;
    int left[]=new int[n] ;
    int right[]=new int[n];
    left[0]=a[0];
    for(i=1;i<a.length;i++){
        left[i]=Math.max(left[i-1],a[i]);
    }
    System.out.println("Left Array=");
    for(i=0;i<a.length;i++){
        System.out.println(left[i]);
    }
     right[n-1]=a[n-1];
     for(i=n-2;i>0;i--){
        right[i]=Math.max(right[i+1],a[i]);
     }
     System.out.println("Right Array=");
        for(i=a.length-1;i>0;i--){
            System.out.println(right[i]);
        for(i=0;i<a.length;i++){
    int result=(Math.min(left[i],right[a.length-1]))-a[i];
        System.out.println(result);
        }
   } 
}
