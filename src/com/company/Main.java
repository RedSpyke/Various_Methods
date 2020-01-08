package com.company;

import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {
      numberToWords(1010);
      System.out.println(getDigitCount(0));
      System.out.println(isPalindrome(12321));


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

    public static void printFactors (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        for (int i = 1 ; i <= number ; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }

    }

    public static boolean  isPerfectNumber(int number){
        if (number < 1 ){
            return false;
        }
        int numbersSum = 0;

        for (int i = 1; i < number; i++){
            if (number % i != 0){
               continue;
            }
            numbersSum = numbersSum + i;
             if (numbersSum == number){
                 return true;
             }
        }
        return false;

    }

    public static void numberToWords (int number){
        if (number <0){
            System.out.println("Invalid Value");
        }
        int numberOfDigits = getDigitCount(number);
        String Zero = "Zero ";
         // System.out.println(numberOfDigits);
        int reverseNumber = reverse(number);
        int lastDigitCounter = 0;
        String NumberToWord = " ";
        while (reverseNumber != 0){
            int lastDigit = reverseNumber % 10;

            String lastDigitWord = " ";
            switch (lastDigit){
                case 0:
                    lastDigitWord = "Zero";
                    break;
                case 1:
                    lastDigitWord = "One";
                    break;
                case 2:
                    lastDigitWord = "Two";
                    break;
                case 3:
                    lastDigitWord = "Three";
                    break;
                case 4:
                    lastDigitWord = "Four";
                    break;
                case 5:
                    lastDigitWord = "Five";
                    break;
                case 6:
                    lastDigitWord = "Six";
                    break;
                case 7:
                    lastDigitWord = "Seven";
                    break;
                case 8:
                    lastDigitWord = "Eight";
                    break;
                case 9:
                    lastDigitWord = "Nine";
                    break;
                default:
                    break;
            }
            NumberToWord += lastDigitWord + ' ';
            reverseNumber /=10;
            lastDigitCounter++;
        }
        // System.out.println(lastDigitCounter);
        // System.out.println(NumberToWord);
        if (numberOfDigits != lastDigitCounter){
            int n = numberOfDigits - lastDigitCounter;
            for (int i = 0; i < n; i++ ){
                NumberToWord += Zero;
            }
        }
        System.out.println(NumberToWord);
    }

    public static int reverse (int number){
        int originalNumber = number;
        if (number < 0){
            number *= -1;
        }
        int reverseNumber = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverseNumber =reverseNumber * 10 + lastDigit;
            number /=10;
        }

        if (originalNumber < 0){
            reverseNumber *= - 1;
        }
        return reverseNumber;
    }

public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }
        if (number <= 9){
            return 1;
        }
        int digits = 0;
    while (number != 0){
        number /=10;
        digits++;
    }
        return digits;
}

    public static boolean isPalindrome (int number){
        int originalNumber = number;
        if (number < 0){
            number *= -1;
        }
        int reverseNumber = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverseNumber =reverseNumber * 10 + lastDigit;
            number /=10;
        }
        if (originalNumber < 0){
            reverseNumber *= - 1;
        }
        System.out.println("reverse number is "+ reverseNumber);
        return reverseNumber == originalNumber;
    }
}
