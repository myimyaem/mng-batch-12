package JavaB12.chapter4;

import java.time.LocalDate;

public class MethodL2 {
    public static void main(String[] args) {
        MethodL ml = new MethodL();
        LocalDate dob = LocalDate.of(2000, 5, 25);
        System.out.println("you are now "+ml.getAge(dob)+ " years old");
    }
}
