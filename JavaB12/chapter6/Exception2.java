package JavaB12.chapter6;

public class Exception2 {
    public void visitPorcupine() {

        try { seeAnimal(); }
        catch (AnimalsOutForAWalk e) {
            // first catch block
                System.out.print("try back  later"); }
        
        catch (ExhibitClosed e) {
            // second catch block
            System.out.print("not today");} }

    private void seeAnimal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seeAnimal'");
    }
    
}

class AnimalsOutForAWalk extends
RuntimeException { }

class ExhibitClosed extends
RuntimeException { }

class ExhibitClosedForLunch
extends ExhibitClosed { }