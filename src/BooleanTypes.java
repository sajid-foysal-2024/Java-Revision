// ফাইলের নাম: BooleanTypes.java
// টপিক: Java Boolean Data Types
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. প্রোগ্রামিং-এ প্রায়ই এমন ডেটা টাইপ লাগে যার মাত্র দুটো মান থাকে, যেমন:
//      YES / NO,  ON / OFF,  TRUE / FALSE
//
// 2. এর জন্য Java তে boolean ডেটা টাইপ আছে।
//    boolean শুধু true অথবা false মান রাখতে পারে।
//
// 3. true ও false সবসময় ছোট হাতের অক্ষরে এবং কোটেশন ছাড়া লিখতে হয়।
//    "true" লিখলে সেটা String হয়ে যায়, boolean থাকে না।
//
// 4. Boolean মান সাধারণত conditional testing (শর্ত পরীক্ষা) এ ব্যবহার হয়।
//    (এটা পরের চ্যাপ্টারে বিস্তারিত শিখবে, এখানে শুধু ছোট একটা নমুনা দেওয়া হলো)
// ================================================================

public class BooleanTypes {
    public static void main(String[] args) {

        // ---------- boolean ভ্যারিয়েবল তৈরি ----------
        boolean isJavaFun = true;     // Java মজার? হ্যাঁ -> true
        boolean isFishTasty = false;  // মাছ সুস্বাদু? না -> false

        // ---------- প্রিন্ট করা ----------
        System.out.println(isJavaFun);    // আউটপুট: true
        System.out.println(isFishTasty);  // আউটপুট: false

        // ---------- নমুনা: boolean দিয়ে শর্ত পরীক্ষা ----------
        // if এর ভেতরের মান true হলে তবেই { } এর কাজ হয়
        // (if নিয়ে বিস্তারিত পরের চ্যাপ্টারে আসবে)
        if (isJavaFun) {
            System.out.println("Java is fun!");
        }
    }
}