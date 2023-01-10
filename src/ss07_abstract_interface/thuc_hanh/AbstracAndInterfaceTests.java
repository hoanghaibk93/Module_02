package ss07_abstract_interface.thuc_hanh;

public class AbstracAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].makeSound());
            if (animal[i] instanceof Chicken) {
                Edible edible = (Chicken) animal[i];
                System.out.println(edible.howtoEat());
            }
        }
       // Animal animal1 = new Chicken();
        //Edible edible1 = (Chicken) animal1;
//        Animal animal1 = new Chicken();
//
//        Edible edible1 = (Chicken) animal1;
//
//        System.out.println(edible1.howtoEat());

//        Animal animal1 = new Chicken();
//        System.out.println(animal1.makeSound());
            // Edible edible = (Chicken) animal[1];
       Fruit[] fruit = new Fruit[2];
        fruit[0] =new Orange();
        fruit[1] = new Apple();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i].howtoEat());
        }
        Fruit fruit1 = new Orange();
        System.out.println(fruit1.howtoEat());
        Edible edible = new Orange();
        System.out.println(edible.howtoEat());

    }
}

