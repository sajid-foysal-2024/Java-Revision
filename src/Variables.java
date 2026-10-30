// ফাইলের নাম: Variables.java
// টপিক: Java Variables

public class Variables {
    public static void main(String[] args) {

        // 1. String ভ্যারিয়েবল (লেখা রাখে)
        String name = "John";
        System.out.println("name = " + name);

        // 2. int ভ্যারিয়েবল (পূর্ণ সংখ্যা রাখে)
        int myNum = 15;
        System.out.println("myNum = " + myNum);

        // 3. আগে declare, পরে মান assign
        int laterNum;
        laterNum = 15;
        System.out.println("laterNum = " + laterNum);

        // 4. মান বদলানো (আগের মান overwrite হয়ে যায়)
        int changeNum = 15;
        changeNum = 20; // এখন changeNum এর মান 20
        System.out.println("changeNum = " + changeNum);

        // 5. final ভ্যারিয়েবল (মান বদলানো যাবে না)
        final int fixedNum = 15;
        System.out.println("fixedNum = " + fixedNum);
        // fixedNum = 20; // এটা চালু করলে error আসবে: cannot assign a value to a final variable

        // 6. অন্যান্য টাইপ
        int number = 5;
        float myFloatNum = 5.99f; // float এর শেষে f লাগে
        char myLetter = 'D';      // char এ সিঙ্গেল কোটেশন
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("number = " + number);
        System.out.println("myFloatNum = " + myFloatNum);
        System.out.println("myLetter = " + myLetter);
        System.out.println("myBool = " + myBool);
        System.out.println("myText = " + myText);
    }
}