// ফাইলের নাম: Strings.java
// টপিক: Java Strings
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. String দিয়ে লেখা (text) রাখা হয়।
//    String ভ্যারিয়েবলে একগুচ্ছ অক্ষর থাকে, যা ডাবল কোটেশন " " এর
//    ভেতরে লিখতে হয়।
//
// 2. String আসলে একটা object, তাই এর নিজস্ব মেথড আছে,
//    যা দিয়ে লেখার ওপর বিভিন্ন কাজ করা যায়।
//    মেথড কল করার নিয়ম: ভ্যারিয়েবল.মেথডের_নাম()
//
// 3. গুরুত্বপূর্ণ String মেথড:
//      length()       -> লেখায় কয়টা অক্ষর আছে (space সহ) গুনে দেয়
//      toUpperCase()  -> সব অক্ষর বড় হাতের করে
//      toLowerCase()  -> সব অক্ষর ছোট হাতের করে
//      indexOf()      -> কোনো লেখা প্রথমবার কোন জায়গায় (index) আছে, সেটা দেয়
//      charAt()       -> নির্দিষ্ট index এর অক্ষরটা দেয়
//      equals()       -> দুটো String হুবহু এক কি না তুলনা করে (true/false)
//      trim()         -> শুরু ও শেষের ফাঁকা জায়গা (whitespace) মুছে দেয়
//
// 4. Index গোনা শুরু হয় 0 থেকে:
//    0 হলো প্রথম অক্ষর, 1 হলো দ্বিতীয়, 2 হলো তৃতীয়, এভাবে চলে।
//    indexOf() এ space ও গোনা হয়।
//
// 5. String তুলনা করতে equals() ব্যবহার করবে, == নয়।
//
// 6. সব String মেথডের পূর্ণ তালিকা W3Schools এর
//    "Java String Methods Reference" পেজে পাওয়া যাবে।
// ================================================================

public class Strings {
    public static void main(String[] args) {

        // ==================== String তৈরি ====================
        String greeting = "Hello"; // ডাবল কোটেশনের ভেতরে লেখা
        System.out.println(greeting); // আউটপুট: Hello

        // ==================== String এর দৈর্ঘ্য: length() ====================
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + alphabet.length()); // 26

        // ==================== বড় ও ছোট হাতের অক্ষর ====================
        String hello = "Hello World";
        System.out.println(hello.toUpperCase()); // আউটপুট: HELLO WORLD
        System.out.println(hello.toLowerCase()); // আউটপুট: hello world

        // ==================== লেখার জায়গা খোঁজা: indexOf() ====================
        // "locate" শব্দটা প্রথমবার index 7 এ শুরু হয়েছে
        // (Please = 0-5, space = 6, তারপর locate শুরু)
        String sentence = "Please locate where 'locate' occurs!";
        System.out.println(sentence.indexOf("locate")); // আউটপুট: 7

        // ==================== নির্দিষ্ট জায়গার অক্ষর: charAt() ====================
        // index 0 হলো প্রথম অক্ষর, আর "Hello" তে শেষ অক্ষরের index হলো 4
        String word = "Hello";
        System.out.println(word.charAt(0)); // আউটপুট: H
        System.out.println(word.charAt(4)); // আউটপুট: o

        // ==================== String তুলনা: equals() ====================
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2)); // দুটোই "Hello", তাই true
        System.out.println(txt3.equals(txt4)); // লেখা আলাদা, তাই false

        // ==================== ফাঁকা জায়গা মোছা: trim() ====================
        // শুরু ও শেষের space মুছে যায়, মাঝের space থাকে
        String spaced = "   Hello World   ";
        System.out.println("Before: [" + spaced + "]");
        System.out.println("After:  [" + spaced.trim() + "]");

        // ==================== Exercise ====================
        // greeting2 এ "Hello World" বসানো (ডাবল কোটেশন সহ)
        String greeting2 = "Hello World";
        System.out.println(greeting2); // আউটপুট: Hello World
    }
}