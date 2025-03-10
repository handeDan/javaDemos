import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Day : ");
        day = input.nextInt();
        System.out.println("Month : ");
        month = input.nextInt();

//    switch (month) {
//        case 1: //january
//            if(day >= 1 && day <= 31){
//                if(day <= 21) {
//                    System.out.println("Capricorn");
//                } else{
//                    System.out.println("Aquarius");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 2: //february
//            if(day >= 1 && day <= 29){
//                if(day <= 19) {
//                    System.out.println("Aquarius");
//                } else{
//                    System.out.println("Pisces");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 3: //march
//            if(day >= 1 && day <= 31){
//                if(day <= 20) {
//                    System.out.println("Pisces");
//                } else{
//                    System.out.println("Aries");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 4: //april
//            if(day >= 1 && day <= 30){
//                if(day <= 20) {
//                    System.out.println("Aries");
//                } else{
//                    System.out.println("Taurus");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 5: //may
//            if(day >= 1 && day <= 31){
//                if(day <= 21) {
//                    System.out.println("Taurus");
//                } else{
//                    System.out.println("Gemini");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 6: //june
//            if(day >= 1 && day <= 30){
//                if(day <= 22) {
//                    System.out.println("Gemini");
//                } else{
//                    System.out.println("Cancer");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 7: //july
//            if(day >= 1 && day <= 31){
//                if(day <= 22) {
//                    System.out.println("Cancer");
//                } else{
//                    System.out.println("Leo");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 8: //august
//            if(day >= 1 && day <= 31){
//                if(day <= 22) {
//                    System.out.println("Leo");
//                } else{
//                    System.out.println("Virgo");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 9: //september
//            if(day >= 1 && day <= 30){
//                if(day <= 22) {
//                    System.out.println("Virgo");
//                } else{
//                    System.out.println("Libra");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 10: //october
//            if(day >= 1 && day <= 31){
//                if(day <= 22) {
//                    System.out.println("Libra");
//                } else{
//                    System.out.println("Scorpio");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 11: //november
//            if(day >= 1 && day <= 30){
//                if(day <= 21) {
//                    System.out.println("Scorpio");
//                } else{
//                    System.out.println("Sagittarius");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//        case 12: //december
//            if(day >= 1 && day <= 31){
//                if(day <= 21) {
//                    System.out.println("Sagittarius");
//                } else{
//                    System.out.println("Capricorn");
//                }
//            } else{
//                System.out.println("Invalid day.");
//            }
//            break;
//    }


        String zodiac = ""; // Burç ismi
        boolean isValidDay = true; // Gün geçerli mi?

        if (month == 1) { // Ocak
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 21) ? "Capricorn" : "Aquarius";
            } else isValidDay = false;
        } else if (month == 2) { // Şubat
            if (day >= 1 && day <= 29) {
                zodiac = (day <= 19) ? "Aquarius" : "Pisces";
            } else isValidDay = false;
        } else if (month == 3) { // Mart
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 20) ? "Pisces" : "Aries";
            } else isValidDay = false;
        } else if (month == 4) { // Nisan
            if (day >= 1 && day <= 30) {
                zodiac = (day <= 20) ? "Aries" : "Taurus";
            } else isValidDay = false;
        } else if (month == 5) { // Mayıs
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 21) ? "Taurus" : "Gemini";
            } else isValidDay = false;
        } else if (month == 6) { // Haziran
            if (day >= 1 && day <= 30) {
                zodiac = (day <= 22) ? "Gemini" : "Cancer";
            } else isValidDay = false;
        } else if (month == 7) { // Temmuz
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 22) ? "Cancer" : "Leo";
            } else isValidDay = false;
        } else if (month == 8) { // Ağustos
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 22) ? "Leo" : "Virgo";
            } else isValidDay = false;
        } else if (month == 9) { // Eylül
            if (day >= 1 && day <= 30) {
                zodiac = (day <= 22) ? "Virgo" : "Libra";
            } else isValidDay = false;
        } else if (month == 10) { // Ekim
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 22) ? "Libra" : "Scorpio";
            } else isValidDay = false;
        } else if (month == 11) { // Kasım
            if (day >= 1 && day <= 30) {
                zodiac = (day <= 21) ? "Scorpio" : "Sagittarius";
            } else isValidDay = false;
        } else if (month == 12) { // Aralık
            if (day >= 1 && day <= 31) {
                zodiac = (day <= 21) ? "Sagittarius" : "Capricorn";
            } else isValidDay = false;
        } else {
            isValidDay = false; // Geçersiz ay
        }

        if (isValidDay) {
            System.out.println("Your zodiac sign is: " + zodiac);
        } else {
            System.out.println("Invalid date entered.");
        }

        input.close();
    }
    }