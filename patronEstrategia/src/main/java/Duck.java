import lombok.Setter;

import java.sql.SQLOutput;

public abstract class Duck {
    @Setter
    protected IFly flyBehavior;
    @Setter
    protected ISound soundBehavior;
    public Duck(){
    }
    public void swim(){
        System.out.println("Estoy nadando, incluyso puedo flotar");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performSound(){
        soundBehavior.makeSound();
    }
    public abstract void display();
    @Override
    public String toString(){
        return "Duck{}";
    }
}
