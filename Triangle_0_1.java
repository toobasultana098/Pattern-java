public class Triangle_0_1 {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
