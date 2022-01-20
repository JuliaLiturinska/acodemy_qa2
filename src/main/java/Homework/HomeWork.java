package Homework;

public class HomeWork {
    public static void main(String[] args) {

// 1 Если переменная типа int = 10, выведите на экран: “Integer value is 10”

        for (int i = 10; i <= 10; i++) {
            System.out.println("Integer value is " + i);
        }


  /*

 2 В переменной типа int хранится любое число от 18 до 65.
 Скидку в химчистке можно получить группе лиц от 18-21 лет в размере 10 процентов.
 Группе лиц от 22 до 65 лет можно получить скидку в размере 15%.
 Группе лиц от 65 можно получить скидку в размере 20%.
 Написать программу необходимо таким образом, чтобы изменяя значения переменной,
 можно было бы попасть в определенную группу и получить сообщение на экран о том,
 в какой возрастной группе вы находитесь и на какую скидку можете расчитывать. (Текст придумать самим)

 */

        int age = 18;

        if(age >=18 && age <=21) {
            System.out.println("You can get discount 10%");
        } else if(age >=22 && age <=65) {
            System.out.println("You can get discount 15%");
        } else if(age > 65) {
            System.out.println("You can get discount 20%");

        }
/*
 3 Создать массив String и добавить в него 10 наименований животных.
  a Пройтись циклом по массиву, найти и распечатать любого животного.
  */

        String[] animals = {"cat", "dog", "rat", "parrot", "cow", "horse", "sheep", "chicken", "rooster", "donkey"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println(animals[0]);
        System.out.println(animals[8]);

        // 4 Создать массив с числами от 0 до 10 и распечатать только те четные числа.

        int[] numbers = new int[10];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i + 1;
        }

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

/*
 5 Предположим что мы хотим выбрать транспортное средство на котором сегодня поедем в офис.
 Транспортом может быть (машина, автобус, такси и т.д)
 Относительно значения, которое храниться в переменной используя оператор switch
 научить программу выводить на экран то, каким образом планируете добраться до работы.

 */
        String currentTransport = "car";
        switch (currentTransport) {
            case "car":
                System.out.println("I will ride car");
                break;
            case "bicycle":
                System.out.println("I will ride a bicycle");
                break;
            default:
                System.out.println("??");
        }

// 6 Распечатать на экране числа от 1 до 100.

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


// 7 Распечатать на экране числа от 50 до 1.
        for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }

        // 8 Распечатайте на экране таблицу умножения (от 1 до 10)


        int i = 1, n = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (n <= 9) {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println("");


        }
    }
}