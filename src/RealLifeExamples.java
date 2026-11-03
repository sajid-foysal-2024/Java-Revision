// ফাইলের নাম: RealLifeExamples.java
// টপিক: Java Real-Life Examples
//
// ==================== ব্যাখ্যা (Description) ====================
// 1. আগের উদাহরণগুলোতে ভ্যারিয়েবলের নাম টাইপ অনুযায়ী দেওয়া হয়েছিল
//    (myNum, myChar ইত্যাদি), যাতে বুঝতে ভুল না হয়।
//    বাস্তব প্রোগ্রামে এমন নাম দিতে হয় যা দেখেই বোঝা যায় ভ্যারিয়েবলটা কী রাখছে।
//
// 2. উদাহরণ ১ - কলেজ ছাত্রের তথ্য:
//    বিভিন্ন টাইপের ভ্যারিয়েবলে একজন ছাত্রের বিভিন্ন তথ্য রাখা হয়েছে।
//      String -> নাম (লেখা)
//      int    -> আইডি ও বয়স (পূর্ণ সংখ্যা)
//      float  -> ফি (দশমিক সংখ্যা, শেষে f লাগে)
//      char   -> গ্রেড (একটা অক্ষর)
//
// 3. উদাহরণ ২ - আয়তক্ষেত্রের ক্ষেত্রফল:
//    সূত্র: ক্ষেত্রফল = দৈর্ঘ্য x প্রস্থ
//    গুণ করার জন্য * চিহ্ন ব্যবহার করা হয়।
// ================================================================

public class RealLifeExamples {
    public static void main(String[] args) {

        // ==================== উদাহরণ ১: ছাত্রের তথ্য ====================

        // ছাত্রের তথ্য (Student data)
        String studentName = "John Doe"; // নাম: লেখা, তাই String
        int studentID = 15;              // আইডি: পূর্ণ সংখ্যা, তাই int
        int studentAge = 23;             // বয়স: পূর্ণ সংখ্যা, তাই int
        float studentFee = 75.25f;       // ফি: দশমিক সংখ্যা, তাই float (f লাগে)
        char studentGrade = 'B';         // গ্রেড: একটা অক্ষর, তাই char (সিঙ্গেল কোটেশন)

        // ভ্যারিয়েবলগুলো প্রিন্ট করা (লেখা + ভ্যারিয়েবল জোড়া লাগিয়ে)
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // ==================== উদাহরণ ২: আয়তক্ষেত্রের ক্ষেত্রফল ====================

        // int ভ্যারিয়েবল তৈরি
        int length = 4; // দৈর্ঘ্য
        int width = 6;  // প্রস্থ
        int area;       // ক্ষেত্রফল: এখন শুধু declare করা হলো, মান পরে দেওয়া হবে

        // আয়তক্ষেত্রের ক্ষেত্রফল হিসাব করা (দৈর্ঘ্য x প্রস্থ)
        area = length * width; // 4 * 6 = 24

        // ভ্যারিয়েবলগুলো প্রিন্ট করা
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}