import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // calculates the BMI
        int Weight = 70;
        double Height = 1.75;
        double resultOfIBM = Weight / (Height * Height);
        System.out.println(resultOfIBM);

        //calculates the percentage
        double obtainedMarks = 85;
        double totalMarks = 100;
        double Percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println(Percentage + "%");

        // convert the amount in another currency
        double USD = 100;
        double EUR = 0.85;
        double AmountInEUR = USD * EUR;
        System.out.println(AmountInEUR);

        //a string as input, calculates its length, and then reverses
        //the string using the StringBuilder class
        String text = "Hello, world!";
        StringBuilder text2 = new StringBuilder("Hello, world!");
        text2.reverse();
        System.out.println("length of string :" + text.length() + " And Reverse string :" + text2);

        // extract a substring from sentence,

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = s.nextLine();
        System.out.println(sentence.substring(10, 20));

        // check if the keyword is present in the sentence
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence2 = r.nextLine();
        System.out.println("Enter a keyword");
        String keyword = r.nextLine();

        if (sentence2.contains(keyword)) {
            System.out.println(" a Keyword is present in the sentence.");
        } else {
            System.out.println("Keyword  is not present in the sentence.");
        }

        //replace all occurrences of the word with another word
        String sentence4 = "The quick brown fox jumps over the lazy dog";
        String keyword3 = "cat";
        System.out.println(sentence4.replace("fox", "cat"));


        /*8 program that takes two strings as input and check if they are equal, ignoring
        the case */

        Scanner q = new Scanner(System.in);
        System.out.println("Enter first sentence");
        String sen1 = q.nextLine();
        System.out.println("Enter second sentence");
        String sen2 = q.nextLine();

        if (sen1.equalsIgnoreCase(sen2)) {
            System.out.println("string are equal");
        } else {
            System.out.println("string Not equal");
        }
    }




}



