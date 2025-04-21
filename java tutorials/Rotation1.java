public class Rotation1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=2;
        int n=a.length;
        for(int i=0;i<k;i++){
            int temp=a[n-1];
            for(int j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}
