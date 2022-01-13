package classwork;

public class ArrayPractice {

    public static void main(String[] args) {

        String fruit = "apple";

        String[] fruits = {"apple", "banana", "orange", "pear", "strawberry", "melon"};

        if (fruits[1].equals("banana")) {
            System.out.println("I found banana!");
        } else {
            System.out.println("Banana is not found");
        }

        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(numbers[1]);
        System.out.println(numbers.length);


        // fruits[0] = apple
        // fruits[1] = banana
        // fruit[5] = melon
        System.out.println(fruits[1]);

        String[] fruitArray = new String[5];
        fruitArray[0] = "apple";
        fruitArray[1] = "melon";
        fruitArray[2] = "kiwi";
        fruitArray[3] = "mandarin";
        fruitArray[4] = "grape";

        System.out.println(fruitArray[4]);

        // [0]
        // [1]
        // [2]


//        String name = "Nikita";
//        String surname = "Milka";
//
//        String[] nameAndSurname = {"Nikita", "Milka"};
//
//        System.out.printf("My name is %s. My surname is %s.", nameAndSurname[0], nameAndSurname[1]);
//
//        String firstPart = "I have an analytical mindset";
//        System.out.println(firstPart);
//        String secondPart = "I quickly remember new information";
//        System.out.println(secondPart);
//        String thirdPart = "and am not afraid of constructive criticism";
//        System.out.println(thirdPart);
//        String fourthPart = "I still strive for learning and development";
//        System.out.println(fourthPart);
//
//        String[] sentenceParts = {"I have an analytical mindset", "I quickly remember new information", "and am not afraid of constructive criticism"};
//        System.out.printf("%s %s %s", sentenceParts[0], sentenceParts[1], sentenceParts[2]);
//
//
//        System.out.printf("%s %s %s %s.\n", firstPart, secondPart, thirdPart, fourthPart);
//        System.out.println(firstPart + ", " + secondPart + " " + thirdPart + ". " + fourthPart + ".");

    }
}
