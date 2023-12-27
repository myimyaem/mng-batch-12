package JavaB12.Chapter3;

public class StringL {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2"); // s2 = s1 + "2"
        s2.concat("3");
        System.out.println(s2);
        String name ="animals of the wild";
        System.out.println("the string "+name+" has a length of "+name.length());
        String name2 = "marco";
        System.out.println(name2.toUpperCase());
        System.out.println(name2);
        System.out.println("Abc".toLowerCase().startsWith("a".toLowerCase()));
        System.out.println("Animals".contains("ani"));
        System.out.println("abcabc".replace("a", "azx"));
        System.out.println(name2.replace("a", "azx"));
        System.out.println(name2);
        System.out.println("\t hello");
        System.out.println("\t world");
        System.out.println("welcome \nto\njava");
    }
    
}
