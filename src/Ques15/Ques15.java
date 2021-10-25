package Ques15;

public class Ques15 {
    // static variable s of type Singleton
    private static Ques15 s = null;
    // variable of type String
    public String str;
    //private constructor of the Singleton class that restricted to this class itself
    private Ques15()
    {
        str = "it is an example of singleton class.";
    }
    //static method to create an instance of the Singleton class
// we can also create a method with the same name as the class name
    public static Ques15 getInstance()
    {
//lazy initialization
        if (s== null)
            s = new Ques15();
        return s;
    }

}
