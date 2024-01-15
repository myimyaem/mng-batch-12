package JavaB12.chapter4;
public class EncapsulationL {
    public static void main(String[] args) {
        Swan mother  = new Swan();
        mother.setNumberOfEggs(5);
        System.out.println(mother.getNumberOfEggs());
        mother.addNumOfEggs(5);
        System.out.println(mother.getNumberOfEggs());
        mother.deductNumOfEggs(15);
        System.out.println(mother.getNumberOfEggs());
        mother.deductNumOfEggs(4);
        System.out.println(mother.getNumberOfEggs());
        // mother.NumberOfEggs =90; // error
        ImmutatableSwan tita = new ImmutatableSwan(32);
        System.out.println(tita.getNumberOfEggs());
        tita = new ImmutatableSwan(53);
    }
    
}
class Swan{
    private int NumberOfEggs;

    public int getNumberOfEggs() {
        return this.NumberOfEggs;
    }

    public void setNumberOfEggs(int egg){
        if(egg>0)
            NumberOfEggs = egg;
        else
            System.out.println("invalid amount of eggs");
    }
    void addNumOfEggs(int eggsToAdd){
        NumberOfEggs+=eggsToAdd;
    }
    void deductNumOfEggs(int eggsToDed){
        if(NumberOfEggs>=eggsToDed)
            NumberOfEggs-=eggsToDed;
        else
            System.out.println("Cannot deduct this number of eggs");
    }
}

class ImmutatableSwan{
    public ImmutatableSwan(int NumberOfEggs){
        this.NumberOfEggs = NumberOfEggs;
    }
    private int NumberOfEggs;

    public int getNumberOfEggs() {
        return this.NumberOfEggs;
    }

   
    
}