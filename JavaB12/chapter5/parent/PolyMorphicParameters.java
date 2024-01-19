package JavaB12.chapter5.parent;

public class PolyMorphicParameters {
   
}

class Reptile{
     String getName(){
        return "Reptile";
    }
}

class Aligator extends Reptile{
    public String getName(){
        return "Aligator";
    }
}

class Crocodile extends Reptile{
        public String getName(){
            return "Crocodile";
    }    
}
class ZooKeeper{
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile: "+reptile.getName());
    }
    public static void main(String[] args) {
        feed(new Aligator());
        feed(new Crocodile());
        feed(new Reptile());
    }
    
}