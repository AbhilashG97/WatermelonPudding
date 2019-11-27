public class Main {
    public static void main(String[] args) {
        Duck cityDuck = new Duck(() -> System.out.println("City duck swiming"));
        cityDuck.swim();
        cityDuck.eat();
        cityDuck.fly();

        System.out.println();

        Duck mountainDuck = new Duck(() -> System.out.println("Mountain duck swiming"));
        mountainDuck.swim();
        mountainDuck.eat();
        mountainDuck.fly();
    }
}