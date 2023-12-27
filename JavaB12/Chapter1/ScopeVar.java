package JavaB12.Chapter1;

public class ScopeVar {
    // instance variable
    int y = 32;
    static int x;
    public static void main(String[] args) {
        int a=1;
        int b;
        // System.out.println(b); //error b not been initialized
        System.out.println(x);
    }
    
}
