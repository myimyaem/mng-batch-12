package JavaB12.chapter5;
import JavaB12.chapter5.parent.*;
class Mammal extends Animal {
    private int limbs;
    private int numberOfTeeth;
    
    public Mammal(String name, int age, int NumberOfTeeth, int limbs) {
        //TODO Auto-generated constructor stub
        super(name,age);
        this.numberOfTeeth = NumberOfTeeth;
        this.limbs = limbs;
    }
    public Mammal(){}

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
