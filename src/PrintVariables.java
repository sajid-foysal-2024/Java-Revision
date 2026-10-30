// ফাইলের নাম: PrintVariables.java
// টপিক: Java Print Variables
//
// ====================  (Description) ====================
// 1. ভ্যারিয়েবলের মান দেখানোর জন্য println() মেথড ব্যবহার করা হয়।
// 2. লেখা (text) আর ভ্যারিয়েবল একসাথে দেখাতে + চিহ্ন ব্যবহার করতে হয়।
// 3. Java তে + চিহ্নের দুটো অর্থ আছে:
//      - String এর ক্ষেত্রে: লেখাগুলো জোড়া লাগায় (concatenation)
//      - সংখ্যার ক্ষেত্রে: মান যোগ করে (addition)
// 4. লেখা আর সংখ্যা একসাথে মিশালে সাবধান থাকতে হবে:
//      বন্ধনী ছাড়া হলে প্রথম String এর পর সংখ্যাগুলোও লেখা হিসেবে জোড়া লাগে।
//      তাই আগে যোগ করতে চাইলে বন্ধনী ( ) ব্যবহার করতে হবে।
// ================================================================

public class PrintVariables {
    public static void main(String[] args) {

        // ---------- উদাহরণ ১: লেখা + ভ্যারিয়েবল ----------
        // "Hello " লেখাটার সাথে name ভ্যারিয়েবলের মান জোড়া লাগছে
        String name = "John";
        System.out.println("Hello " + name); // আউটপুট: Hello John

        // ---------- উদাহরণ ২: ভ্যারিয়েবল + ভ্যারিয়েবল (String) ----------
        // firstName এর শেষে একটা space আছে, তাই নামের মাঝে ফাঁক আসবে
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // দুটো String জোড়া লেগে নতুন String হলো
        System.out.println(fullName); // আউটপুট: John Doe

        // ---------- উদাহরণ ৩: সংখ্যা + সংখ্যা (যোগ) ----------
        // int এর ক্ষেত্রে + চিহ্ন গাণিতিক যোগ করে
        int x = 5; // x এ 5 জমা আছে
        int y = 6; // y এ 6 জমা আছে
        System.out.println(x + y); // x + y = 11 হিসাব করে দেখাবে। আউটপুট: 11

        // ---------- উদাহরণ ৪: লেখা আর সংখ্যা মেশানো (সাবধান!) ----------
        // বন্ধনী ছাড়া: বাঁ থেকে ডানে কাজ হয়
        //   ধাপ ১: "The sum is " + x  ->  "The sum is 5"  (এখন এটা String)
        //   ধাপ ২: "The sum is 5" + y ->  "The sum is 56" (y যোগ হলো না, জোড়া লাগলো)
        System.out.println("The sum is " + x + y); // আউটপুট: The sum is 56

        // বন্ধনী সহ: আগে (x + y) হিসাব হয়ে 11 হয়, তারপর লেখার সাথে জোড়া লাগে
        System.out.println("The sum is " + (x + y)); // আউটপুট: The sum is 11
    }
}