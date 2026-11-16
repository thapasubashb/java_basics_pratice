public class ConstructorParentBeingCalled { // this an parent class for the ConstructorCallingChild class

//    ConstructorParentBeingCalled    class (parent class)   <------------   ConstructorCallingChild class    (child class)



    ConstructorParentBeingCalled(){// this also would have called this parent constructor if we had done extends 

        int a = 1;
        int b = 3;
        System.out.println("printing the value "+ a + b);
    }


    public static void main(String[] args) {
        

    }


    
}
