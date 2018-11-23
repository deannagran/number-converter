public class Main {

    public static void main(String[] args) {

        ExtraCredit ec = new ExtraCredit();

        System.out.println(ec.binaryToDecimal(10101));
        System.out.println("Time elapsed 1: " + ec.getTimeElapsed());
        System.out.println(ec.decimalToBinary(45611));
        System.out.println("Time elapsed 2: " + ec.getTimeElapsed());
        System.out.println(ec.hexadecimalToDecimal("B22B"));
        System.out.println("Time elapsed 3: " + ec.getTimeElapsed());

    }
}
