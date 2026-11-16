public  final   class FinalConcepts {
    
    final int age = 23;

     final void subu(){

        System.out.println(" he is the best coder and best person ");
    }

    public static void main(String[] args) {
        
     FinalConcepts obj = new FinalConcepts();
     obj.age = 27; // this won't allow the varbible to change due to final keyword

    obj.subu();  // if it was different file still we could use it by inhertiance by using extends word  and access it but if we use final for 
            // final in class name itself then we can't use anything from this class to another or can't create an subclass or child class it 
            // stops inheritance wehen we use final in class name  example it at top it self see.
        
    }

    
}
 class bike extends FinalConcepts{ // remove final from the top main class and use can have inheritance.

    void subu(){    // not able to override the method in different class 
    // due to final keyword used in the parent class so we can't  change it but we can use it or access it 
        System.out.println("he is 21 years old");


    

    }
 }
