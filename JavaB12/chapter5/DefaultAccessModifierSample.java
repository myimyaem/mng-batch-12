package JavaB12.chapter5;

import java.time.LocalDate;

import JavaB12.chapter4.MethodL;
import static JavaB12.chapter4.MethodL.longs;

public class DefaultAccessModifierSample extends MethodL {

    public int getCounter(){
    return counter++;
    }
    public int getCounterLocal(int localVar){
    return localVar++;
    }
    public static void main(String[] args) {
        DefaultAccessModifierSample DAMS = new DefaultAccessModifierSample();
        LocalDate dob = LocalDate.of(2000, 5, 25);
        int age = getAge(dob);
        
        MethodL ml = new MethodL();
        ml.counter = 13;
        System.out.println("ml.counter "+ ml.counter);
        counter++;
        System.out.println("counter "+counter);
        ml.counter++;
        System.out.println("ml.counter "+ml.counter);
        DAMS.getCounterLocal(ml.counter);
        System.out.println("ml.counter "+ml.counter);
        DAMS.getCounter();
        System.out.println("counter "+counter);
        System.out.println("you are now "+age+ " years old");
    }
    
}
