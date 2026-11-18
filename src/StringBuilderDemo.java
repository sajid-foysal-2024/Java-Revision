// ফাইলের নাম: StringBuilderDemo.java
// টপিক: Java StringBuilder
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. String Concatenation চ্যাপ্টারে শিখেছ + দিয়ে String জোড়া যায়।
//    কিন্তু String একবার তৈরি হলে আর বদলানো যায় না (immutable)।
//    লেখা জুড়লে Java আগের String বদলায় না,
//    প্রতিবার একটা নতুন String বানায়।
//
// 2. StringBuilder হলো এমন String, যা বদলানো যায়।
//    এতে লেখা যোগ, ঢোকানো, বদলানো, মুছে ফেলা আর উল্টে দেওয়া যায়
//    (insert, replace, delete, reverse পরের অংশে আসবে)।
//    Java একই লেখাটাকেই বদলাতে থাকে।
//    উপমা: প্রতিবার নতুন কপি না লিখে একটা ডকুমেন্টই বারবার এডিট করা।
//
// 3. উদাহরণ ব্যাখ্যা:
//      new StringBuilder("Hello")  -> "Hello" লেখাসহ একটা StringBuilder বানায়
//      sb.append(" World")         -> লেখার শেষে " World" যোগ করে
//      System.out.println(sb)      -> লেখাটা প্রিন্ট করে
//
// 4. নোট: new কিওয়ার্ড দিয়ে StringBuilder তৈরি হয়।
//    new নিয়ে বিস্তারিত পরে Classes and Objects চ্যাপ্টারে শিখবে।
//
// 5. append() মেথড:
//      - লেখার শেষে লেখা যোগ করে, যতবার খুশি কল করা যায়
//      - সংখ্যাও যোগ করা যায়
//      - খালি বন্ধনী new StringBuilder() দিলে খালি StringBuilder তৈরি হয়
//
// 6. টিপ (chaining): একই লাইনে পরপর কয়েকটা append() লেখা যায়:
//      sb.append("Liam").append(" has ").append(3);
//    এটা কাজ করে কারণ প্রতিটা append() একই StringBuilder ফেরত দেয়।
//
// 7. নোট: ক্লাসের নাম StringBuilderDemo দিয়েছি, StringBuilder নয়,
//    কারণ StringBuilder নামে Java তে আগে থেকেই একটা ক্লাস আছে।
// ================================================================

public class StringBuilderDemo {
    public static void main(String[] args) {

        // ==================== আগে: String বদলায় না ====================
        String s = "Hello";
        s.concat(" World"); // নতুন String তৈরি হয়, কিন্তু s এ জমা রাখা হয়নি
        System.out.println(s); // আউটপুট: Hello (s আগের মতোই আছে)

        // ==================== উদাহরণ ১: StringBuilder ও append() ====================
        StringBuilder sb = new StringBuilder("Hello"); // "Hello" সহ তৈরি
        sb.append(" World"); // একই StringBuilder এর শেষে " World" যোগ হলো
        System.out.println(sb); // আউটপুট: Hello World

        // ==================== উদাহরণ ২: খালি StringBuilder ও একাধিক append() ====================
        StringBuilder sb2 = new StringBuilder(); // খালি StringBuilder
        sb2.append("Liam");    // Liam
        sb2.append(" has ");   // Liam has
        sb2.append(3);         // Liam has 3 (সংখ্যাও যোগ করা যায়)
        sb2.append(" apples"); // Liam has 3 apples
        System.out.println(sb2); // আউটপুট: Liam has 3 apples

        // ==================== উদাহরণ ৩: পরপর append() (chaining) ====================
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Liam").append(" has ").append(3).append(" apples");
        System.out.println(sb3); // আউটপুট: Liam has 3 apples
    }
}