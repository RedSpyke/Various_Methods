package com.company;

public class Main {

    public static void main(String[] args) {
System.out.println(getGreatestCommonDivisor(12,30));

    }

    public static int sumFirstAndLastDigit (int number){
        if ( number < 0){
            return - 1;
        }
        int lastDigitOriginalNumber = number % 10;
        int reverseNumber = 0;
        while (number != 0){

            int lastDigit = number % 10;
            reverseNumber =reverseNumber * 10 + lastDigit;
            number /=10;
        }
        System.out.println(reverseNumber);
        int lastDigitReverseNumber = reverseNumber % 10;
        return lastDigitOriginalNumber + lastDigitReverseNumber;

    }

    public static int getEvenDigitSum (int number) {
        if ( number < 0){
            return -1;
        }
        int sum = 0;

        while ( number != 0){

            int lastDigit;
            lastDigit = number % 10;
            if (lastDigit % 2 == 0){
                sum +=lastDigit;
            }
            number /= 10;

        }
        return sum;
    }

    public static boolean hasSharedDigit (int x , int y){
        if (((x >= 10) && (x <= 99)) && ((y>= 10) && (y <= 99))){

            int lastDigitX = x % 10;
            int firstDigitX = x /10;

            int lastDigitY = y % 10;
            int firstDigitY = y / 10;

            if ((lastDigitX == lastDigitY) || (lastDigitX == firstDigitY)){
                return true;
            }
            return (firstDigitX == lastDigitY) || (firstDigitX == firstDigitY);

        }
        return false;
    }

    public static boolean hasSameLastDigit (int x, int y, int z){

        if (((x >= 10)&&(x <= 1000)) && ((y >=10) && (y <= 1000)) && ((z >= 10) && (z <= 1000))){
            int lastDigitX = x % 10;
            int lastDigitY = y % 10;
            int lastDigitZ = z % 10;

            if ((lastDigitX == lastDigitY)|| (lastDigitX == lastDigitZ)||(lastDigitY == lastDigitZ)){
                return true;
            }
        }
        return false;
    }
// number within range
    public static boolean isValid (int x){
        return (x >= 10) && (x <= 1000);
    }


    public static int getGreatestCommonDivisor (int x , int y) {
        if ((x < 10) || (y < 10)) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; ++i){
            if (x % i == 0 && y % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }


}
