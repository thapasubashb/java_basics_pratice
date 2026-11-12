
public class Methodoverloading{
  
    public static void main(String[] args) {
        Great obj = new Great();
        obj.greeting();
        obj.greeting("subash"); // due to we have different parameters it knows which one to call   
        obj.greeting("subash", 5);
        obj.greeting(21);
    }


}

class Great{

    void greeting(){
        System.out.println("hello , good morning");
    }

    // method overloading 
    void greeting( String name){
        System.out.println("hello " +name+ ", good morning");
    }


void greeting( String name , int count ){
    for( int i =0 ; i< count ; i++ ){
        System.out.println("hello " +name+ ", good morning");
    }
}

    void greeting( int age ){
        System.out.println("hello " +age+ ", good morning");
    }

    
}
