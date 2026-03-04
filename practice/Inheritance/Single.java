public class Parent {
    String species = "human";
    void status(){
        System.out.println("I am a parent");
    }
}

public class Child extends Parent{
    void status(){
        System.out.println("I am a child");
    }
}

public class Single {
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child();

        p.status();
        c.status();
        System.out.println("Species (Parent): "+p.species);
        System.out.println("Species (Child): "+c.species);
    }
}
