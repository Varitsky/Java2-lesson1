package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        Course Marathon = new Course(new Cross(300), new Wall(2), new Water(5), new Cross(400));

        Team TestTeam = new Team("TestTeam", new Human("Человек"), new Cat("Кот"),
                new Dog("Дог"), new Dog("Собака"), new Cat("Кошка"));

        Marathon.doIt(TestTeam);

        System.out.println("\n"+"Finish!");
        TestTeam.showResults();
    }

}
