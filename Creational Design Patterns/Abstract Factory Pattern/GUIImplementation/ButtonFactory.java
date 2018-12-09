public class ButtonFactory implements GUIFactory{

    public Buttons getButtons(String buttonType){
        if(buttonType.equalsIgnoreCase("MS")){
            return new MSButton();
        }else{
            return new LinuxButton();
        }
    }
    
    public Frames getFrames(String frameType){
        return null;
    }
}