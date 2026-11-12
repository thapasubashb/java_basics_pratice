 
 
 
 public class Class {
   
    public static void main(String[] args) {
      
        Dog d1 = new Dog();
        d1.name = "jon";
        d1.bark();
        
        Dog d2 = new Dog();
        d2.walk();
    }
}
class Dog{
     
    int age ; 
    String name ;
    String color ; 

    void bark(){
        System.out.println(name +"it is barking ");
    }
    void walk(){
        System.out.println("it is walking ");
    }

}
