package flyweight;

import java.util.ArrayList;

public class Number {
    private ArrayList<Digit> digitList = new ArrayList<>();

    public Number(int number) {
        String strNum = Integer.toString(number);
        int len = strNum.length();

        DigitFactory digitFactory = new DigitFactory();
        for (int i = 0; i < len; i++) {
            int n = Character.getNumericValue(strNum.charAt(i));
            Digit digit = digitFactory.getDigit(n);
            digitList.add(digit);
        }
    }

    public void print(int x, int y) {
        try {
            int cntDigits = digitList.size();
            for (int i = 0; i < cntDigits; i++) {
                Digit digit = digitList.get(i);
                digit.print(x + (i * 7), y);
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }
}
