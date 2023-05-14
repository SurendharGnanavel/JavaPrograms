package General;

public class FibnociNumber {
    public static void main(String[] args) {
        fibnociNumbers(10);
    }

    public static void fibnociNumbers(int p){
        int n1 = 0,n2=1,n3=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<p;i++){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
