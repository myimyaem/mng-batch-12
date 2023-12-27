package JavaB12.Chapter3;

public class StringBuilderL {
    public static void main(String[] args) {
        String a = "Hello".concat(" world");
        StringBuilder b = new StringBuilder("Hello").append(" world");
        StringBuilder c = new StringBuilder(); //emty string
        c.append("Hello "); // Hello 
        c.append("Ph"); // Hello Ph
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder sb2 = sb.append("+end");
        System.out.println(sb2);
        System.out.println(sb);
        sb2.append("***");
        System.out.println(sb2);
        System.out.println(sb);
        // insert
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7, "-"); // sb = animals-
        sb3.insert(0, "-"); // sb = -animals-
        sb3.insert(4, "-"); // sb = -ani-mals-
        System.out.println(sb3);
        // delete
        StringBuilder sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 3); // sb = adef
        // sb4.deleteCharAt(5); // throws an exception
        //reverse
        StringBuilder sb5 = new StringBuilder("ABC");
        sb5.reverse();
        System.out.println(sb5);
        // to string
        String p = "CBA";
        // boolean isitsame = p==sb5.toString();
        boolean isitsame = p.equals(sb5.toString()); 
        System.out.println(isitsame);
    }
    
}
