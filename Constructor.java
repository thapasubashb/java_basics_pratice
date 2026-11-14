public class Constructor{

    public static void main(String[] args) {
        
      Add obj = new Add(2, 4); // default constructor 
          obj.print();// it will give you the value default due to default constructor.
    }
    
}

  class Add{
    
    int a , b ;
   
    // this is what default constructor will do when you want to don't make an constructor but if you make the constructor then this will 
    // not be considered 
    // public Add(){
    //     int a = 0; 
    //     int b = 0;
    // }
    
    public Add(int a , int b  ){

        this.a = a;  // we use this because it show which is the actual a and which is the parameter a so that the compliler don't get confused.
        this.b  =b;

    }
     
      void print(){
        System.out.println("value a "+ a + " value b "+ b + " will be added ");
     }


  }

