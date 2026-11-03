// ফাইলের নাম: DataTypes.java
// টপিক: Java Data Types
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Java তে প্রতিটা ভ্যারিয়েবলের একটা নির্দিষ্ট ডেটা টাইপ থাকতে হয়।
//
// 2. ডেটা টাইপ দুই ভাগে বিভক্ত:
//    (ক) Primitive টাইপ: byte, short, int, long, float, double, boolean, char
//    (খ) Non-primitive টাইপ: String, Array, Class ইত্যাদি (পরের চ্যাপ্টারে আসবে)
//
// 3. ৮টা primitive টাইপ:
//      byte    -> ছোট পূর্ণ সংখ্যা: -128 থেকে 127
//      short   -> পূর্ণ সংখ্যা: -32,768 থেকে 32,767
//      int     -> পূর্ণ সংখ্যা: -2,147,483,648 থেকে 2,147,483,647
//      long    -> অনেক বড় পূর্ণ সংখ্যা (মানের শেষে L লাগে)
//      float   -> দশমিক সংখ্যা, 6-7 ঘর পর্যন্ত নির্ভুল (মানের শেষে f লাগে)
//      double  -> দশমিক সংখ্যা, 15-16 ঘর পর্যন্ত নির্ভুল
//      boolean -> শুধু true অথবা false
//      char    -> একটা অক্ষর, অথবা ASCII মান
//
// 4. টাইপ বদলানো যায় না:
//    একবার টাইপ ঠিক করলে সেই ভ্যারিয়েবলে অন্য টাইপের মান রাখা যায় না।
//    এতে Java নিরাপদ থাকে, কারণ ভুল করে টাইপ গুলিয়ে ফেললে compiler থামিয়ে দেয়।
//    টাইপ বদলাতে চাইলে type casting লাগে (যেমন int কে double বানানো)।
// ================================================================

public class DataTypes {
    public static void main(String[] args) {

        // ==================== মূল পাঁচটা টাইপ ====================
        int myNum = 5;               // Integer (পূর্ণ সংখ্যা)
        float myFloatNum = 5.99f;    // Floating point number (দশমিক সংখ্যা)
        char myLetter = 'D';         // Character (একটা অক্ষর)
        boolean myBool = true;       // Boolean (true/false)
        String myText = "Hello";     // String (লেখা, এটা non-primitive)

        System.out.println("int: " + myNum);
        System.out.println("float: " + myFloatNum);
        System.out.println("char: " + myLetter);
        System.out.println("boolean: " + myBool);
        System.out.println("String: " + myText);

        // ==================== সব primitive টাইপের উদাহরণ ====================
        byte myByte = 100;                 // -128 থেকে 127 এর মধ্যে হতে হবে
        short myShort = 5000;              // -32,768 থেকে 32,767 এর মধ্যে হতে হবে
        long myLong = 15000000000L;        // বড় সংখ্যা, শেষে L লাগে
        double myDouble = 19.99;           // বেশি নির্ভুল দশমিক সংখ্যা
        char myAscii = 65;                 // char এ ASCII মান দিলে অক্ষর হয় (65 = 'A')

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("long: " + myLong);
        System.out.println("double: " + myDouble);
        System.out.println("char (ASCII 65): " + myAscii);

        // ==================== প্রতিটা টাইপের সীমা (range) ====================
        // Java নিজেই সীমাগুলো জানে, সেগুলো এভাবে দেখা যায়
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // ==================== টাইপ বদলানো যায় না ====================
        // নিচের লাইনগুলো চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।

        // myNum = "Hello";   // Error: int ভ্যারিয়েবলে String রাখা যায় না

        String myText2 = "Hi";
        // myText2 = 123;     // Error: String ভ্যারিয়েবলে সংখ্যা রাখা যায় না
        System.out.println("myText2: " + myText2);
    }
}