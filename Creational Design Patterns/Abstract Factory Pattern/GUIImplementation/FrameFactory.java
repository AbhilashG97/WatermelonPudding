public class FrameFactory implements GUIFactory {

    public Buttons getButtons(String buttonType){
        return null;
    }

    public Frames getFrames(String frameType){
        if(frameType.equalsIgnoreCase("MS")){
            return new MSFrame();
        }else {
            return new LinuxFrame();
        }
    }
}