package src.basic;

//abstract class Animal {
//    Animal(){
//        System.out.println("Creating new Animal");
//    }
//     abstract public void walk(); //abstract method
//     public void eat(){
//         System.out.println("Animal eats");
//    }// non-abstract method
//}
//class Horse extends Animal {
//    Horse(){
//        System.out.println("Creating horse");
//    }
//    public void  walk(){
//        System.out.println("walks on 4 lags");
//    }
//}
//class Chicken extends Animal {
//    Chicken(){
//        System.out.println("Creating chicken");
//    }
//    public void  walk(){
//        System.out.println("walks on 2 lags");
//    }
//}

interface Animal {
    void walk();
}
interface Herbivorous {
    void eat();
}

class Horse implements Animal, Herbivorous { //multiple inheritance
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
    public void eat() {
        System.out.println("Horse eat plants");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // Animal  animal = new Animal();
        // we can not create instance of Animal class
    }

}
