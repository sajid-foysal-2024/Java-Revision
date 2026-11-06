// ফাইলের নাম: TypeCasting.java
// টপিক: Java Type Casting
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Type casting মানে এক ডেটা টাইপকে আরেক ডেটা টাইপে রূপান্তর করা।
//    যেমন: int কে double বানানো।
//
// 2. Java তে casting দুই ধরনের:
//
//    (ক) Widening Casting (স্বয়ংক্রিয়):
//        ছোট টাইপ থেকে বড় টাইপে রূপান্তর।
//        byte -> short -> char -> int -> long -> float -> double
//        Java এটা নিজে নিজেই করে, কারণ এতে তথ্য হারানোর ঝুঁকি নেই।
//        যেমন: int এর মান double এ নিরাপদে ধরে যায়।
//
//    (খ) Narrowing Casting (ম্যানুয়াল):
//        বড় টাইপ থেকে ছোট টাইপে রূপান্তর।
//        double -> float -> long -> int -> char -> short -> byte
//        এটা নিজে করতে হয়: মানের সামনে বন্ধনীর ভেতরে টাইপ লিখে, যেমন (int)।
//        কারণ এতে তথ্য হারাতে পারে।
//        যেমন: double থেকে int করলে দশমিক অংশ বাদ পড়ে যায়।
//
// 3. বাস্তব উদাহরণ: গেমে ইউজারের স্কোরের শতকরা হার বের করা।
//    দুটো int ভাগ করলে Java পূর্ণ সংখ্যার ভাগ করে (দশমিক অংশ হারিয়ে যায়)।
//    তাই একটা সংখ্যাকে আগে (double) এ cast করে নিলে ভাগ নির্ভুল হয়।
// ================================================================

public class TypeCasting {
    public static void main(String[] args) {

        // ==================== Widening Casting (স্বয়ংক্রিয়) ====================
        // ছোট টাইপ (int) থেকে বড় টাইপ (double) এ নিজে নিজেই রূপান্তর হয়
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);    // আউটপুট: 9
        System.out.println(myDouble); // আউটপুট: 9.0 (double তাই দশমিক সহ)

        // ==================== Narrowing Casting (ম্যানুয়াল) ====================
        // বড় টাইপ (double) থেকে ছোট টাইপ (int) এ নিজে হাতে রূপান্তর করতে হয়
        // বন্ধনীর ভেতরে টাইপ (int) লিখে দিতে হয়। এতে দশমিক অংশ বাদ পড়ে।
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2); // আউটপুট: 9.78
        System.out.println(myInt2);    // আউটপুট: 9 (দশমিক অংশ .78 বাদ পড়েছে)

        // ==================== বাস্তব উদাহরণ ====================
        // গেমের সর্বোচ্চ সম্ভাব্য স্কোর
        int maxScore = 500;

        // ইউজারের আসল স্কোর
        int userScore = 423;

        // ইউজারের স্কোর সর্বোচ্চ স্কোরের কত শতাংশ, সেটা বের করা।
        // userScore কে আগে double এ cast করা হয়েছে, যাতে ভাগ নির্ভুল হয়
        // (423.0 / 500 = 0.846, তারপর 100 দিয়ে গুণ করলে 84.6)
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);

        // ---------- অতিরিক্ত: cast না করলে কী হতো (বোঝার জন্য) ----------
        // দুটোই int হওয়ায় ভাগটা পূর্ণ সংখ্যার ভাগ হয়: 423 / 500 = 0
        int wrongPercentage = userScore / maxScore * 100;
        System.out.println("Cast ছাড়া ভুল ফলাফল: " + wrongPercentage); // আউটপুট: 0
    }
}