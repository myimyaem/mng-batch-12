package JavaB12.Chapter1;

public class Chick {
    int age;
    String name;
    
    public Chick(){
        System.out.println("this is a constructor for chick");
    }
    public void Chick(){
        System.out.println("this is a method for chick");
    }
    {System.out.println("*******"); }
    public static void main(String[] args) {
        Chick c1 = new Chick();

        c1.Chick();
        Chick pm1 = new Chick();
        Chick pm2 = new Chick();
        pm2.age = 1;
        System.out.println(pm2.age);
        Chick c3 = new Chick();

    }
    
}
