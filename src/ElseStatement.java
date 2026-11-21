// ফাইলের নাম: ElseStatement.java
// টপিক: Java else Statement
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. else স্টেটমেন্ট দিয়ে if এর শর্ত false হলে একটা কোড ব্লক চালানো যায়।
//    else মানে "নইলে"।
//
// 2. নিয়ম (syntax):
//      if (condition) {
//        // condition true হলে এই কোড চলবে
//      } else {
//        // condition false হলে এই কোড চলবে
//      }
//
// 3. বাস্তব উপমা: বৃষ্টি হলে ছাতা নাও, নইলে (else) ছাতা ছাড়াই বের হও।
//
// 4. যে কোনো সময় if আর else এর মধ্যে ঠিক একটা ব্লকই চলে:
//    শর্ত true হলে if ব্লক, শর্ত false হলে else ব্লক।
//
// 5. গুরুত্বপূর্ণ নোট:
//      - else এর কোনো শর্ত নেই। if এর শর্ত false হলেই এটা চলে।
//      - if (condition) এর পরপরই সেমিকোলন (;) দেবে না।
//        তাহলে if স্টেটমেন্ট সেখানেই শেষ হয়ে যায় (ফাঁকা স্টেটমেন্ট),
//        { } ব্লকটা if এর অংশ থাকে না, ফলে else অস্বাভাবিক আচরণ করে
//        বা compile error আসে।
// ================================================================

public class ElseStatement {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: বৃষ্টি ও ছাতা ====================
        boolean isRaining = false; // বৃষ্টি হচ্ছে না

        if (isRaining) {
            // isRaining false, তাই এই ব্লক বাদ যাবে
            System.out.println("Bring an umbrella!");
        } else {
            // if এর শর্ত false, তাই else ব্লক চলবে
            System.out.println("No rain today, no need for an umbrella!");
        }

        // ==================== উদাহরণ ২: সময় অনুযায়ী শুভেচ্ছা ====================
        int time = 20;

        if (time < 18) {
            // 20 < 18 মিথ্যা (false), তাই এই ব্লক বাদ যাবে
            System.out.println("Good day.");
        } else {
            // else ব্লক চলবে
            System.out.println("Good evening.");
        }
        // আউটপুট: Good evening.

        // ==================== অতিরিক্ত: time কম হলে কী হয় (বোঝার জন্য) ====================
        int time2 = 10;

        if (time2 < 18) {
            // 10 < 18 সত্য (true), তাই এই ব্লক চলবে
            System.out.println("Good day.");
        } else {
            // if এর শর্ত true হওয়ায় এই ব্লক বাদ যাবে
            System.out.println("Good evening.");
        }
        // আউটপুট: Good day.

        // ==================== ভুলের নমুনা (কমেন্ট করা) ====================
        // নিচের মতো if (condition) এর পরে সেমিকোলন দিলে compile error আসে,
        // কারণ if স্টেটমেন্ট সেখানেই শেষ হয়ে যায় এবং else টা একা পড়ে যায়।
        //
        // if (time < 18); {
        //     System.out.println("Good day.");
        // } else {
        //     System.out.println("Good evening.");
        // }
    }
}