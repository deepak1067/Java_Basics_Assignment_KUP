package Ques15;



public class Ques15Test {
    public static void main(String args[])
    {
// instantiating Singleton class with variable a
        Ques15 a = Ques15.getInstance();
// instantiating Singleton class with variable b
        Ques15 b = Ques15.getInstance();
// instantiating Singleton class with variable c
        Ques15 c = Ques15.getInstance();
// changing variable of instance a
        a.str = (a.str).toUpperCase();
        System.out.println("String from a is " + a.str);
        System.out.println("String from b is " + b.str);
        System.out.println("String from c is " + c.str);
    }
}
