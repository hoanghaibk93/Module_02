package ss02_vong_lap.bai_tap;

public class DisplayPremierPrime {
    public static void main(String[] args) {
        int count = 0, numberOne = 0;
        while (count < 20) {
            if (isPrime(numberOne)) {
                System.out.println(numberOne);
                count++;

            }
            numberOne++;
        }
    }

    public static boolean isPrime(int number) {
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

