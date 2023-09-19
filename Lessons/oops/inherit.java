public class inherit {
    public static void main(String args[]){
        Animal a1 = new Animal();
        a1.color = "blue";
        Fish f1 = new Fish();
        f1.eat();
        f1.breathe();
    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming in water");
    }
}