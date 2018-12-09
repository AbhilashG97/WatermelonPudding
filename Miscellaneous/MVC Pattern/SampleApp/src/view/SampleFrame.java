package view;

import controller.SampleAppController;

import javax.swing.*;

public class SampleFrame extends JFrame{

    private SamplePanel panel;

    public SampleFrame(SampleAppController controller){
        panel = new SamplePanel(controller);
        setUpFrame();
    }

    private void setUpFrame(){
        this.setContentPane(panel);
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
}
