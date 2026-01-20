package dev.rogergsferreira.javaoneforall.introduction;

public class Class04Operators {
    static void main(String[] args) {
        // + - * /
        int number01 = 10;
        int number02 = 20;
        int resultSum = number01 + number02;
        int resultSubtraction = number01 - number02;
        double resultMultiplication = number01 * number02;
        double resultDivision = (double) number01 / number02; // casting, that is not recommended

        System.out.println(resultSum);
        System.out.println(resultSubtraction);
        System.out.println(resultMultiplication);
        System.out.println(resultDivision);

        // Examples of how the + (sum) sign works:
        System.out.println("Value " + number01 + number02);
        System.out.println(number01 + number02 + "Value");
        System.out.println(number01 + number02 + "Value " + number01 + number02);

        // %
        int module = 20 % 2;
        System.out.println(module);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsTwenty = 10 >= 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsTwenty " + isTenLowerOrEqualsTwenty);
        System.out.println("isTenGreaterOrEqualsTwenty " + isTenGreaterOrEqualsTwenty);
        System.out.println("isTenEqualsTwenty " + isTenEqualsTwenty);
        System.out.println("isTenDifferentFromTwenty " + isTenDifferentFromTwenty);

        // && (AND); || (OR); ! (NOT)
        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary == 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;
        System.out.println("canBeBought" + canBeBought);

        // = += -= *= /= %=
        double bonus = 1000;
        bonus += 1000; // bonus = bonus + 1000;
        bonus -= 1000; // bonus = bonus - 1000;
        bonus *= 2; // bonus = bonus * 1000;
        bonus /= 2; // bonus = bonus / 1000;
        bonus %= 1000; // bonus = bonus % 1000;
        System.out.println(bonus);

        // Unary ++ --
        int count = 0;
        ++count;
        --count;
        System.out.println(++count);
        System.out.println(count);
    }
}
