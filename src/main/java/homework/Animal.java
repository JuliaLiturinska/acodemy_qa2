package homework;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor

public class Animal {

        private String name;
        private int energyCount = 4;
        private int legsCount = 4;
        private boolean isSleeping = false;
        private boolean isEating = false;
        private boolean isPlaying = false;
        private boolean isWalking = false;

 /*   public Animal(String name, int energyCount, int legsCount, boolean isSleeping, boolean isEating, boolean isPlaying) {
        this.name = name;
        this.energyCount = energyCount;
        this.legsCount = legsCount;
        this.isSleeping = isSleeping;
        this.isEating = isEating;
        this.isPlaying = isPlaying;
    }

  */

    public Animal(String name, int energyCount, int legsCount, boolean isSleeping){
            this.name = name;
            this.energyCount = energyCount;
            this.legsCount = legsCount;
            this.isSleeping = isSleeping;
        }


        public void walk () {
            log.info("Walk time");
            if (energyCount == 0) {
                System.out.println("Please feed me! - said " + name);
            } else {
                energyCount--;
                System.out.println(name + " is happy to go for a walk" +"\n" + "Energy now: " + energyCount);
            }
        }
        public void feed () {
            log.info("Feed time");
            if (energyCount == 4) {
                System.out.println("No need to feed me! - said " + name);
            } else if (energyCount < 4) {
                energyCount = 4;
                System.out.println(name + " is happy, energy now is " + energyCount);
            }
        }
        public void play () {
        log.info("Play time");
            if (energyCount == 0) {
                System.out.println("Please let me sleep! - said " + name);
            } else if (energyCount > 1) {
                System.out.println(name + " is happy to play" + "\n" + "Energy now: " + energyCount);

            }

        }

        // public void status() {
        //     System.out.println("Status of animal", name, isSleeping);
        // }

        public void goSleep () {
        log.info("Sleep time");
            if (energyCount == 0) ;
            System.out.println(name + " is going to sleep!");
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