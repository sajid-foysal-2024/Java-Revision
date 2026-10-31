// ফাইলের নাম: Identifiers.java
// টপিক: Java Identifiers (Invalid ও Valid নামের নিয়ম)
//
// ==================== ব্যাখ্যা (Description) ====================
// Identifier মানে ভ্যারিয়েবল, মেথড বা ক্লাসের নাম।
//
// নামের নিয়ম:
// 1. নামে অক্ষর, সংখ্যা, _ (আন্ডারস্কোর) ও $ থাকতে পারে।
// 2. নাম শুরু হতে হবে অক্ষর, _ অথবা $ দিয়ে। সংখ্যা দিয়ে শুরু করা যায় না।
// 3. নামের মধ্যে space বা বিশেষ চিহ্ন (-, @ ইত্যাদি) থাকতে পারবে না।
// 4. Reserved keyword (int, class, public ইত্যাদি) নাম হিসেবে দেওয়া যাবে না।
// 5. নাম case-sensitive: age আর Age দুটো আলাদা ভ্যারিয়েবল।
// ================================================================

public class Identifiers {
    public static void main(String[] args) {

        // ==================== Invalid (ভুল) নাম ====================
        // নিচের তিনটা লাইন চালু করলে প্রোগ্রাম compile-ই হবে না,
        // তাই এগুলো কমেন্ট করে রেখেছি।

        // int 2ndNumber = 5;  // ভুল: সংখ্যা দিয়ে শুরু করা যায় না
        // int my var = 10;    // ভুল: নামের ভেতরে space থাকতে পারে না
        // int int = 20;       // ভুল: int একটা reserved keyword

        // ==================== Valid (ঠিক) নাম ====================

        // ভুল 2ndNumber এর বদলে: অক্ষর দিয়ে শুরু
        int secondNumber = 5;
        System.out.println("secondNumber = " + secondNumber);

        // ভুল "my var" এর বদলে: space বাদ, পরের শব্দের প্রথম অক্ষর বড় হাতের (camelCase)
        int myVar = 10;
        System.out.println("myVar = " + myVar);

        // ভুল "int" এর বদলে: keyword এর সাথে আরেকটা শব্দ জুড়ে দেওয়া হলো
        int intValue = 20;
        System.out.println("intValue = " + intValue);

        // আন্ডারস্কোর (_) দিয়ে শুরু বা শব্দ আলাদা করা যায়
        int _count = 1;
        int my_var = 2;
        System.out.println("_count = " + _count);
        System.out.println("my_var = " + my_var);

        // $ দিয়ে শুরু করা যায়
        int $price = 100;
        System.out.println("$price = " + $price);

        // নামের মাঝখানে বা শেষে সংখ্যা থাকতে পারে
        int number2 = 7;
        System.out.println("number2 = " + number2);

        // ==================== Case-sensitive ====================
        // age আর Age দুটো সম্পূর্ণ আলাদা ভ্যারিয়েবল
        int age = 20;
        int Age = 30;
        System.out.println("age = " + age);
        System.out.println("Age = " + Age);
    }
}