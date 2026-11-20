// ফাইলের নাম: IfStatement.java
// টপিক: Java Conditions and If Statements
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Condition ও if স্টেটমেন্ট দিয়ে প্রোগ্রামের প্রবাহ নিয়ন্ত্রণ করা যায়:
//    কোন কোড চলবে আর কোনটা বাদ যাবে, সেটা ঠিক করা যায়।
//    উপমা: বৃষ্টি হলে ছাতা নাও, নইলে কিছু করার দরকার নেই।
//
// 2. প্রতিটা if এর একটা condition লাগে, যার ফলাফল true অথবা false।
//    তাই if আর boolean মান একসাথে কাজ করে।
//
// 3. সাধারণত condition বানাতে comparison operator ব্যবহার হয়:
//      a < b    ছোট           a <= b   ছোট অথবা সমান
//      a > b    বড়            a >= b   বড় অথবা সমান
//      a == b   সমান          a != b   সমান নয়
//
// 4. Java র conditional স্টেটমেন্ট:
//      if       -> শর্ত true হলে একটা কোড ব্লক চালায়
//      else     -> একই শর্ত false হলে অন্য কোড ব্লক চালায়
//      else if  -> প্রথম শর্ত false হলে নতুন আরেকটা শর্ত পরীক্ষা করে
//      switch   -> অনেকগুলো বিকল্পের মধ্যে একটা বেছে চালায়
//    (এই চ্যাপ্টারে শুধু if, বাকিগুলো পরের চ্যাপ্টারে শিখবে)
//
// 5. if এর নিয়ম (syntax):
//      if (condition) {
//        // condition true হলে এই কোড চলবে
//      }
//    - condition অবশ্যই boolean মান দিতে হবে
//      (boolean রাশি যেমন x > y, অথবা boolean ভ্যারিয়েবল যেমন isLightOn)।
//    - if ছোট হাতের অক্ষরে লিখতে হবে। If বা IF লিখলে error আসে।
//
// 6. if (isLightOn) আর if (isLightOn == true) একই কাজ করে,
//    কিন্তু প্রথমটা ছোট এবং পড়তে সহজ।
//
// 7. if এর শর্ত false হলেও প্রোগ্রাম থেমে যায় না।
//    if এর বাইরের লাইনগুলো ঠিকই চলে।
//
// 8. বন্ধনী { } ছাড়া if:
//    if এর পরে মাত্র একটা লাইন থাকলে { } বাদ দেওয়া যায়।
//    কিন্তু তখন শুধু প্রথম লাইনটাই if এর অংশ হয়। পরের লাইনগুলো
//    শর্ত মিথ্যা হলেও চলবে, যা অপ্রত্যাশিত ফলাফল দিতে পারে।
//
// 9. নিরাপদ উপায়: সবসময় { } ব্যবহার করবে।
//    এতে বোঝা যায় কোন লাইন if এর অংশ, কোড পরিষ্কার হয়
//    এবং লুকানো ভুল (bug) এড়ানো যায়।
// ================================================================

public class IfStatement {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: boolean ভ্যারিয়েবল দিয়ে ====================
        boolean isRaining = true;

        if (isRaining) { // isRaining true, তাই ভেতরের কোড চলবে
            System.out.println("Bring an umbrella!");
        }

        // ==================== উদাহরণ ২: সরাসরি তুলনা ====================
        if (20 > 18) { // 20, 18 এর চেয়ে বড়, তাই শর্ত true
            System.out.println("20 is greater than 18");
        }

        // ==================== উদাহরণ ৩: ভ্যারিয়েবল তুলনা (>) ====================
        int x = 20;
        int y = 18;
        if (x > y) { // 20 > 18, শর্ত true
            System.out.println("x is greater than y");
        }

        // ==================== উদাহরণ ৪: সমান কি না (==) ====================
        int a = 20;
        int b = 20;
        if (a == b) { // দুটোই 20, তাই শর্ত true
            System.out.println("x is equal to y");
        }

        // ==================== উদাহরণ ৫: boolean ভ্যারিয়েবল (true) ====================
        boolean isLightOn = true;

        if (isLightOn) { // if (isLightOn == true) এর ছোট রূপ
            System.out.println("The light is on.");
        }

        // ==================== উদাহরণ ৬: boolean ভ্যারিয়েবল (false) ====================
        boolean isLightOn2 = false;

        if (isLightOn2) {
            // শর্ত false, তাই এই লাইন প্রিন্ট হবে না
            System.out.println("The light is on.");
        }

        // এই লাইনটা if এর বাইরে, তাই শর্ত যাই হোক এটা চলবেই
        System.out.println("This line runs no matter what, because it is outside the if statement.");

        // ==================== উদাহরণ ৭: বন্ধনী ছাড়া if (এক লাইন) ====================
        if (20 > 18)
            System.out.println("20 is greater than 18");

        // ==================== সম্ভাব্য সমস্যা: বন্ধনী ছাড়া একাধিক লাইন ====================
        int p = 20;
        int q = 18;

        if (p > q)
            System.out.println("x is greater than y");  // শুধু এই লাইনটা if এর অংশ
        System.out.println("This line runs no matter what (not part of the if statement)");
        // ওপরের লাইনটা ইন্ডেন্ট করা থাকলেও if এর অংশ নয়, শর্ত যাই হোক এটা চলবেই

        // ==================== নিরাপদ উপায়: সবসময় { } ব্যবহার ====================
        int m = 20;
        int n = 18;

        if (m > n) {
            System.out.println("x is greater than y");
            System.out.println("Both lines are part of the if"); // এই লাইনও if এর অংশ
        }

        // if এর বাইরের কোড
        System.out.println("I am outside if, not part of if!");

        // ==================== ভুল নিয়মের নমুনা (কমেন্ট করা) ====================
        // নিচের লাইন চালু করলে compile error আসবে, কারণ if ছোট হাতের হতে হবে।
        // If (20 > 18) {
        //     System.out.println("Error!");
        // }

        // ==================== Exercise ====================
        int time = 20;
        if (time > 18) { // time = 20, তাই শর্ত true
            System.out.println("Good night");
        }
    }
}