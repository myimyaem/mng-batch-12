package JavaB12.chapter5;

public class ConstructorL2 {
    public static void main(String[] args) {
        ChildClass cc1 = new ChildClass();
        ChildClass cc2 = new ChildClass(4, true, false, "25521gfgy44y1d4g4dfg");
        System.out.println(cc1);
        System.out.println(cc2);

    }
    
}


class ParentClass{
    private int a;
    private int b;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

	

    ParentClass(){ //super() -> SubParentClass
        this(3);
    }
    ParentClass(int a){
        this(a, 3);
        

    }
    ParentClass(int a,int b){
        this.a = a;
        this.b = b;
    }
    //ParentClass(); //a = 3, b =3;
    // ParentClass(6); //a = 6, b =3;
    // ParentClass(6,10); //a = 6, b =10;
}

class SubParentClass extends ParentClass{
    boolean isLightsOn;

     boolean isIsLightsOn() {
        return this.isLightsOn;
    }

     void setIsLightsOn(boolean isLightsOn) {
        this.isLightsOn = isLightsOn;
    }

    boolean isTVOn;
    SubParentClass(){
        super();
       
    }
    SubParentClass(int a,boolean b,boolean c){ // parameter guidelines constructor(parent constructor,this constructor)
        super(a);
        isLightsOn = b;
        isTVOn = c;

    }
}

class ChildClass extends SubParentClass{
    String ReferenceCOde;
    boolean isLightsOn= true; // super.isLightsOn ->parent class(SubParentClass)

    public boolean isIsLightsOn() {
        return this.isLightsOn;
    }

    public void setIsLightsOn(boolean isLightsOn) {
		this.isLightsOn = isLightsOn;
	} 
    ChildClass(){
        super();
        ReferenceCOde = "0000000000";
    }
    ChildClass(int a,boolean b,boolean c, String d){
        super(a,b,c); //SubParentClass(int a,boolean b,boolean c)
        ReferenceCOde = d;
    }
    @Override
    public String toString(){
        return "ReferenceCOde: "+ReferenceCOde+"\nLights: "+super.isLightsOn
        +"\nTV: "+isTVOn+"\na: "+getA()+"\nb: "+getB();

        

    }
}