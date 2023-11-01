package interfaces;

import java.util.ArrayList;

public class Animal {
    ArrayList<Speakable> speakingAnimals;

    public Animal() {
        this.speakingAnimals = new ArrayList<>();
    }

    public void addSpeakingAnimal(Speakable speakingAnimal){
        this.speakingAnimals.add(speakingAnimal);
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
    }
}
