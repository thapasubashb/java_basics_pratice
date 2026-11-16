public class ConstructorCallingChild extends ConstructorParentBeingCalled {

   int a ;
      ConstructorCallingChild(){
        
        System.out.println("parent constructor also will be called due to default constructor in inheritance  ");
      }

    public static void main(String[] args) {
        
      
        ConstructorCallingChild obj = new ConstructorCallingChild();
        obj.a = 3;
        System.out.println(obj.a);
    }
}
    

