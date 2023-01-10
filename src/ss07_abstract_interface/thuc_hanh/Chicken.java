package ss07_abstract_interface.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken: cook ku";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
