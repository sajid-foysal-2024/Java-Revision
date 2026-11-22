// ফাইলের নাম: NestedIf.java
// টপিক: Java Nested If
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. একটা if এর ভেতরে আরেকটা if লেখা যায়। একে nested if বলে।
//
// 2. কাজ: nested if দিয়ে আগের শর্ত সত্য (true) হলে তবেই
//    পরের শর্তটা পরীক্ষা করা যায়।
//    বাইরের শর্ত মিথ্যা হলে ভেতরের if পরীক্ষাই হয় না।
//
// 3. নিয়ম (syntax):
//      if (condition1) {
//        // condition1 true হলে এই কোড চলবে
//        if (condition2) {
//          // condition1 এবং condition2, দুটোই true হলে এই কোড চলবে
//        }
//      }
//
// 4. টিপ: দুটো শর্ত একসাথে সত্য হতে হলে && দিয়েও লেখা যায়:
//      if (x > 10 && y > 20)
//    তবে nested if এর সুবিধা হলো, বাইরের শর্ত সত্য হওয়ার পর
//    ভেতরের শর্তের আগে আলাদা কাজও করা যায়।
// ================================================================

public class NestedIf {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: দুটো শর্তই সত্য ====================
        int x = 15;
        int y = 25;

        if (x > 10) { // 15 > 10 সত্য, তাই ভেতরে ঢোকা হবে
            System.out.println("x is greater than 10");

            // Nested if: শুধু তখনই পরীক্ষা হয়, যখন বাইরের শর্ত সত্য
            if (y > 20) { // 25 > 20 সত্য
                System.out.println("y is also greater than 20");
            }
        }
        // আউটপুট:
        // x is greater than 10
        // y is also greater than 20

        // ==================== উদাহরণ ২: বাইরের শর্ত সত্য, ভেতরের মিথ্যা (অতিরিক্ত) ====================
        int x2 = 15;
        int y2 = 10;

        if (x2 > 10) { // 15 > 10 সত্য
            System.out.println("x is greater than 10");

            if (y2 > 20) { // 10 > 20 মিথ্যা, তাই এই ব্লক বাদ যাবে
                System.out.println("y is also greater than 20");
            }
        }
        // আউটপুট: x is greater than 10 (দ্বিতীয় লাইন প্রিন্ট হয়নি)

        // ==================== উদাহরণ ৩: বাইরের শর্ত মিথ্যা (অতিরিক্ত) ====================
        int x3 = 5;
        int y3 = 25;

        if (x3 > 10) { // 5 > 10 মিথ্যা, তাই ভেতরের কিছুই পরীক্ষা হবে না
            System.out.println("x is greater than 10");

            if (y3 > 20) {
                System.out.println("y is also greater than 20");
            }
        } else {
            // y3 > 20 সত্য হলেও ভেতরের if পরীক্ষাই হয়নি
            System.out.println("Outer condition is false, so inner if was not checked");
        }
        // আউটপুট: Outer condition is false, so inner if was not checked
    }
}