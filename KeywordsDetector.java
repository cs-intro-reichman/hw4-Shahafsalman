public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    
// Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++)
        {
            for (int n = 0; n < keywords.length; n ++)
            {
                if (contains(arrOfWords(sentences[i].toLowerCase()), keywords[n].toLowerCase()) == true) {
                    System.out.println(sentences[i]);
                }
            }
        }

    }

    public static boolean contains (String[] arr, String word)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equals(word)) {       
                return true;
            }
        }
        return false;
    }


    
    public static String[] arrOfWords(String str)
    {
        int countWords = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                countWords++;
            }
        }
        String[] words = new String[countWords + 1];

        int strIndex = 0;
                for (int i = 0; i < words.length; i++)
                {
                    words[i] = "";
                    if (str.charAt(strIndex) != ' ')
                    {
                        while (strIndex < str.length() && str.charAt(strIndex) != ' ') {
                            words[i] += str.charAt(strIndex);
                            strIndex++;
                        }
                    }
                    strIndex++;
                }
        return words;
    }



    
}
