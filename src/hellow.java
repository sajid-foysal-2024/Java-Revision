
/*
 * ==========================================
 * JAVA REVISION - 01
 * TOPIC: HELLO WORLD
 * ==========================================
 *
 * 1. CLASS:
 *    Java code সাধারণত class-এর মধ্যে লেখা হয়।
 *
 * 2. CLASS NAME:
 *    এই class-এর নাম Main।
 *    Public class-এর নাম ও Java filename একই হতে হবে।
 *    তাই filename: Main.java
 *
 * 3. CASE-SENSITIVE:
 *    Java-তে Main এবং main আলাদা নাম।
 *    Uppercase ও lowercase গুরুত্বপূর্ণ।
 *
 * 4. MAIN METHOD:
 *    public static void main(String[] args)
 *    এটি সাধারণ Java application-এর entry point।
 *
 * 5. SYSTEM.OUT.PRINTLN():
 *    Screen-এ text print করে এবং নতুন লাইনে যায়।
 *
 * 6. CURLY BRACES {}:
 *    Class ও method-এর code block নির্দেশ করে।
 *
 * 7. SEMICOLON (;):
 *    সাধারণ Java statement-এর শেষে semicolon লাগে।
 *
 * ==========================================
 */

public class hellow {

    // Java program-এর execution এখানে শুরু হয়
    public static void main(String[] args) {

        // Screen-এ Hello World print করবে
        System.out.println("Hello World");

        // print() নতুন লাইন তৈরি করে না
        System.out.print("Hello ");

        // একই লাইনে World print করবে
        System.out.print("World");

        // println() নতুন লাইনে চলে যায়
        System.out.println();

        // আলাদা দুটি লাইনে text print করবে
        System.out.println("Learning Java");
        System.out.println("Java Revision");
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Hello World
 * Hello World
 * Learning Java
 * Java Revision
 *
 * ==========================================
 * HOW TO COMPILE AND RUN:
 *
 * Compile: javac Main.java
 * Run:     java Main
 *
 * ==========================================

*/