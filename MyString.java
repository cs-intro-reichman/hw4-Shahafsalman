public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("baba yaga", "baba")); //true
        System.out.println(contains("baba yaga", "")); //false
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); //false
        System.out.println(contains("baba yaga", "Yaga")); //false
        System.out.println(contains("baba yaga", "babayaga")); //true

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newString = "";
    int asciiValue = 0;
    for (int i = 0; i < str.length(); i++)
    {
        asciiValue = str.charAt(i);
        if (asciiValue >= 65 && asciiValue <= 90)
        {
            newString += (char)(asciiValue + 32);
        }
        else
        {
            newString += str.charAt(i);
        }
    }

    return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    String string1 = str1;
    String string2 = str2;
    int count = 0;

    for (int i = 0; i < string2.length(); i++)
    {
        for (int n = 0; n < string1.length(); n++)
        {
            if (string1.charAt(n) == string2.charAt(i))
            {
                count++;
                n = string1.length();
            }
            else if (string1.charAt(n) == ' ') {
                count++;
            }
        }
    }
    if (count == string2.length())
    {
        return true;   
    }
    return false;
    }
}
