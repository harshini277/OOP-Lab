public class Organism {
    void isOrganism(){
        System.out.println("This is an organism");
    }
}
public class Plant extends Organism{
    void photosynthesis(){
        System.out.println("Photosynthesis is being performed.");
    }
}
public class Animal extends Organism{
    void eat(){
        System.out.println("It is eating");
    }

}
public class Dog extends Animal{
    void bark(){
        System.out.println("The dog is barking");
    }

}
public class Cat extends Animal{
    void meow(){
        System.out.println("The dog is meowing");
    }

}

public class Hybrid {
    public static void main(String[] args) {
        Plant p = new Plant();
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        p.isOrganism();
        p.photosynthesis();
        a.isOrganism();
        a.eat();
        c.isOrganism();
        c.eat();
        c.meow();
        d.isOrganism();
        d.eat();
        d.bark();
    }
}
