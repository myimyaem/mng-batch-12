package JavaB12.chapter4;

import java.time.*;
public class MethodL {
    static protected int counter;
    static protected  int getAge(LocalDate dob){
        LocalDate now_local = LocalDate.now();
        return  now_local.compareTo(dob);
    }
    static void hello(){
        System.out.println("Hello world");
        // return;
    }
    public static int longs() {
        return (int) 9L; // DOES NOT COMPILE
        }
        // public void walk2;

        static float getaverage(float... grades){
            float subtotal=0;
            for(float grade:grades)
                subtotal+=grade;
            return subtotal/(grades.length);
        
        
        }
        static String getaverage2(String name,boolean e,float... grades){
            float subtotal=0;
            for(float grade:grades)
                subtotal+=grade;
            return "Hello "+name+", your average is " + subtotal/(grades.length);
        }
        public static String speak(String name) {
            // System.out.println("Hello,"+name);
            return name;
        }
        public static int speak(int age) {
            // System.out.println("you are now "+age+ " years old");
            return age;
        }
        public static void speak(String name,int age) {
             System.out.println("Hello,"+name+ " you are now "+age+ " years old");
        }
        // public void fly(int[] lengths) { }
        // public void fly(int... lengths) { }
        public static void fly(int numMiles) {  System.out.println("int");}
        public static void fly(Integer numMiles) { System.out.println("integer"); }
        public static void fly(String s) { System.out.println("string "); } 
        public static void fly(Object o) { System.out.println("object "); } 
        public static String glide(String s) { return "1"; }
        public static String glide(String... s) { return "2";}

        public static String glide(Object o) { return "3"; }
        public static String glide(String s, String t) { return "4"; }
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name); 
        LocalDate dob = LocalDate.of(2000, 5, 25);
        int age = getAge(dob);
        System.out.println("you are now "+age+ " years old");
        hello();
        System.out.println(getaverage(95,92,97,80,87,75,84));
        System.out.println(getaverage2("Marco",true,95,92,97,80,87,75,84));
        speak(speak("Marco"), speak(21));
        fly(1);
        Integer f = 7;
        fly(f);
        fly("test");
        fly(true);
        fly(33.3);
        System.out.println(glide("a"));
        System.out.println(glide("a", "b"));
        System.out.println(glide("a", "b", "c")); 

    }
}
