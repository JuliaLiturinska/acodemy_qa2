package homework;

public class Animal {
    private String name;
    private  int energyCount = 4;
    private boolean isSleeping = false;

    public void walk() {
        if(energyCount ==0) {
            System.out.println("Please feed me!");
        }
    }
    public void feed() {
        if(energyCount ==4) {
            System.out.println("No need to feed me!");
        } else {
            energyCount
        }
    }
}
/*
• Создать класс Animal и описать свойства, которые присущи каждому животному.
 • Создать пустой конструктор, со всеми полями и выборочно
 • Создать 6 обьектов на основе класса Animal
 • Научить программу отправлять животного спать
 • Научить программу кормить животного (представьте у животного есть 4 заряда
 энергии на весь день, выполняя какие-то занятия он тратит энергию, покормив животного
 он получает все 4 заряда энергии)
 • Научить программу отправлять животного (делать с помощью методов):
 ◦ на прогулку (-1 заряд энергии)
 ◦ играться (-1 заряда энергии)
 ◦ тренироваться (-1 заряда энерги)
 ▪️ Все эти команды необходимо логировать
 • Поставить проверку на то, что животное не может выполнять какие-то
 команды если у нее 0 заряда батареи, тогда программа должна сказть что нужно отправить животное покушать!
 */