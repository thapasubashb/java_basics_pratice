


public class ConstructorParentBeingCalled { // this an parent class for the ConstructorCallingChild class
//    ConstructorParentBeingCalled    class (parent class)   <------------   ConstructorCallingChild class    (child class)

  int value  = 200000;

    ConstructorParentBeingCalled(){// this also would have called this parent constructor if we had done extends 

        int a = 1;
        int b = 3;
        System.out.println("printing the value "+ a + b);

    }

    ConstructorParentBeingCalled(int value){
         this.value = value;


        System.out.println("this the other constructor with same name its basically  overloading but still super figures out which to call ");
    }



    public static void main(String[] args) {
    } 
}
