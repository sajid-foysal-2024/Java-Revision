// ফাইলের নাম: VarKeyword.java
// টপিক: Java var Keyword
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. var কিওয়ার্ড Java 10 (২০১৮ সালে) এ চালু হয়েছে।
//
// 2. var লিখলে compiler নিজেই মান দেখে ভ্যারিয়েবলের টাইপ বুঝে নেয়।
//    এতে কোড পরিষ্কার হয় এবং বারবার টাইপ লিখতে হয় না,
//    বিশেষ করে টাইপের নাম লম্বা বা জটিল হলে।
//    উদাহরণ: int x = 5;  এর বদলে  var x = 5;  লেখা যায়।
//
// 3. গুরুত্বপূর্ণ নিয়ম:
//    (ক) var শুধু তখনই কাজ করে যখন declare করার সময়ই মান দেওয়া হয়।
//        var x;  লিখে পরে মান দেওয়া যায় না (Error)।
//        var x = 5;  ঠিক আছে (OK)।
//    (খ) টাইপ একবার ঠিক হয়ে গেলে সেটা আর বদলায় না।
//        var x = 5;  এ x হলো int।
//        x = 10;   -> OK, কারণ এখনো int
//        x = 9.99; -> Error, কারণ int এ double রাখা যায় না
// ================================================================

public class VarKeyword {
    public static void main(String[] args) {

        // ---------- উদাহরণ ১: var দিয়ে ভ্যারিয়েবল ----------
        // compiler বুঝে নেয় 5 একটা int, তাই x এর টাইপ int
        var x = 5;
        System.out.println(x); // আউটপুট: 5

        // ---------- উদাহরণ ২: বিভিন্ন টাইপের জন্য var ----------
        // মান দেখে compiler টাইপ ঠিক করে
        var myNum = 5;           // int
        var myDouble = 9.98;     // double
        var myChar = 'D';        // char
        var myBoolean = true;    // boolean
        var myString = "Hello";  // String

        System.out.println(myNum);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);

        // ---------- নিয়ম ১: declare এর সময়ই মান দিতে হবে ----------
        // নিচের লাইনটা চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।
        // var y;      // Error: মান ছাড়া var declare করা যায় না
        var y = 5;     // OK: মান সহ declare
        System.out.println(y); // আউটপুট: 5

        // ---------- নিয়ম ২: টাইপ একবার ঠিক হলে আর বদলায় না ----------
        var z = 5;     // z এখন int
        z = 10;        // OK: এখনো int
        System.out.println(z); // আউটপুট: 10

        // নিচের লাইনটা চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।
        // z = 9.99;   // Error: int ভ্যারিয়েবলে double রাখা যায় না
    }
}