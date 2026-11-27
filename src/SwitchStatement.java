// ফাইলের নাম: SwitchStatement.java
// টপিক: Java Switch Statements
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. অনেকগুলো if...else লেখার বদলে switch স্টেটমেন্ট ব্যবহার করা যায়।
//    উপমা: রেস্তোরাঁয় 1 নম্বর বাছলে পিৎজা, 2 নম্বরে বার্গার,
//    3 নম্বরে পাস্তা, অন্য কিছু বাছলে কিছুই নয়।
//
// 2. switch অনেকগুলো কোড ব্লকের মধ্যে একটা বেছে চালায়।
//
// 3. নিয়ম (syntax):
//      switch(expression) {
//        case x:
//          // code block
//          break;
//        case y:
//          // code block
//          break;
//        default:
//          // code block
//      }
//
// 4. কীভাবে কাজ করে:
//      - switch এর expression একবার হিসাব হয়।
//      - ফলাফলটা প্রতিটা case এর মানের সাথে মিলিয়ে দেখা হয়।
//      - মিল পেলে সেই case এর কোড ব্লক চলে।
//      - break মিল পাওয়া ব্লক চলার পর switch থামিয়ে দেয়।
//      - কোনো case এর সাথে মিল না পেলে default ব্লক চলে।
//
// 5. break কীওয়ার্ড:
//      - Java break এ পৌঁছালে switch ব্লক থেকে বেরিয়ে যায়।
//      - এতে বাকি কোড চলা ও বাকি case পরীক্ষা বন্ধ হয়ে যায়।
//      - মিল পাওয়া গেছে আর কাজ শেষ, তাই আর পরীক্ষার দরকার নেই।
//      - break অনেক সময় বাঁচায়, কারণ switch ব্লকের বাকি কোড এড়িয়ে যায়।
// ================================================================

public class SwitchStatement {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: বারের নম্বর থেকে বারের নাম ====================
        int day = 4;

        // day এর মান (4) প্রতিটা case এর সাথে মিলিয়ে দেখা হবে
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // মিল পেলে এখানেই switch থেকে বেরিয়ে যাবে
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday"); // day = 4, তাই এই case মিলবে
                break; // কাজ শেষ, switch থেকে বেরিয়ে যাওয়া
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // আউটপুট: Thursday

        // ==================== উদাহরণ ২: default ব্লক (অতিরিক্ত) ====================
        // কোনো case এর সাথে মিল না পেলে default ব্লক চলে
        int day2 = 9;

        switch (day2) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                // day2 = 9, কোনো case এর সাথে মিলল না, তাই default চলবে
                System.out.println("Invalid day number");
        }
        // আউটপুট: Invalid day number
    }
}