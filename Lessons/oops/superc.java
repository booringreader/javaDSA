public class superc{
    public static void main(String args[]){
        Dragon d = new Dragon();
    }    
}
class Animal{
    Animal(){
        System.out.println("animal");
    }
}

class Dragon extends Animal{
    Dragon(){
        super();
        System.out.println("dragon");
    }
}