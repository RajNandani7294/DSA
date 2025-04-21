package DSAINJAVA;

public class Reverse {
    public static void main(String[] args) {
       int a[]={1,2,3,4,5};
       int n=a.length;
       int i,j,temp;
       i=0;j=n-1;
       while(i<j){
          if(a[i]<a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
          }
       }
       System.out.println("Enter the Reserve Element=");
       for(i=0;i<n;i++){
        System.out.println(a[i]);
       }
    }
    
}
