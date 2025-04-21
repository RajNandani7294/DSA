package DSAINJAVA;

public class Bubble {
    public static void main(String[] args) {
        int a[]={10,9,6,11,15,2};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<=a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}
