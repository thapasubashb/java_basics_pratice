public class ConstructorCallingChild extends ConstructorParentBeingCalled {

   int a ;
      ConstructorCallingChild(){
       
        super(5);
        
        System.out.println("parent constructor also will be called due to default constructor in inheritance so it will print the value called in child class parameter  " + value);
      }

    public static void main(String[] args) {
        
      
        ConstructorCallingChild obj = new ConstructorCallingChild();
        // obj.a = 3;
        // System.out.println(obj.a);
    }
}
    

