package controller;

import view.SampleFrame;

public class SampleAppController {

    private SampleFrame appFrame;

    public void start(){
        appFrame = new SampleFrame(this);
    }

}
