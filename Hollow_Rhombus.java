public class Hollow_Rhombus {
    public static void main(String args[]){
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                if(i==1 || i==n || j==0 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
