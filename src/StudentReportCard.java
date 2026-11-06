// ফাইলের নাম: StudentReportCard.java
// টপিক: Challenge - Create a Student Report Card
//
// ==================== ব্যাখ্যা (Description) ====================
// চ্যালেঞ্জ: Java Data Types এর জ্ঞান যাচাই করা।
//
// main() এর ভেতরে এই ধাপগুলো করতে হবে:
// 1. studentID নামে একটা int declare করে মান দেওয়া (পূর্ণ সংখ্যা)
// 2. score নামে একটা double declare করে মান দেওয়া (দশমিক সংখ্যা)
// 3. grade নামে একটা char declare করে একটা অক্ষর দেওয়া
//    (অক্ষরটা সিঙ্গেল কোটেশন ' ' এর ভেতরে থাকবে)
// 4. তিনটা মানই প্রিন্ট করা
//
// মনে রাখবে: প্রতিটা স্টেটমেন্টের শেষে সেমিকোলন (;) দিতে হয়।
// ================================================================

public class StudentReportCard {
    public static void main(String[] args) {

        // ধাপ ১: int টাইপের studentID (আইডি পূর্ণ সংখ্যা)
        int studentID = 101;

        // ধাপ ২: double টাইপের score (দশমিক সংখ্যা)
        double score = 92.5;

        // ধাপ ৩: char টাইপের grade (একটা অক্ষর, সিঙ্গেল কোটেশনে)
        char grade = 'A';

        // ধাপ ৪: তিনটা মান প্রিন্ট করা
        System.out.println("Student ID: " + studentID);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}