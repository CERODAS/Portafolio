public class Mute implements ISound{
    public Mute() {
    }
    @Override
    public void makeSound(){
        System.out.println("No puedo grasnar");
    }

    @Override
    public String toString() {
        return "Mute{}";
    }
}
