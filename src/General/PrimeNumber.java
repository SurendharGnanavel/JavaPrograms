package General;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11));
        isPrimeNumberList(120);
    }

    public static boolean isPrimeNumber(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void isPrimeNumberList(int num) {
        boolean isPrime = true;
        while (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num+" ");
            }
            num--;
            isPrime = true;
        }
    }
}
