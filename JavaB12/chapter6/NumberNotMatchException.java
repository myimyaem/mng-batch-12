package JavaB12.chapter6;

public class NumberNotMatchException extends RuntimeException {
 public NumberNotMatchException(int x,int y){
        super(setMsg(x,y));
 }
 public static String setMsg(int x,int y){
    String msg;
    if((x>=6) || (x<=0))
            msg="number out of range";
        else
            msg="Try again";    
    return msg;
 }
}
