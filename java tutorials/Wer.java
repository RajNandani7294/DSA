public class Wer {
    public static void main(String[] args) {
        int a[]={0,0,1,1,1,2,2,3,3,4};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(a[i]==a[j]&&i!=j){
                    System.out.println(a[i]);
                }
            }
        }
    }
    
}
