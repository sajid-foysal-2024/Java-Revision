// ফাইলের নাম: ComparisonOperators.java
// টপিক: Java Comparison Operators
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Comparison operator দিয়ে দুটো মান (বা ভ্যারিয়েবল) তুলনা করা হয়।
//    এটা গুরুত্বপূর্ণ, কারণ এর সাহায্যে প্রোগ্রাম উত্তর খুঁজে
//    সিদ্ধান্ত নিতে পারে।
//
// 2. তুলনার ফলাফল সবসময় true অথবা false হয়।
//    এই মানগুলোকে Boolean মান বলে
//    (Booleans ও If..Else চ্যাপ্টারে বিস্তারিত শিখবে)।
//
// 3. সব comparison operator:
//      ==   Equal to                  সমান কি না          (x == y)
//      !=   Not equal                 সমান নয় কি না       (x != y)
//      >    Greater than              বড় কি না           (x > y)
//      <    Less than                 ছোট কি না           (x < y)
//      >=   Greater than or equal to  বড় অথবা সমান কি না  (x >= y)
//      <=   Less than or equal to     ছোট অথবা সমান কি না  (x <= y)
//
// 4. সতর্কতা: = আর == এক জিনিস নয়!
//      =   মান বসায় (assignment)
//      ==  দুটো মান সমান কি না তুলনা করে (comparison)
//
// 5. বাস্তব ব্যবহার: ভোট দেওয়ার বয়স হয়েছে কি না, পাসওয়ার্ড
//    যথেষ্ট লম্বা কি না ইত্যাদি পরীক্ষা করা।
// ================================================================

public class ComparisonOperators {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: বড় কি না (>) ====================
        int x = 5;
        int y = 3;
        System.out.println(x > y); // 5 > 3, তাই আউটপুট: true

        // ==================== উদাহরণ ২: সব operator একে একে ====================
        // এখানে x = 5, y = 3
        System.out.println("x == y  -> " + (x == y)); // সমান? 5 আর 3 সমান নয়: false
        System.out.println("x != y  -> " + (x != y)); // সমান নয়? হ্যাঁ: true
        System.out.println("x > y   -> " + (x > y));  // 5 বড় 3 এর চেয়ে: true
        System.out.println("x < y   -> " + (x < y));  // 5 ছোট 3 এর চেয়ে? না: false
        System.out.println("x >= y  -> " + (x >= y)); // 5 বড় অথবা সমান 3 এর? হ্যাঁ: true
        System.out.println("x <= y  -> " + (x <= y)); // 5 ছোট অথবা সমান 3 এর? না: false

        // দুটো মান সমান হলে == আর >= এর ফলাফল কেমন হয়, সেটা দেখা যাক
        int a = 5;
        int b = 5;
        System.out.println("a == b  -> " + (a == b)); // সমান: true
        System.out.println("a >= b  -> " + (a >= b)); // সমান বলে >= ও true
        System.out.println("a > b   -> " + (a > b));  // সমান, বড় নয়: false

        // ==================== বাস্তব উদাহরণ ১: ভোট দেওয়ার বয়স ====================
        int age = 18;

        System.out.println(age >= 18); // true, ভোট দেওয়ার বয়স হয়েছে
        System.out.println(age < 18);  // false

        // ==================== বাস্তব উদাহরণ ২: পাসওয়ার্ডের দৈর্ঘ্য ====================
        int passwordLength = 5;

        System.out.println(passwordLength >= 8); // false, পাসওয়ার্ড খুব ছোট
        System.out.println(passwordLength < 8);  // true, আরও অক্ষর দরকার

        // ==================== Exercise ====================
        System.out.println(5 > 3); // আউটপুট: true
    }
}