package JavaB12.chapter5;

public class Dog  extends Mammal{
    public Dog(String name,int age,int NumberOfTeeth,int limbs){
        super( name, age, NumberOfTeeth, limbs);

    }
    public Dog(){

    }

    @Override
    public String toString(){
        return "Hi, my name is "+getName()+", I am "+getAge()+" years old, I have "+getLimbs()+" Limbs, and "+getNumberOfTeeth()+" number of teeth, hope to play with you soon";
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setAge(3);
        d1.setLimbs(4);
        d1.setName("Fulgoso");
        d1.setNumberOfTeeth(32);
        System.out.println(d1);
        Dog d2 = new Dog("Patrach",5,30,4);
        System.out.println(d2);
    }
}
