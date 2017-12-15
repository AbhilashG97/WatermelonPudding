public class LinuxButton implements Buttons {
    
        private String text, color;
    
        public void setColor(String color){
            this.color = color;
        }
    
        public void setText(String text){
            this.text = text;
        }
    
        public String getText(){
            return "Linux "+text;
        }
    
        public String getColor(){
            return "Linux "+color;
        }
    
    }