// ফাইলের নাম: Booleans.java
// টপিক: Java Booleans
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. প্রোগ্রামিং এ প্রায়ই এমন ডেটা টাইপ লাগে যার মাত্র দুটো মান থাকে:
//      YES / NO,  ON / OFF,  TRUE / FALSE
//    এর জন্য Java তে boolean ডেটা টাইপ আছে, যা true বা false রাখতে পারে।
//
// 2. boolean নামটা এসেছে জর্জ বুল (George Boole) নামের গণিতবিদের নাম থেকে।
//    তিনিই আজকের কম্পিউটারে ব্যবহৃত লজিক সিস্টেম প্রথম সংজ্ঞায়িত করেছিলেন।
//
// 3. boolean কিওয়ার্ড দিয়ে ভ্যারিয়েবল declare করা হয়,
//    এবং এতে শুধু true বা false রাখা যায়।
//
// 4. বাস্তবে boolean মান বেশিরভাগ সময় কোনো expression এর ফলাফল হিসেবে আসে
//    এবং প্রোগ্রামে শর্ত পরীক্ষায় ব্যবহার হয়।
//
// 5. Boolean Expression হলো এমন রাশি, যার ফলাফল true বা false।
//    এটা দিয়ে প্রোগ্রামে যুক্তি বানানো ও সিদ্ধান্ত নেওয়া যায়।
//    সাধারণত comparison operator (>, ==, ইত্যাদি) দিয়ে বানানো হয়।
//
// 6. তুলনার ফলাফল boolean ভ্যারিয়েবলে জমানো যায়।
//    জমাবে নাকি সরাসরি ব্যবহার করবে, সেটা নিজের ইচ্ছা।
//    জমালে কোড পড়তে সহজ হয়, বিশেষ করে একই ফলাফল বারবার ব্যবহার করলে।
// ================================================================

public class Booleans {
    public static void main(String[] args) {

        // ==================== Boolean মান ====================
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);   // আউটপুট: true
        System.out.println(isFishTasty); // আউটপুট: false

        // ==================== Boolean Expression: > দিয়ে ====================
        int x = 10;
        int y = 9;

        System.out.println(x > y); // 10, 9 এর চেয়ে বড়, তাই true

        // আরও সহজে: ভ্যারিয়েবল ছাড়াই সরাসরি
        System.out.println(10 > 9); // true

        // ==================== Boolean Expression: == দিয়ে ====================
        int a = 10;

        System.out.println(a == 10);  // a এর মান 10, তাই true
        System.out.println(10 == 15); // 10 আর 15 সমান নয়, তাই false

        // ==================== ফলাফল boolean ভ্যারিয়েবলে জমানো ====================
        int p = 10;
        int q = 9;

        boolean isGreater = p > q; // তুলনার ফলাফল (true) ভ্যারিয়েবলে জমা হলো
        System.out.println(isGreater); // আউটপুট: true
    }
}