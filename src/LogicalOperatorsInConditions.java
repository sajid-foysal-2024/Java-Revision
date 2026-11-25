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
//    উদাহরণ: !(a > c)
//    শর্ত বন্ধনীর ভেতরে রাখবে, নইলে ! শুধু প্রথম অংশে কাজ করে।
// ================================================================

public class LogicalOperatorsInConditions {
    public static void main(String[] args) {

        // তিনটা ভ্যারিয়েবল, সবগুলো উদাহরণে একই মান ব্যবহার হবে
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

        // ==================== NOT (!): শর্ত উল্টে দেওয়া (অতিরিক্ত) ====================
        // a > c -> false, ! এটা উল্টে true করে দেয়, তাই ব্লক চলবে
        if (!(a > c)) {
            System.out.println("a is NOT greater than c");
        }
    }
}