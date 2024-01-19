package JavaB12.chapter5.parent;
//method hiding
public class Rodent {
    protected static int tailLength = 4;
    public static void getRodentDetails(){
        System.out.println("parentTail = "+tailLength);
    }
    
}
class Mouse extends Rodent{
    protected static int tailLength = 8;
    public static void getRodentDetails(){
        System.out.println("Tail = "+tailLength);
    }
    public static void main(String[] args) {
        Rodent.getRodentDetails();
    }
}