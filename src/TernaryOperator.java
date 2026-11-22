// ফাইলের নাম: TernaryOperator.java
// টপিক: Java Short Hand if...else (Ternary Operator)
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. if else এর একটা ছোট রূপ আছে, যার নাম ternary operator।
//    এতে তিনটা অংশ (operand) থাকে, তাই এই নাম (ternary মানে তিন)।
//    কয়েক লাইনের সহজ if else কে এক লাইনে লেখা যায়।
//
// 2. নিয়ম (syntax):
//      variable = (condition) ? expressionTrue : expressionFalse;
//
// 3. তিনটা অংশ:
//      (condition)       -> শর্ত
//      ? expressionTrue  -> শর্ত সত্য (true) হলে এই মান পাওয়া যাবে
//      : expressionFalse -> শর্ত মিথ্যা (false) হলে এই মান পাওয়া যাবে
//    ? কে পড়া যায় "যদি সত্য হয় তাহলে", আর : কে "নইলে"।
//
// 4. ternary operator সরাসরি System.out.println() এর ভেতরেও
//    বসানো যায়, অস্থায়ী ভ্যারিয়েবল ছাড়াই।
//
// 5. কখন ব্যবহার করবে: সহজ, ছোট if else এর জন্য।
//    শর্ত জটিল হলে বা ব্লকে অনেক লাইনের কাজ থাকলে সাধারণ
//    if else ভালো, কারণ ternary তখন পড়তে কঠিন হয়ে যায়।
// ================================================================

public class TernaryOperator {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: সাধারণ if else (আগের উপায়) ====================
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            // 20 < 18 মিথ্যা, তাই else ব্লক চলবে
            System.out.println("Good evening.");
        }
        // আউটপুট: Good evening.

        // ==================== উদাহরণ ২: ternary operator (ছোট উপায়) ====================
        int time2 = 20;

        // (time2 < 18) মিথ্যা, তাই ":" এর পরের মান "Good evening." result এ জমা হবে
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        // আউটপুট: Good evening.

        // ==================== উদাহরণ ৩: সরাসরি println() এর ভেতরে ====================
        int time3 = 20;

        // অস্থায়ী ভ্যারিয়েবল ছাড়াই সরাসরি প্রিন্ট
        System.out.println((time3 < 18) ? "Good day." : "Good evening.");
        // আউটপুট: Good evening.

        // ==================== অতিরিক্ত: শর্ত সত্য হলে কী হয় (বোঝার জন্য) ====================
        int time4 = 10;

        // (time4 < 18) সত্য, তাই "?" এর পরের মান "Good day." পাওয়া যাবে
        System.out.println((time4 < 18) ? "Good day." : "Good evening.");
        // আউটপুট: Good day.
    }
}