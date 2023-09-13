public class first {
    public static void main(String args[]){
    Pen p1 = new Pen(); //created a Pen object : p1    
    p1.setColor("green");
    p1.color = "yellow";
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    }
}

class Pen{  //by convention class names in java begin with capital letters
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calPer(int phy, int math, int chem){
        percentage = (phy+math+chem)/3;
    }
}
