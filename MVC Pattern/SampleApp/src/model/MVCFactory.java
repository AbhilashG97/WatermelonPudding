package model;

import java.util.ArrayList;

public class MVCFactory {

    private ArrayList<Cupcake> cupcakeList;
    private ArrayList<Icecream> icecreamList;
    private int cupcakeResourceCount;
    private int icecreamResourceCount;

    public MVCFactory() {

        cupcakeList = new ArrayList<>();
        icecreamList = new ArrayList<>();

        cupcakeResourceCount = 30;
        icecreamResourceCount = 30;
    }

    public ArrayList<Cupcake> getCupcakeList() {
        return cupcakeList;
    }

    public void setCupcakeList(ArrayList<Cupcake> cupcakeList) {
        this.cupcakeList = cupcakeList;
    }

    public ArrayList<Icecream> getIcecreamList() {
        return icecreamList;
    }

    public void setIcecreamList(ArrayList<Icecream> icecreamList) {
        this.icecreamList = icecreamList;
    }

    public int getCupcakeResourceCount() {
        return cupcakeResourceCount;
    }

    public void setCupcakeResourceCount(int cupcakeResourceCount) {
        this.cupcakeResourceCount = cupcakeResourceCount;
    }

    public int getIcecreamResourceCount() {
        return icecreamResourceCount;
    }

    public void setIcecreamResourceCount(int icecreamResourceCount) {
        this.icecreamResourceCount = icecreamResourceCount;
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

        if (icecreamResourceCount > 0) {
            Icecream icecream = new Icecream(flavor, price);
            icecreamResourceCount--;
            icecreamList.add(icecream);
            canMakeIcecream = true;
        }

        return canMakeIcecream;
    }


}
