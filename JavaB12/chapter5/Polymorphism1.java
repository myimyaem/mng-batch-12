package JavaB12.chapter5;

public class Polymorphism1 {
    
}

class Primate{
    public boolean hasHair(){
        return true;
    }
}
interface hasTail{
    public boolean isTialStripped();
}

class Lemur extends Primate implements hasTail{

    @Override
    public boolean isTialStripped() {
        return false;
    }
    public int age = 10;
    // Casting an object from a subclass to a superclass
    //doesn’t require an explicit cast.
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Primate lemur2 = new Lemur();
        Lemur lemur3 = (Lemur) new Primate();
    }  
}