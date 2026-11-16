

public class Inheritance extends Vechial{

    int age = 21;
    String name = " b_man_00000" ;
    float salary = 1500000.00f;

    void speed(){

       System.out.println("it is moving fast and the driver is "+ name);
       System.out.println("and he is an be tech guy and this age is  "+age);
    }

    


    public static void main(String[] args) {

        

          Inheritance obj = new Inheritance();
        obj.wheels = 4;
        System.out.println(obj.wheels+" this what car has ");
        obj.start();


    }
    
}
