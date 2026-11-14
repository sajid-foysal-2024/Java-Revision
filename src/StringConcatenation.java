// ফাইলের নাম: StringConcatenation.java
// টপিক: Java String Concatenation
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Concatenation মানে একাধিক String জোড়া লাগিয়ে একটা String বানানো।
//
// 2. + অপারেটর দুটো String এর মাঝে ব্যবহার করলে সেগুলো জোড়া লাগে।
//    নামের মাঝে ফাঁক রাখতে আলাদা করে " " (ফাঁকা লেখা) যোগ করতে হয়।
//
// 3. বাক্য বানাতে লেখা আর ভ্যারিয়েবল একসাথে জোড়া যায়।
//    এমনকি int এর মানও লেখার সাথে জোড়া লাগে।
//
// 4. concat() মেথড দিয়েও String জোড়া যায়।
//    একাধিক String জুড়তে concat() পরপর (chain) বসানো যায়।
//
// 5. নোট: concat() দিয়ে একাধিক String জোড়া গেলেও বেশিরভাগ ডেভেলপার
//    + অপারেটর পছন্দ করে, কারণ এটা ছোট এবং পড়তে সহজ।
//    আরেকটা সুবিধা: + দিয়ে সংখ্যাও লেখার সাথে জোড়া যায়,
//    কিন্তু concat() এ শুধু String দেওয়া যায়।
// ================================================================

public class StringConcatenation {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: + দিয়ে নাম জোড়া ====================
        String firstName = "John";
        String lastName = "Doe";

        // মাঝে " " (একটা space) না দিলে নাম দুটো লেগে যেত (JohnDoe)
        System.out.println(firstName + " " + lastName); // আউটপুট: John Doe

        // ==================== উদাহরণ ২: বাক্য বানানো ====================
        String name = "John";
        int age = 25; // int, তবুও লেখার সাথে জোড়া লাগে

        System.out.println("My name is " + name + " and I am " + age + " years old.");
        // আউটপুট: My name is John and I am 25 years old.

        // ==================== উদাহরণ ৩: concat() মেথড ====================
        // concat() এ আলাদা " " দেওয়ার সুযোগ নেই, তাই space টা firstName2 এর ভেতরেই আছে
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2)); // আউটপুট: John Doe

        // ==================== উদাহরণ ৪: concat() পরপর (chain) ====================
        String a = "Java ";
        String b = "is ";
        String c = "fun!";

        // a এর সাথে b জোড়া লাগে, সেই ফলাফলের সাথে c জোড়া লাগে
        String result = a.concat(b).concat(c);
        System.out.println(result); // আউটপুট: Java is fun!

        // ==================== Exercise ====================
        // firstName আর lastName কে + দিয়ে জোড়া লাগানো
        System.out.println(firstName + lastName); // আউটপুট: JohnDoe (মাঝে space নেই)
    }
}