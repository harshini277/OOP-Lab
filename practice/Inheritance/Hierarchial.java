public class Animal{
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

public class Hierarchial {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.bark();
        c.eat();
        c.meow();

    }
}
