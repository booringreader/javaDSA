//implimenting multiple inheritance through inheritance
public class chess{
    public static void main(String args[]){

    }
}
interface herbivore{
    void veg();
    void is_human();
}
interface carnivore{
    void not_veg();
    void domesct();
}

class animal implements herbivore, carnivore{
    public void veg(){
        System.out.println("yes");
    }
    public void not_veg(){
        System.out.println("not vegan");
    }
    public void domesct(){
        System.out.println("not feasable");
    }
    public void is_human(){
        System.out.println("maybe");
    }
}




















// implimenting total abstraction through interfaces
// public class chess {
//     public static void main(String args[]){
//         queen q = new queen();
//         q.moves();
//     }
// }

// interface Chess{
//     void moves();
// }

// class queen implements Chess{
//     public void moves(){
//         System.out.println("up, down, blah blah");
//     }
// }
// class rook implements Chess{
//     public void moves(){
//         System.out.println("up, down, blah blah");
//     }
// }
// class knight implements Chess{
//     public void moves(){
//         System.out.println("blah blah");
//     }
// }