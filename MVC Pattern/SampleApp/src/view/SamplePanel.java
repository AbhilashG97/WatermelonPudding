package view;

import controller.SampleAppController;

import javax.swing.*;

public class SamplePanel extends JPanel{

    private SampleAppController baseController;

    public SamplePanel(SampleAppController baseController){
        this.baseController = baseController;
    }

}
