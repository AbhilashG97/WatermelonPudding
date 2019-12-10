package view;

import controller.SampleAppController;

import javax.swing.*;

public class SamplePanel extends JPanel{

    private SampleAppController baseController;

    private JLabel flavorLabel;
    private JLabel iceCreamPriceLabel;
    private JLabel toppingLabel;
    private JLabel cupcakePriceLabel;
    private JTextField flavorField;
    private JTextField iceCreamPriceField;
    private JTextField toppingField;
    private JTextField cupcakePriceField;
    private SpringLayout baseLayout;


    public SamplePanel(SampleAppController baseController){
        this.baseController = baseController;

        flavorLabel = new JLabel("Flavor");
        iceCreamPriceLabel = new JLabel("Ice cream Price");
        toppingLabel = new JLabel("Topping");
        cupcakePriceLabel = new JLabel("Cupcake Price");

        flavorField = new JTextField(15);
        iceCreamPriceField = new JTextField(15);
        toppingField = new JTextField(15);
        cupcakePriceField = new JTextField(15);

        baseLayout = new SpringLayout();

        setUpPanel();
        setUpLayout();
        setUPListeners();
    }

    public void setUpLayout(){

    }

    public void setUpPanel(){
        this.setLayout(baseLayout);
        this.add(flavorLabel);
        this.add(iceCreamPriceLabel);
        this.add(toppingLabel);
        this.add(cupcakePriceLabel);
        this.add(flavorField);
        this.add(iceCreamPriceField);
        this.add(toppingField);
        this.add(cupcakePriceField);
    }

    public void setUPListeners(){

    }

}
