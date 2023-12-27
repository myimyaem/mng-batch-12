package JavaB12.Chapter2;

public class Conditional {
    public static void main(String[] args) {
        //single condition
        int timeOfDay = 8;
        if(timeOfDay<12){
            System.out.println("Good morning");
            timeOfDay=13;}
        // two conditions
        int timeOfDay2 =13;
        if(timeOfDay2<12){
            System.out.println("Good morning");
            }
        else
            System.out.println("Good Afternoon");
        //two or more conditions
        int timeOfDay3 =15;
        if(timeOfDay3>18){
            System.out.println("Good evening");
            }
        else if(timeOfDay3==15)
            System.out.println("Afternoon Break");
        else if(timeOfDay3>12)
            System.out.println("Good Afternoon");
        
        else 
            System.out.println("Good morning");
        // switch statements
        int DayOfWeek = 11;
        switch (DayOfWeek) {
            
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("invalid Day of week value");break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            
        }
        String  fruits = "Apple";
        switch (fruits) {
            case "Apple":
                System.out.println("price at 10 pesos per pc");
                break;
            case "Grapes":
                System.out.println("price at 300 pesos per kls");
                break;
            case "Kiwi":
                System.out.println("price at 60 pesos per pc");
                break;
            default:
            System.out.println("invalid product name");
                break;
        }
        }
      
}
