package General;

public class PalindromeInt {

    public static void main(String[] args) {
        System.out.println(isPalindromeint(120
        ));
    }

    public static boolean isPalindromeint(int i){
        int temp =i;
        int r, temp2 =0;
        while(i>0){
            r = i%10;
            temp2 = temp2*10 +(r);
            i = i/10;
        }
        return temp2 == temp;
    }
}
