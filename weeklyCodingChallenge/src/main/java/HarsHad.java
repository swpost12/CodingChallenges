public class HarsHad {

    public static void main(String[] args) {
        System.out.println(harshad(75));
        System.out.println(harshad(481));
        System.out.println(harshad(89));
        System.out.println(harshad(516));
        System.out.println(harshad(200));

    }

    public static boolean harshad(int number){
        return number % addDigits(number) == 0;
    }

    private static int addDigits(int num){
        if(num<10){
            return num;
        }
        return (num%10)+addDigits(num/10);
    }
}
