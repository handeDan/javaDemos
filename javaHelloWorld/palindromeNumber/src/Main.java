public class Main {
    public static void main(String[] args) {
        // Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
        // Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

        //ALTERNATIVE-1:
        int num = 363;

        // Sayıyı stringe çevirerek tersini alıp karşılaştırma yöntemi
        String strNumber = Integer.toString(num);
        String reversedNumber = new StringBuilder(strNumber).reverse().toString();

        boolean isPalindrome = strNumber.equals(reversedNumber);

        System.out.println("Is " + num + " a palindrome number? : " + isPalindrome);

        //*******************************

        //ALTERNATIVE-2:
//        static boolean isPalindrome(int number){
//            int temp = number, reversedNumber = 0, lastNumber;
//            while(temp != 0){
//                lastNumber = temp%10;
//                reversedNumber =(reversedNumber*10) + lastNumber;
//                temp /= 10;
//            }
//            if(number == reversedNumber)
//                return true;
//            else
//                return false;
//        }
    }
}
