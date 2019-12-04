public class ChocolateBoiler {
    
    private boolean empty;
    private boolean boil;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        boil = false;
        empty = true;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boil = false;
            System.out.println("Chocolate boiler filled!");
        } else {
            System.out.println("Ah oh, the chocolate boiler is already full");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Chocolate boiler drained");
        } else {
            if (isEmpty()) {
                System.out.println("Ah oh, the boiler is already empty.");
            } 
            if (!isBoiled()) {
                System.out.println("Ah oh, the chocolate is not boiled.");
            }
        }
    }

    public void boil() {
        if(!isBoiled() && !isEmpty()) {
            boil = true;
            System.out.println("Boiler has boiled");
        } else {
            if(isBoiled()) {
                System.out.println("The boiler is already boiling");
            } 

            if(isEmpty()) {
                System.out.println("Ah oh, the boiler is empty");
            }
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boil;
    }

}