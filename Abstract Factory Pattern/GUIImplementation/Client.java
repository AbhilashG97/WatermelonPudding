import java.io.*;

public class Client {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
            ButtonFactory buttonsFactory = new ButtonFactory();
            Buttons button = buttonsFactory.getButtons(bfr.readLine());
            
            button.setColor(bfr.readLine());
            button.setText(bfr.readLine());

            System.out.println("Button \n"+button.getText() +" "+button.getColor());
            
            FrameFactory frameFactory = new FrameFactory();
            Frames frame = frameFactory.getFrames(bfr.readLine()); 
            frame.setTitle(bfr.readLine());
            frame.setSize(Integer.parseInt(bfr.readLine()), Integer.parseInt(bfr.readLine()));

            System.out.println("Frame \n"+frame.getTitle() +"\nLength -> "+frame.getLength()+" Width ->"+frame.getWidth());
        }catch(IOException ioe){
            ioe.printStackTrace();
        }        
    }
}