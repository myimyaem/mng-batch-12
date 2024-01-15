package JavaB12.chapter5;
import JavaB12.chapter5.parent.*;
public class Mammal extends Animal {
    private int limbs;
    private int numberOfTeeth;

    public int getNumberOfTeeth() {
        return this.numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public int getLimbs() {
        return this.limbs;
    }

    public void setLimbs(int limbs) {
        if(limbs==2 || limbs==4)
            this.limbs = limbs;
        else
            System.out.println("Invalid number of limbs");
    }

    
    
     
}
