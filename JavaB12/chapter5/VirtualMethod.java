package JavaB12.chapter5;

public class VirtualMethod {
    
}

class Birds{
    public String getName(){
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is:"+getName());
    }
}
class Peacock extends Birds{
    public String getName(){
        return "Peacock";
    }
    public static void main(String[] args) {
        Birds bird = new Peacock();
        bird.displayInformation();
        Birds p = new Birds();
        p.displayInformation();
    }
}