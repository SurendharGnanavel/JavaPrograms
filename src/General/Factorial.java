package General;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialValue(1));
    }

    public static int FactorialValue(int i){
        int temp=0;
        if(i==0){
            return 1;
        }else{
            return i*FactorialValue(i-1);
        }

    }
}
