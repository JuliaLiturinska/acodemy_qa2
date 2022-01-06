package classroom;

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {

      //  Float example
        /* My name is Julia
        I am QA
         */
// Floating point example
        // Float
    float floatExample = 99999.99F;
        System.out.println(floatExample);
        System.out.println(99999.99F);

        //Double
        double doubleExample = 2000000.9876D;
        System.out.println(doubleExample);
        System.out.println(2000000.9876D);

        // byte example
        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // Short
        short distanceBetweenKievAndRiga = 1011;
        System.out.println(distanceBetweenKievAndRiga);

        // Integer
        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

        // Long
        long currentWorldPopulation = 7900000000L;
        System.out.println(currentWorldPopulation);

        // Char
        char ch = '\u03A9';
        char pUnicode = '\u0070';
        char[] arrayOfChars = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(arrayOfChars));
        char p = 'p';
        System.out.println(ch);
        System.out.println(p);

        int[] arrayOfPeopleAges ={21,22,23,24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

        // String variables

        String myName = "Julia";
        System.out.println(myName);

        String mySurname = "Liturinska";
        String myNameAndSurname =  myName + mySurname;
        System.out.println(myNameAndSurname);

        System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);


        int a = 30;
        int b = 5;
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a + b);

        System.out.println(9 % 4);
        // 2*4=8
        // 1

        float doubleDevision = 100 / 13F;
        System.out.println(doubleDevision);





    }

}
