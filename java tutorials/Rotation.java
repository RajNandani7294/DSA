public class Rotation {
    public static void Reverse(int a[], int n,int k){
       k=k%n;
       for(int i=0;i<n;i++){
        if(i<k){
            System.out.print(a[n+i-k]+" ");
        }
        else{
            System.out.print(a[i-k]+" ");
        }
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=2;
        int n=a.length;
        Reverse(a, n, k);

    
    
}
