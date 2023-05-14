package General;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(1));
    }

    public static int Factorial(int i){
        int temp=0;
        if(i==0){
            return 1;
        }else{
            return i*Factorial(i-1);
        }

    }
}
