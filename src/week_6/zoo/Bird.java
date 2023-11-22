package week_6.zoo;

public class Bird extends Animal{
    public void fly() {
        System.out.println("I am flying");
    }

    public void sing(){
        super.walk();
        this.fly();
        System.out.println("I am singing");
    }

}
