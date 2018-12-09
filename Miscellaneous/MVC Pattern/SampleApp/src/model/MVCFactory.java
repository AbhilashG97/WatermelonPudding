package model;

import java.util.ArrayList;

public class MVCFactory {

    private ArrayList<Cupcake> cupcakeList;
    private ArrayList<IceCream> iceCreamList;
    private int cupcakeResourceCount;
    private int iceCreamResourceCount;

    public MVCFactory() {

        cupcakeList = new ArrayList<>();
        iceCreamList = new ArrayList<>();

        cupcakeResourceCount = 30;
        iceCreamResourceCount = 30;
    }

    public ArrayList<Cupcake> getCupcakeList() {
        return cupcakeList;
    }

    public void setCupcakeList(ArrayList<Cupcake> cupcakeList) {
        this.cupcakeList = cupcakeList;
    }

    public ArrayList<IceCream> getIceCreamList() {
        return iceCreamList;
    }

    public void setIceCreamList(ArrayList<IceCream> iceCreamList) {
        this.iceCreamList = iceCreamList;
    }

    public int getCupcakeResourceCount() {
        return cupcakeResourceCount;
    }

    public void setCupcakeResourceCount(int cupcakeResourceCount) {
        this.cupcakeResourceCount = cupcakeResourceCount;
    }

    public int getIceCreamResourceCount() {
        return iceCreamResourceCount;
    }

    public void setIceCreamResourceCount(int iceCreamResourceCount) {
        this.iceCreamResourceCount = iceCreamResourceCount;
    }

    public boolean makeCupcake(String topping, int price) {
        boolean canMakeCupcake = false;

        if (cupcakeResourceCount > 0) {
            Cupcake cupcake = new Cupcake(topping, price);
            cupcakeResourceCount--;
            cupcakeList.add(cupcake);
            canMakeCupcake = true;
        }

        return canMakeCupcake;
    }

    public boolean makeIcecream(String flavor, int price) {

        boolean canMakeIcecream = false;

        if (iceCreamResourceCount > 0) {
            IceCream iceCream = new IceCream(flavor, price);
            iceCreamResourceCount--;
            iceCreamList.add(iceCream);
            canMakeIcecream = true;
        }

        return canMakeIcecream;
    }


}
