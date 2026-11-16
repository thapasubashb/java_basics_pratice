public class Superclass extends Inheritance{



    int a = 7;

    public static void main(String[] args) {

        Superclass object = new Superclass();
        System.out.println(object.name);


        // when we use super it will invoke and use the its exact parent which it took things from like in this case Inheritance 
        // super we use to take the constructor and methods form the immediate parent 
        object.showParentSpeed();


        
        
    }

    void showParentSpeed() {
        super.speed();
    }
    
}
