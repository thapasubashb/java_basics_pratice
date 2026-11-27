package Encapulation;

public class LearnEncapulation {

    public String name;
    private int age; // only this varible class can access inside this only
    // can't access the private things without you allowing them with the help of
    // getter setter methods , like the bellow example

    // this method is used so that you can set things ouside this class with
    // there permision and the method name can be anything its not compulsory to use
    // set and get.
    public void setAge(int age) {// if we use like this type of method and this keyword inside it then it helps to access outside this class aswell
        
        this.age = age;
        
    }

    // to print that thing or to get the value and access it we need getter method
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        System.out.println(
                "this is how it works the following things can't we access oustide of this until yougive them ");

    }

}
