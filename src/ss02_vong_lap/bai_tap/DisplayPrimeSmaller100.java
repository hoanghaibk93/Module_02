package ss02_vong_lap.bai_tap;

public class DisplayPrimeSmaller100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (IsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean IsPrime(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }

        }
        return flag;
    }
}

