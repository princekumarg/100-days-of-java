package operators_datatypes;

public class operator {
    public static void main(String args[]){
        int a=20,b=10,c=30;
        int result=((a>b)?(a>c)?a:c:(b>c)?b:c);
        //print arthematic operator
        System.out.println(+(a+b));
        System.out.println(+(a-b));
        System.out.println(+(a*b));
        System.out.println(+(a/b));
        //print bitwise operator
        System.out.println("a&b=" +(a&b));
        System.out.println("a|b=" +(a|b));
        System.out.println("a^b=" +(a^b));
        System.out.println("~a=" +(~a));
        System.out.println("~b=" +(~b));
        //ternary operator
        System.out.println("max of three number=" +result);
        //Shift operator
        System.out.println("a<<2=" +(a<<2));
        System.out.println("b<<2=" +(b<<2));
        System.out.println("a>>2=" +(a>>2));
        System.out.println("b>>2=" +(b>>2));
        System.out.println("(a<<2)+(b<<2)=" +((a<<2)+(b<<2)));
        System.out.println("(a>>2)+(b>>2)=" +((a>>2)+(b>>2)));
        System.out.println("(a<<2)+(b>>2)=" +((a<<2)+(b>>2)));
        System.out.println("(a>>2)+(b<<2)=" +((a>>2)+(b<<2)));


    }
}                                                                                                                                                                                                                                            
