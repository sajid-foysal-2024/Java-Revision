// ফাইলের নাম: ElseIfStatement.java
// টপিক: Java else if Statement
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. else if স্টেটমেন্ট দিয়ে প্রথম শর্ত false হলে একটা নতুন শর্ত পরীক্ষা করা যায়।
//    তিন বা তার বেশি সম্ভাবনা থাকলে এটা লাগে।
//
// 2. নিয়ম (syntax):
//      if (condition1) {
//        // condition1 true হলে এই কোড চলবে
//      } else if (condition2) {
//        // condition1 false এবং condition2 true হলে এই কোড চলবে
//      } else {
//        // দুটো শর্তই false হলে এই কোড চলবে
//      }
//
// 3. বাস্তব উপমা: বৃষ্টি হলে ছাতা নাও। নইলে যদি রোদ থাকে সানগ্লাস পরো।
//    নইলে স্বাভাবিকভাবে বের হও।
//
// 4. কীভাবে কাজ করে:
//      - Java শর্তগুলো ওপর থেকে নিচে, একটা একটা করে পরীক্ষা করে।
//      - যে শর্তটা প্রথম সত্য (true) হয়, শুধু সেই ব্লকটা চলে।
//        এরপর বাকি শর্ত আর পরীক্ষাই করা হয় না।
//      - কোনো শর্তই সত্য না হলে শেষের else ব্লক চলে।
//      - else if যতগুলো খুশি লেখা যায়, শেষের else ঐচ্ছিক।
// ================================================================

public class ElseIfStatement {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: আবহাওয়া ====================
        int weather = 2; // 1 = বৃষ্টি, 2 = রোদ, 3 = মেঘলা

        if (weather == 1) {
            // weather == 1 মিথ্যা, তাই এই ব্লক বাদ যাবে
            System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
            // weather == 2 সত্য, তাই এই ব্লক চলবে
            System.out.println("Wear sunglasses.");
        } else {
            // আগের একটা শর্ত সত্য হওয়ায় এই ব্লক বাদ যাবে
            System.out.println("Just go outside normally.");
        }
        // আউটপুট: Wear sunglasses.

        // ==================== উদাহরণ ২: দিনের সময় (time = 16) ====================
        int time = 16;

        if (time < 12) {
            // 16 < 12 মিথ্যা, তাই বাদ
            System.out.println("Good morning.");
        } else if (time < 18) {
            // 16 < 18 সত্য, তাই এই ব্লক চলবে
            System.out.println("Good day.");
        } else {
            // আগের শর্ত সত্য হওয়ায় বাদ
            System.out.println("Good evening.");
        }
        // আউটপুট: Good day.

        // ==================== উদাহরণ ৩: দিনের সময় (time = 22) ====================
        // time এর মান বদলে দেখা যাক: এবার কোনো শর্তই সত্য হবে না
        int time2 = 22;

        if (time2 < 12) {
            // 22 < 12 মিথ্যা, তাই বাদ
            System.out.println("Good morning.");
        } else if (time2 < 18) {
            // 22 < 18 মিথ্যা, তাই বাদ
            System.out.println("Good day.");
        } else {
            // কোনো শর্তই সত্য নয়, তাই শেষের else ব্লক চলবে
            System.out.println("Good evening.");
        }
        // আউটপুট: Good evening.
    }
}