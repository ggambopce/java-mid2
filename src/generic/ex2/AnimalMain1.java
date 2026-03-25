package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

    public class AnimalMain1 {
        public static void main(String[] args) {
            Animal animal = new Animal("동물", 10);
            Dog dog = new Dog("멍멍이", 10);
            Cat cat = new Cat("야옹이", 10);

            Box<Dog> dogBox = new Box<>();
            dogBox.setValue(dog);
            Dog finddog = dogBox.getValue();
            System.out.println("finddog = " + finddog);

            Box<Cat> catBox = new Box<>();
            catBox.setValue(cat);
            Cat findcat = catBox.getValue();
            System.out.println("findcat = " + findcat);

            Box<Animal> animalBox = new Box<>();
            animalBox.setValue(animal);
            Animal findanimal = animalBox.getValue();
            System.out.println("findanimal = " + findanimal);
        }
}
