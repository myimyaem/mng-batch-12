package JavaB12.Chapter2;

public class Operators {
    public static void main(String[] args) {
        int unary = -3;
        int unary2 = unary++;
        int unary3 = --unary2;
        int binaryOps = unary + unary2;
        int ternaryOps = (unary<unary2) ? 23 : 55;
        System.out.println("value 1:"+unary+" value 2:"+unary2
        +" value 3:"+unary3+" (unary<unary2) = "+ternaryOps);
        System.out.println(3<<2);
        System.out.println(12>>2);
        // numeric promotion
        short z = 1;
        byte x = 3;
        int result = x+z;
        System.out.println(result);
        int p = 1;
        long l = 33;
        long result2 = p*l;
        // casting
        int result3 = (int)(p*l);
        byte result4 = (byte)(p*l);
        byte underflow = -128;
        System.out.println((byte)(underflow-1));
        // compound assignment
        int q=2,w=3;
        q = q*z;
        byte m = 2;
        long n = 3;
        m *= n; // m = (int) (m * n)
        int k = 3; 
        int j = (k=10); // k assigns value of 10, return 10.  j = (10)
        System.out.println(j);
        System.out.println(k);

        // relational ops
        int e = 10, r = 20, t = 10;
        System.out.println(e < r); // Outputs true
        System.out.println(e <= r); // Outputs true
        System.out.println(e >= t); // Outputs true
        System.out.println(e > t); // Outputs false        
    }
}
