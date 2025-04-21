public class Rotation2 {
    public static void Reverse(int a[],int n,int k){
        if(k==0){
            return;
        }
        int temp=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        Reverse(a, n, k-1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int n=a.length;
        int k=2;
        Reverse(a, n, k);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
    
}
