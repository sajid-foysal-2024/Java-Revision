// ফাইলের নাম: NonPrimitiveTypes.java
// টপিক: Java Non-Primitive Data Types
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. Non-primitive ডেটা টাইপকে reference type বলা হয়,
//    কারণ এরা object কে refer করে (নির্দেশ করে)।
//
// 2. Primitive আর Non-primitive এর প্রধান পার্থক্য:
//    (ক) Primitive টাইপ Java তে আগে থেকেই তৈরি (built-in) থাকে।
//        Non-primitive টাইপ সাধারণত প্রোগ্রামার নিজে বানায়
//        (শুধু String ছাড়া, ওটা আগে থেকেই আছে)।
//    (খ) Non-primitive টাইপ দিয়ে মেথড কল করে কাজ করানো যায়,
//        কিন্তু Primitive টাইপ দিয়ে যায় না।
//    (গ) Primitive টাইপের নাম ছোট হাতের অক্ষরে শুরু হয় (যেমন int)।
//        Non-primitive টাইপের নাম সাধারণত বড় হাতের অক্ষরে শুরু হয় (যেমন String)।
//    (ঘ) Primitive টাইপে সবসময় একটা মান থাকে।
//        Non-primitive টাইপ null হতে পারে (null মানে "কিছু নেই")।
//
// 3. Non-primitive টাইপের উদাহরণ: String, Array, Class ইত্যাদি।
//    (Array ও Class নিয়ে পরের চ্যাপ্টারে বিস্তারিত শিখবে)
// ================================================================

public class NonPrimitiveTypes {
    public static void main(String[] args) {

        // ---------- পার্থক্য ১: নামের শুরু ----------
        int myNum = 5;                 // primitive: ছোট হাতের i দিয়ে শুরু
        String myText = "Hello World"; // non-primitive: বড় হাতের S দিয়ে শুরু

        System.out.println("primitive (int): " + myNum);
        System.out.println("non-primitive (String): " + myText);

        // ---------- পার্থক্য ২: মেথড কল করা ----------
        // Non-primitive (String) দিয়ে মেথড কল করা যায়
        System.out.println(myText.length());      // লেখাটায় কয়টা অক্ষর আছে। আউটপুট: 11
        System.out.println(myText.toUpperCase()); // সব অক্ষর বড় হাতের করে। আউটপুট: HELLO WORLD

        // Primitive (int) দিয়ে মেথড কল করা যায় না।
        // নিচের লাইনটা চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।
        // myNum.length(); // Error: int cannot be dereferenced

        // ---------- পার্থক্য ৩: null ----------
        // Non-primitive টাইপ null হতে পারে (কোনো object কে refer করছে না)
        String emptyText = null;
        System.out.println(emptyText); // আউটপুট: null

        // Primitive টাইপ null হতে পারে না।
        // নিচের লাইনটা চালু করলে compile error আসবে, তাই কমেন্ট করে রেখেছি।
        // int emptyNum = null; // Error: int এ null রাখা যায় না
    }
}