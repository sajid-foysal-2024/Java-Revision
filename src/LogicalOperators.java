// ফাইলের নাম: LogicalOperators.java
// টপিক: Java Logical Operators
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Comparison operator এর মতো Logical operator ও true বা false ফলাফল দেয়।
//    এগুলো দিয়ে একাধিক শর্ত জুড়ে ভ্যারিয়েবল বা মানের মধ্যের যুক্তি (logic) বের করা হয়।
//
// 2. তিনটা Logical operator:
//      &&   Logical AND  -> দুটো শর্তই সত্য হলে true দেয়
//                           উদাহরণ: x < 5 && x < 10
//      ||   Logical OR   -> যেকোনো একটা শর্ত সত্য হলে true দেয়
//                           উদাহরণ: x < 5 || x < 4
//      !    Logical NOT  -> ফলাফল উল্টে দেয় (true হলে false, false হলে true)
//                           উদাহরণ: !(x < 5 && x < 10)
//
// 3. সহজ উপমা:
//      &&  মানে "এবং"    (দুটোই লাগবে)
//      ||  মানে "অথবা"   (একটা থাকলেই চলবে)
//      !   মানে "না"     (উল্টে দেওয়া)
//
// 4. বাস্তব ব্যবহার: লগইন স্ট্যাটাস ও অ্যাক্সেস অধিকার যাচাই করা।
//    (if স্টেটমেন্টের ভেতরে ব্যবহার করলে আরও সহজে বোঝা যায়,
//     সেটা পরের চ্যাপ্টারগুলোতে শিখবে)
// ================================================================

public class LogicalOperators {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: x = 3 হলে ====================
        int x = 3;

        // && : x < 5 (true) এবং x < 10 (true), দুটোই সত্য, তাই true
        System.out.println("x = 3, x < 5 && x < 10   -> " + (x < 5 && x < 10));

        // || : x < 5 (true) অথবা x < 4 (true), যেকোনো একটা সত্য হলেই true
        System.out.println("x = 3, x < 5 || x < 4    -> " + (x < 5 || x < 4));

        // ! : ভেতরের ফলাফল true, ! সেটা উল্টে false করে দেয়
        System.out.println("x = 3, !(x < 5 && x < 10) -> " + !(x < 5 && x < 10));

        // ==================== উদাহরণ ২: x = 7 হলে (ফলাফল কীভাবে বদলায় দেখো) ====================
        x = 7;

        // x < 5 (false), x < 10 (true): একটা মিথ্যা, তাই && এর ফল false
        System.out.println("x = 7, x < 5 && x < 10   -> " + (x < 5 && x < 10));

        // x < 5 (false), x < 4 (false): দুটোই মিথ্যা, তাই || এর ফল false
        System.out.println("x = 7, x < 5 || x < 4    -> " + (x < 5 || x < 4));

        // ভেতরের ফলাফল false, ! সেটা উল্টে true করে দেয়
        System.out.println("x = 7, !(x < 5 && x < 10) -> " + !(x < 5 && x < 10));

        // ==================== বাস্তব উদাহরণ: লগইন চেক ====================
        boolean isLoggedIn = true;  // ইউজার লগইন করা আছে
        boolean isAdmin = false;    // ইউজার অ্যাডমিন নয়

        // লগইন করা আছে এবং অ্যাডমিন নয়, মানে সাধারণ ইউজার
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin)); // true

        // লগইন করা অথবা অ্যাডমিন, যেকোনো একটা থাকলেই অ্যাক্সেস আছে
        System.out.println("Has access: " + (isLoggedIn || isAdmin)); // true

        // লগইন করা নেই? isLoggedIn true, তাই উল্টে হলো false
        System.out.println("Not logged in: " + (!isLoggedIn)); // false

        // ==================== Exercise: খেলতে হলে লগইন এবং টিকিট দুটোই লাগবে ====================
        boolean hasTicket = true;
        System.out.println("Can play (ticket আছে): " + (isLoggedIn && hasTicket)); // true

        hasTicket = false;
        System.out.println("Can play (ticket নেই): " + (isLoggedIn && hasTicket)); // false
    }
}