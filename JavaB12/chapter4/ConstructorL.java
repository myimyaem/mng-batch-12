package JavaB12.chapter4;

public class ConstructorL {
    int code;

    ConstructorL(){
        code = 1234;
        System.out.println("ConstructorL added");
    }
    public static void main(String[] args) {
        Bunny b1 = new Bunny();
        Bunny b2 = new Bunny();
        System.out.println(b1.name);
        System.out.println(b2.name);
        ConstructorL c1 = new ConstructorL();
        ConstructorL c2;
        System.out.println(c1.code);
        b1.Bunny();
        Bunny b3 = new Bunny("Marco");
        System.out.println(b3.name);
        Hamster hamster1 = new Hamster(32);
        Hamster hamster2 = new Hamster(23, "Black");
        System.gc();
        // Rabbit4 r4 = new Rabbit4();
    }
    
}

class Bunny{

    String name;
    public Bunny(){
        System.out.println("constructor added");
        name = "Rabbit";
    }
    public void Bunny() { 
        System.out.println("constructor void added");
    }
    public Bunny(String name){
        System.out.println("Bunny constructor named "+name+ " added");
        this.name = name;
    }
}

class Rabbit4 {

    private Rabbit4() { }

}
class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) {
        // first constructor
        // this.weight = weight;
        // color = "brown";
        this(weight,"brown");

    }
    public Hamster(int weight, String color) {
        // second constructor
        this.weight = weight;
        this.color = color; } }
