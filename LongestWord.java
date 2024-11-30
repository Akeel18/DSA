public class LongestWord {

    public static void main(String[] args) {
        String sentence = "Data structures and algorithms";
        int maxLength = findLongestWordLength(sentence);
        System.out.println("The length of the longest word is: " + maxLength);
    }

    public static int findLongestWordLength(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");
        
        int maxLength = 0;
        
        // Linear search 
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        
        return maxLength; 
    }
}
