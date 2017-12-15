public class MSFrame implements Frames {

    private String title;
    private int length, width;

    public void setTitle(String title){
        this.title = title;
    }

    public void setSize(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    public String getTitle(){
        return "MS "+title;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

}