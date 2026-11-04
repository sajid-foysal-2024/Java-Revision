// ফাইলের নাম: Characters.java
// টপিক: Java Characters ও Strings
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. char ডেটা টাইপ মাত্র একটা অক্ষর রাখে।
//    অক্ষরটা সিঙ্গেল কোটেশন ' ' এর ভেতরে লিখতে হয়, যেমন 'A' বা 'c'।
//
// 2. ASCII মান জানা থাকলে সেই সংখ্যা দিয়েও char এ অক্ষর রাখা যায়।
//    যেমন: 65 = 'A', 66 = 'B', 67 = 'C'
//    (সব ASCII মানের তালিকা W3Schools এর ASCII Table Reference এ পাওয়া যায়)
//
// 3. String ডেটা টাইপ একাধিক অক্ষরের সমষ্টি (লেখা) রাখে।
//    String এর মান ডাবল কোটেশন " " এর ভেতরে লিখতে হয়।
//
// 4. String এত বেশি ব্যবহৃত হয় যে অনেকে একে "বিশেষ নবম টাইপ" বলে।
//    কিন্তু আসলে String একটা non-primitive ডেটা টাইপ, কারণ এটা একটা object-কে বোঝায়।
//    String object এর কিছু মেথড আছে, যা দিয়ে লেখার ওপর বিভিন্ন কাজ করা যায়।
//    (object ও String নিয়ে বিস্তারিত পরের চ্যাপ্টারে শিখবে)
// ================================================================

public class Characters {
    public static void main(String[] args) {

        // ==================== char ====================

        // ---------- উদাহরণ ১: সিঙ্গেল কোটেশন দিয়ে অক্ষর ----------
        char myGrade = 'B';
        System.out.println(myGrade); // আউটপুট: B

        // ---------- উদাহরণ ২: ASCII মান দিয়ে অক্ষর ----------
        // সংখ্যা দিলে Java সেই ASCII মানের অক্ষরটা দেখায়
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1); // 65 -> A
        System.out.println(myVar2); // 66 -> B
        System.out.println(myVar3); // 67 -> C

        // ==================== String ====================

        // ---------- উদাহরণ ৩: ডাবল কোটেশন দিয়ে লেখা ----------
        String greeting = "Hello World";
        System.out.println(greeting); // আউটপুট: Hello World
    }
}