public class getset {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("green");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
