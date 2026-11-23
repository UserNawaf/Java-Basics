public class Main {
    public static void main(String[] args) {



                                   // NAWAF AL JEHANI
                                 // Exercise (Java Basics)
                                  // 23 Nov 2026 (day 2 )


//Q1 :  Develop a program that takes the weight (in kilograms) and height (in meters)
//as input and calculates the BMI, then prints it.

        double weghit=70;
        double height = 1.75;

        double bmi = weghit / (height*height);
        System.out.println(" BMI ="+bmi);



 // Q2 : Write a program that takes the obtained marks and total marks as input and
        // calculates the percentage, then prints it.

        double marks = 85;
        double total = 100;
        double per = (marks / total) * 100;
        System.out.println("Percentage = " + per );



  // Q3: Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.
        double usd = 100;
        double rate = 0.85;
        System.out.println("Amount in EUR= " +(usd * rate));


   // Q4: Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Length of the string:  " + str.length() + " And Reversed string:" + sb);





    // Q5:Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.

        String sentence="The quick brown fox jumps over the lazy dog";
        String sub = sentence.substring(10,20);
        System.out.println(sub);




    // Q6: Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.

        String key = "jumps";
        boolean check = sentence.contains(key);
        System.out.println("Keyword " + key + " is present in the sentence: " + check);




    // Q7: Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.


        String newSentence = sentence.replace("fox", "cat");
        System.out.println(newSentence);






    // Q8: Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.

        String s1 = "Hello";
        String s2 = "hello";
        boolean isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("Strings are equal (ignoring case): " + isEqual);



    }

    }
