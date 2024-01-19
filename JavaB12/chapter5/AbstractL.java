package JavaB12.chapter5;

public abstract class AbstractL {
    protected int age;
    public void eat(){
        System.out.println("a living being is eating");
    }
    public abstract String getName();
    public abstract int getAge(int age);
}
abstract class AbstractL2 extends AbstractL{
    public abstract int getHeight();
    public abstract int getWidth();
    @Override
    public String getName() {
        return "";
       }

    @Override
    public int getAge(int age) {
        return 0;
        }
    
}
class Main3 extends AbstractL2 implements canBurrow,WalksOnFoot
                                    ,HasTrunk,Herbivore,Omnivore{
    
    String name;
    
    // extends
    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }
    // implements
    public int getMaxDepth(){
        return 10;
    }
    // public double getTemp(){
    //     return 12.0;
    // }
    public static void main(String[] args) {
        Main3 m3 = new Main3();
        System.out.println(m3.getTemp());
        System.out.println(canBurrow.getEarthsGravity());
    }
}

interface canBurrow{ //abstract interface canBurrow{}
    // public static final int MINIMUM_DEPTH = 2;
    // public abstract int getMaxDepth();
    int MINIMUM_DEPTH = 2;
    static float getEarthsGravity(){
        return 9.8F;
    }
    int getMaxDepth();
    default double getTemp(){
        return 10.0;
    }
}
interface WalksOnFoot{}
interface HasTrunk{}
interface Herbivore{}
interface Omnivore{}
