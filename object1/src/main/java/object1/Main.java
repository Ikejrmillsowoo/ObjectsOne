package object1;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Dog [] dogs = new Dog[10];
        Dog dog1 = new Dog("Scooby", 10, "white");
        Dog dog2 = new Dog("Scrappy", 12, "black");

        dogs[0] = dog1;
        dogs[5] = dog2;

        System.out.println(dog1.getName());

        Chair [] chairs = new Chair[10];
        Chair chair1 = new Chair("Stool", "blue", 3);
        Chair chair2 = new Chair("Couch", "red", 2);

        chairs[0] = chair1;
        chairs[5] = chair2;

        System.out.println(chair2.getColor());

        Car [] car = new Car[10];
        Car car1 = new Car("Kia", "Optima", 2016, 160000);
        Car car2 = new Car("VW", "Tiguan", 2019, 80000);

        car[0] = car1;
        car[5] = car2;

        System.out.println(car2.getMake());


    }
}
