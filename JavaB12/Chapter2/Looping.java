package JavaB12.Chapter2;

public class Looping {
    public static void main(String[] args) {
        int x = 0;
        while (x<10) {
            System.out.println("x = "+x+ " x+1 ");
            x++;
        }
        System.out.println("****************");
        do{ 
            System.out.println("x = "+x+ " x-1 ");
            x--;}
            while(x>0);
        System.out.println("****************");
        int p = 10;
        for(int k = 1;k<=p;k++){
            System.out.println(k*p);
        }
        System.out.println("****************");
        String[] colors = new String[]{"Red","Green","Blue","Pink","Black","White"};

        for(String color: colors ){
            System.out.println(color);
        }
        System.out.println("****************");
COLORS:        for(String color: colors ){
                    System.out.println(color);
                    if(color.equals("Pink")){
                        break COLORS;
                    }
                    
        }
        System.out.println("****************");
COLORS2:        for(String color: colors ){
                    
                    if(color.equals("Pink")){
                        continue COLORS2;
                    }
                    System.out.println(color);
                }
    }
}
