// ফাইলের নাম: Constants.java
// টপিক: Java Constants (final)
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. কোনো ভ্যারিয়েবলের মান পরে বদলাতে না চাইলে final কিওয়ার্ড ব্যবহার করা হয়।
// 2. final দিলে ভ্যারিয়েবলটা constant (ধ্রুবক) হয়ে যায়:
//    অর্থাৎ অপরিবর্তনীয় ও read-only। মান বদলাতে গেলে error আসে।
// 3. যে মান কখনো বদলানোর কথা না, তার জন্য final ব্যবহার করবে।
//    যেমন: এক ঘণ্টায় কত মিনিট, অথবা কারো জন্মসাল।
// 4. Convention (প্রচলিত নিয়ম): final ভ্যারিয়েবলের নাম সাধারণত
//    সব বড় হাতের অক্ষরে লেখা হয়, শব্দের মাঝে _ থাকে (যেমন BIRTHYEAR,
//    MINUTES_PER_HOUR)। এটা বাধ্যতামূলক নয়, কিন্তু কোড পড়তে সুবিধা হয়।
// ================================================================

public class Constants {
    public static void main(String[] args) {

        // ---------- উদাহরণ ১: final ভ্যারিয়েবলের মান বদলানো যায় না ----------
        final int myNum = 15;
        System.out.println("myNum = " + myNum);

        // নিচের লাইনটা চালু করলে প্রোগ্রাম compile-ই হবে না, তাই কমেন্ট করে রেখেছি।
        // Error: cannot assign a value to final variable 'myNum'
        // myNum = 20;

        // ---------- উদাহরণ ২: কখন final ব্যবহার করবে ----------
        // এই মানগুলো কখনো বদলানোর কথা না, তাই final দেওয়া হলো
        final int MINUTES_PER_HOUR = 60; // এক ঘণ্টায় সবসময় ৬০ মিনিট
        final int BIRTHYEAR = 1980;      // জন্মসাল কখনো বদলায় না

        System.out.println("MINUTES_PER_HOUR = " + MINUTES_PER_HOUR);
        System.out.println("BIRTHYEAR = " + BIRTHYEAR);

        // ---------- উদাহরণ ৩: constant দিয়ে হিসাব করা ----------
        // constant এর মান পড়া ও হিসাবে ব্যবহার করা যায়, শুধু বদলানো যায় না
        int hours = 3;
        int totalMinutes = hours * MINUTES_PER_HOUR;
        System.out.println(hours + " ঘণ্টায় মোট মিনিট = " + totalMinutes);
    }
}