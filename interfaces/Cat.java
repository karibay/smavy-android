package interfaces;

public class Cat implements Speakable, Walkable{
    private int position = 0;
    private int speed = 2;
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        position += speed;
    }
}
