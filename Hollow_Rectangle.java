public class Hollow_Rectangle {
    public static void main(String args[]){
        int a=6,b=5;
        for(int i=0;i<b;i++){
            if(i==0 || i==b-1){
                for(int j=0;j<a;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=0;j<a;j++){
                    if(j==0 || j==a-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
