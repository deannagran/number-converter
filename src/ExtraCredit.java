import java.util.ArrayList;
import java.util.Collections;

public class ExtraCredit {

    // timeElapsed in seconds
    private double timeElapsed;

    public ExtraCredit() {
        timeElapsed = 0;
    }

    public double getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(double timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    // return the decimal value calculated from
    //   the binary number given
    public long binaryToDecimal(long binary) {

        //convert binary number into an array list of 1's and 0's
        //iterate through the array.
        //each element should be multiplied by 2^n starting from i=0.
        //add up each element to sum variable, which will represent the corresponding decimal number.

        ArrayList<Long> array = new ArrayList<Long>();
        do {
            array.add(binary % 10);
            binary /= 10;
        } while (binary > 0);

        long sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i) * Math.pow(2, i);
        }

        return sum;
    }

    public long decimalToBinary(long decimal) {
        String sum = "";
        long divisor = decimal;

        while (divisor != 0) {
            sum += (char) divisor % 2;
            divisor = divisor / 2;
        }
        sum += "0";

        //reverse order of solution
        StringBuilder input1 = new StringBuilder();
        input1.append(sum);
        input1 = input1.reverse();
        sum = input1.toString();

        long decimalNum = Long.valueOf(sum);
        return decimalNum;
    }

    public long hexadecimalToDecimal(String hexadecimal) {
        long sum = 0;
        //reverse string before iterating through it
        StringBuilder input1 = new StringBuilder();
        input1.append(hexadecimal);
        input1 = input1.reverse();
        //Check if character is a hex letter representative of numbers 10-15:
        for (int i = 0; i <= input1.length()-1; i++) {
            if ((65 <= (int) input1.charAt(i) && (int) input1.charAt(i) >= 70) || (97 <= (int) input1.charAt(i) && (int) input1.charAt(i) >= 102)) {
                if((int) input1.charAt(i) == 65 || (int) input1.charAt(i) == 97){
                    //character is A = 10
                    sum+=10 * Math.pow(16, i);
                }
                if(((int) input1.charAt(i) == 66 || (int) input1.charAt(i) == 98)){
                    //character is B = 11
                    sum+=11 * Math.pow(16, i);
                }
                if((int) input1.charAt(i) == 67 || (int) input1.charAt(i) == 99){
                    //character is C = 12
                    sum+=12 * Math.pow(16, i);
                }
                if((int) input1.charAt(i) == 68 || (int) input1.charAt(i) == 100){
                    //character is D = 13
                    sum+=13 * Math.pow(16, i);
                }
                if((int) input1.charAt(i) == 69 || (int) input1.charAt(i) == 101){
                    //character is E = 14
                    sum+=14 * Math.pow(16, i);
                }
                if((int) input1.charAt(i) == 70 || (int) input1.charAt(i) == 102){
                    //character is F = 15
                    sum+=15 * Math.pow(16, i);
                }
            }
            else{
                //character is a number 1-9
                sum+=Character.getNumericValue(input1.charAt(i))* Math.pow(16, i);

            }
        }

        return sum;
    }
}
