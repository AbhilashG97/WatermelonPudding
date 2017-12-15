public class MSButton implements Buttons {

    private String text, color;

    public void setColor(String color){
        this.color = color;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return "MS "+text;
    }

    public String getColor(){
        return "MS "+color;
    }

}