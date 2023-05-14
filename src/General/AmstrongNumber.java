package General;

public class AmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isAmstrongNumber(154));
    }


    public static boolean isAmstrongNumber(int num) {
        int temp = num;
        int temp2=0;
        while(num!=0){
            int r = num%10;
            temp2 = temp2+(r*r*r);
            num =num/10;
        }
        return temp2 == temp;

    }
}
