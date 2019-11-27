public class Duck {
    
    private DuckBehaviour duckBehaviour;

    public Duck (DuckBehaviour duckBehaviour) {
        this.duckBehaviour = duckBehaviour;
    }
    
    public void fly() {
        System.out.println("This duck can fly");
    }

    public void eat() {
        System.out.println("Nom nom");
    }

    public void swim() {
        duckBehaviour.swim();
    }
}