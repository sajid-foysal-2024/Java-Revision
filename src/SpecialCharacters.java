// ফাইলের নাম: SpecialCharacters.java
// টপিক: Java Strings - Special Characters
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. String ডাবল কোটেশন " " এর ভেতরে লিখতে হয়।
//    লেখার ভেতরেই ডাবল কোটেশন থাকলে Java গুলিয়ে ফেলে এবং error দেয়:
//      String txt = "We are the so-called "Vikings" from the north.";  // Error!
//
// 2. সমাধান: backslash (\) escape character ব্যবহার করা।
//    backslash বিশেষ অক্ষরকে সাধারণ String অক্ষরে পরিণত করে।
//
//      \"   ->  "   (ডাবল কোটেশন)
//      \'   ->  '   (সিঙ্গেল কোটেশন)
//      \\   ->  \   (backslash নিজে)
//
// 3. অন্যান্য প্রচলিত escape sequence:
//      \n   ->  নতুন লাইন (New Line)
//      \t   ->  ট্যাব (Tab)
//      \b   ->  Backspace
//      \r   ->  Carriage Return
//      \f   ->  Form Feed
//
// 4. নোট: এগুলোর বেশিরভাগ আধুনিক প্রোগ্রামিং এ কম ব্যবহৃত হয়।
//    সবচেয়ে বেশি লাগে: \n (নতুন লাইন), \" (ডাবল কোটেশন), \\ (backslash)।
//
// 5. অতিরিক্ত তথ্য: String এর ভেতরে সিঙ্গেল কোটেশন ' এমনিতেই লেখা যায়,
//    তাই "It's alright." এভাবেও চলে। \' লাগে মূলত char এর ক্ষেত্রে,
//    যেমন: char c = '\'';
// ================================================================

public class SpecialCharacters {
    public static void main(String[] args) {

        // ==================== সমস্যা ====================
        // নিচের লাইনটা চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।
        // কারণ: লেখার ভেতরের " দেখে Java ভাবে String এখানেই শেষ।
        // String wrong = "We are the so-called "Vikings" from the north.";

        // ==================== সমাধান ১: \" দিয়ে ডাবল কোটেশন ====================
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt1);
        // আউটপুট: We are the so-called "Vikings" from the north.

        // ==================== সমাধান ২: \' দিয়ে সিঙ্গেল কোটেশন ====================
        String txt2 = "It\'s alright.";
        System.out.println(txt2); // আউটপুট: It's alright.

        // ==================== সমাধান ৩: \\ দিয়ে backslash ====================
        // একটা backslash দেখাতে দুটো (\\) লিখতে হয়,
        // কারণ একটা backslash Java কে বলে "পরের অক্ষর বিশেষ"
        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3); // আউটপুট: The character \ is called backslash.

        // ==================== অন্যান্য escape sequence ====================

        // \n : নতুন লাইন। \n এর পর থেকে লেখা নতুন লাইনে যায়
        System.out.println("Hello\nWorld");
        // আউটপুট:
        // Hello
        // World

        // \t : ট্যাব (অনেকটা ফাঁকা জায়গা)
        System.out.println("Name:\tJohn");
        // আউটপুট: Name:    John  (ফাঁকের পরিমাণ টার্মিনাল অনুযায়ী বদলায়)

        // একাধিক escape একসাথে: \" আর \n মিলিয়ে
        System.out.println("Ali said: \"Hi!\"\nHow are you?");
        // আউটপুট:
        // Ali said: "Hi!"
        // How are you?

        // \b (Backspace), \r (Carriage Return), \f (Form Feed):
        // এগুলোর ফলাফল টার্মিনাল ভেদে আলাদা দেখায় এবং এগুলো কম ব্যবহৃত হয়,
        // তাই এখানে চালিয়ে দেখানো হলো না।
    }
}