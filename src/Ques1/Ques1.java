package Ques1;

public class Ques1 {
    public boolean popInTheString(String stng)
    {
        int len = stng.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (stng.charAt(i) == 'p' && stng.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Ques1 m= new Ques1();
        String str1 =  "xyxapop";
        System.out.println("The given string is: "+str1);
        System.out.println("Is p?p appear in the given string? "+m.popInTheString(str1));
    }
}

