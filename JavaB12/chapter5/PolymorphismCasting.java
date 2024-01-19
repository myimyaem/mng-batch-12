package JavaB12.chapter5;

public class PolymorphismCasting {
    
}

class Bird{}

class Fish{
    public static void main(String[] args) {
        Fish fish = new Fish();
        // Bird bird = (Bird)fish;
    }
}

class Rodent{

}

class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara)rodent;
    }
}