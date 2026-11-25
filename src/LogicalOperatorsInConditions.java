// ফাইলের নাম: LogicalOperatorsInConditions.java
// টপিক: Java Logical Operators in Conditions
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Logical operator দিয়ে শর্ত জোড়া লাগানো বা উল্টে দেওয়া যায়।
//    এগুলো if, else ও else if এর সাথে মিলে জটিল সিদ্ধান্ত নিতে সাহায্য করে।
//
// 2. তিনটা অপারেটর:
//      &&  (AND) -> সব শর্ত সত্য (true) হতে হবে
//      ||  (OR)  -> অন্তত একটা শর্ত সত্য হলেই চলবে
//      !   (NOT) -> শর্ত উল্টে দেয় (true হলে false, false হলে true)
//
// 3. AND (&&): দুটো শর্তই সত্য হলে তবেই if ব্লক চলে।
//    উদাহরণ: a > b && c > a
//
// 4. OR (||): যেকোনো একটা শর্ত সত্য হলেই if ব্লক চলে।
//    উদাহরণ: a > b || a > c
//
// 5. NOT (!): শর্তের ফলাফল উল্টে দেয়।
//    উদাহরণ: !(a > b)
//    শর্ত বন্ধনীর ভেতরে রাখবে, নইলে ! শুধু প্রথম অংশে কাজ করে।
//
// 6. বাস্তব উদাহরণ: সিস্টেমে ঢোকার অনুমতি (access control)।
//    শর্ত: ইউজারকে লগইন করা থাকতে হবে, এবং হয় অ্যাডমিন হতে হবে
//    অথবা নিরাপত্তা স্তর (security level) 1 বা 2 হতে হবে (1 হলো সর্বোচ্চ)।
//      isLoggedIn && (isAdmin || securityLevel <= 2)
//
// 7. বন্ধনীর গুরুত্ব: && এর অগ্রাধিকার || এর চেয়ে বেশি।
//    বন্ধনী না দিলে isLoggedIn && isAdmin || securityLevel <= 2 মানে দাঁড়ায়
//    (isLoggedIn && isAdmin) || (securityLevel <= 2)
//    তখন লগইন না করা ইউজারও স্তর 2 বা কম হলে ঢুকে যেত, যা বড় নিরাপত্তা ভুল।
// ================================================================

public class LogicalOperatorsInConditions {
    public static void main(String[] args) {

        // তিনটা ভ্যারিয়েবল, AND ও OR এর উদাহরণে একই মান ব্যবহার হবে
        int a = 200;
        int b = 33;
        int c = 500;

        // ==================== AND (&&): দুটোই সত্য ====================
        // a > b  -> 200 > 33  -> true
        // c > a  -> 500 > 200 -> true
        // true && true = true, তাই ব্লক চলবে
        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        // ==================== AND (&&): একটা মিথ্যা (অতিরিক্ত) ====================
        // a > b  -> 200 > 33  -> true
        // a > c  -> 200 > 500 -> false
        // true && false = false, তাই else ব্লক চলবে
        if (a > b && a > c) {
            System.out.println("This will not be printed");
        } else {
            System.out.println("AND: not both conditions are true");
        }

        // ==================== OR (||): একটা সত্য ====================
        // a > b  -> 200 > 33  -> true
        // a > c  -> 200 > 500 -> false
        // true || false = true, তাই ব্লক চলবে
        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        }

        // ==================== OR (||): দুটোই মিথ্যা (অতিরিক্ত) ====================
        // a > c  -> 200 > 500 -> false
        // b > c  -> 33 > 500  -> false
        // false || false = false, তাই else ব্লক চলবে
        if (a > c || b > c) {
            System.out.println("This will not be printed");
        } else {
            System.out.println("OR: no condition is true");
        }

        // ==================== NOT (!): শর্ত উল্টে দেওয়া ====================
        // এই উদাহরণে আলাদা মান লাগে, তাই নতুন নামে ভ্যারিয়েবল নেওয়া হলো
        int num1 = 33;
        int num2 = 200;

        // num1 > num2 -> 33 > 200 -> false
        // ! এটা উল্টে true করে দেয়, তাই ব্লক চলবে
        if (!(num1 > num2)) {
            System.out.println("a is NOT greater than b");
        }

        // ==================== বাস্তব উদাহরণ: access control ====================
        // শর্ত: লগইন করা থাকতে হবে, এবং (অ্যাডমিন অথবা securityLevel <= 2)
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = সর্বোচ্চ

        // ধাপে ধাপে হিসাব:
        //   isAdmin || securityLevel <= 2  ->  false || (3 <= 2)  ->  false || false  ->  false
        //   isLoggedIn && false            ->  true && false      ->  false
        // তাই else ব্লক চলবে
        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // securityLevel বদলে দেখা যাক (অতিরিক্ত):
        //   securityLevel 1 = Access granted
        //   securityLevel 2 = Access granted
        //   securityLevel 3 = Access denied
        //   securityLevel 4 = Access denied
        // isAdmin = true হলে অ্যাক্সেস পাওয়া যায়।

        // অতিরিক্ত ১: securityLevel 1 হলে কী হয়
        int securityLevel2 = 1;
        if (isLoggedIn && (isAdmin || securityLevel2 <= 2)) {
            System.out.println("securityLevel 1: Access granted");
        } else {
            System.out.println("securityLevel 1: Access denied");
        }

        // অতিরিক্ত ২: isAdmin true হলে কী হয় (securityLevel 3 থাকা সত্ত্বেও)
        boolean isAdmin2 = true;
        if (isLoggedIn && (isAdmin2 || securityLevel <= 2)) {
            System.out.println("isAdmin = true: Access granted");
        } else {
            System.out.println("isAdmin = true: Access denied");
        }

        // ==================== Exercise ====================
        int age = 15;
        boolean withParent = true;

        // age >= 18 -> false, কিন্তু withParent -> true
        // false || true = true, তাই প্রথম ব্লক চলবে
        if (age >= 18 || withParent) {
            System.out.println("Enjoy the movie!");
        } else {
            System.out.println("Sorry, you are too young.");
        }
    }
}