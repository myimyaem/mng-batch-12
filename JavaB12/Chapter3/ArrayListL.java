package JavaB12.Chapter3;
import java.util.*;

public class ArrayListL {
    public static void main(String[] args) {
        ArrayList anyType = new ArrayList();
        anyType.add(1);
        anyType.add("Marco");
        anyType.add(true); //Boolean.TRUE
        anyType.add(3.3);
        System.out.println(anyType);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Chicken");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println( animals.add("Frog"));
        animals.add(0,"Snake");
        System.out.println(animals);
        System.out.println(animals.remove("Ox")); //false
        System.out.println(animals.remove(2));
        System.out.println(animals);
        animals.set(0, "Cobra");
        System.out.println(animals);

        ArrayList<String> bird = new ArrayList<>();
        System.out.println(animals.isEmpty());//false
        System.out.println(bird.isEmpty()); // true
        System.out.println(animals.size());// 4
        System.out.println(bird.size());//0

        animals.clear();
        System.out.println(animals);

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b]
        two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false
        Integer a = 2;
        int b = 4;
        String c = "24";
        System.out.println(a.sum(a,b));
        a = Integer.parseInt(c)+b;
        System.out.println(a.toString());

        List numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        List<Object> list = Arrays.asList("one", "two",1,4,4,1,1,4,2);
        System.out.println(list);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(99);
        numbers1.add(5);
        numbers1.add(81);
        Collections.sort(numbers1);
        System.out.println(numbers1); 
        Collections.reverse(numbers1);
        System.out.println(numbers1); 
        
    }   
}
