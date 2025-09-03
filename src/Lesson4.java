import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner calculationService = new Scanner(System.in);
        boolean davamEt = true;
        while (davamEt) {

            System.out.println("""
                menyudan xidmeti secin:
                Valyuta çevrici - 1
                Bədən kütlə indeksi -2
                Vergi hesablayıci- 3
                Qiymət/Grade kalkulyatoru- 4
                Taksi haqqi hesablayci - 5
                Ucbucaq növü təyini - 6
                Exit - 7""");

        int serviceType = calculationService.nextInt();

            switch (serviceType) {
                case 1:
                    System.out.print("Valyuta cevirmesi ucun məbləği daxil edin:");
                    double amount = calculationService.nextInt();
                    System.out.println("Valyuta secin (AZN,USD ve ya EUR)");

                    System.out.println("FROM:");
                    String currency1 = calculationService.next();

                    System.out.println("TO:");
                    String currency2 = calculationService.next();

                    String cur1 = "AZN";
                    String cur2 = "USD";
                    String cur3 = "EUR";

                    boolean strongCurrency = ((currency1.equalsIgnoreCase(cur1) || currency1.equalsIgnoreCase(cur2) || currency1.equalsIgnoreCase(cur3)) && (currency2.equalsIgnoreCase(cur1) || currency2.equalsIgnoreCase(cur2) || currency2.equalsIgnoreCase(cur3)));

                    if (strongCurrency) {


                        if (currency1.equalsIgnoreCase(cur1) && currency2.equalsIgnoreCase(cur2)) {

                            double calculate1 = amount * 0.59;
                            System.out.println(amount + " " + currency1 + " = " + calculate1 + " " + currency2);
                        } else if (currency1.equalsIgnoreCase(cur1) && currency2.equalsIgnoreCase(cur3)) {
                            double calculate2 = amount * 0.54;
                            System.out.println(amount + " " + currency1 + " = " + calculate2 + " " + currency2);

                        } else if (currency1.equalsIgnoreCase(cur2) && currency2.equalsIgnoreCase(cur1)) {
                            double calculate3 = amount * 1.7;
                            System.out.println(amount + " " + currency1 + " = " + calculate3 + " " + currency2);
                        } else if (currency1.equalsIgnoreCase(cur3) && currency2.equalsIgnoreCase(cur1)) {
                            double calculate4 = amount * 1.85;
                            System.out.println(amount + " " + currency1 + " = " + calculate4 + " " + currency2);
                        } else {
                            System.out.println("bu cevrilme ucun nezerde tutulmayib");
                        }
                    } else {
                        System.out.println("valyutani duzgun daxil etdiyine emin olun");
                    }

                    break;

                case 2:
                    Scanner bodyMassIndex = new Scanner(System.in);
                    System.out.println("asagidaki melumatlari daxil edin");
                    System.out.print("ceki: ");
                    float weihgtKg = bodyMassIndex.nextFloat();

                    System.out.print("boy: ");
                    short heightCm = bodyMassIndex.nextShort();

                    float heihgtM = (float) heightCm / 100.0f;
                    float bmi = weihgtKg / (heihgtM * heihgtM);

                    if (bmi < 18.5) {
                        System.out.println("BMI: " + bmi + " (zeyif ceki)");
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                        System.out.println("BMI: " + bmi + " (normal)");
                    } else if (bmi >= 25 && bmi <= 29.9) {
                        System.out.println("BMI: " + bmi + " (artiq ceki)");
                    } else {
                        System.out.println("BMI: " + bmi + " (obez)");
                    }
                    break;
                case 3:
                    Scanner taxCalculator = new Scanner(System.in);
                    System.out.println("Vergi hesablanmasi ucun asagidaki melumatlari daxil edin");
                    System.out.print("Ayliq maas:");
                    double monthlySalary = taxCalculator.nextInt();
                    System.out.println("Residentsiniz? BELI/XEYIR");
                    String yesOrNo = taxCalculator.next();
                    String yes = "BELI";
                    String no = "XEYIR";
                    Double taxAmount = null;
//                boolean isResidence = yesOrNo.equalsIgnoreCase(yes);

                    double taxCalc1 = (monthlySalary - 500) * 0.1;
                    double taxCalc2 = (monthlySalary - 2000) * 0.15 + ((monthlySalary - (monthlySalary - 2000) - 500) * 0.1);
                    double taxCalc3 = monthlySalary * 0.2;

                    if (yesOrNo.equalsIgnoreCase(yes)) {
                        if (monthlySalary > 0 && monthlySalary <= 500) {
                            taxAmount = 0.0;
                        } else if (monthlySalary > 500 && monthlySalary < 2000) {
                            taxAmount = taxCalc1;
                        } else if (monthlySalary >= 2000) {
                            taxAmount = taxCalc2;
                        }
                    } else if (yesOrNo.equalsIgnoreCase(no)) {
                        taxAmount = taxCalc3;
                    } else {
                        System.out.println("Melumatlairi duzgun daxil edin");
                    }
                    double netSalary = monthlySalary - taxAmount;
                    System.out.println("tutulacaq verqi: " + taxAmount + " AZN\nvergisiz maas: " + netSalary + " AZN");

                    break;
                case 4:
                    Scanner gradeCalculator = new Scanner(System.in);

                    System.out.print("balinizi daxil edin:");
                    int grade = gradeCalculator.nextInt();

                    if (grade >= 90 && grade <= 100) {
                        System.out.println("sizin qiymetiniz: A");
                    } else if (grade >= 80 && grade <= 89) {
                        System.out.println("sizin qiymetini: B");
                    } else if (grade >= 70 && grade <= 79) {
                        System.out.println("sizin qiymetiniz: C");
                    } else if (grade >= 60 && grade <= 69) {
                        System.out.println("sizin qiymetiniz D");
                    } else if (grade < 60) {
                        System.out.println("sizin qiymetiniz: F");
                    } else {
                        System.out.println("Xeta");
                    }
                    break;
                case 5:
                    Scanner taksiAmountCalculator = new Scanner(System.in);
                    System.out.println("tutulacaq meblegi hesablamaq ucun melumatlari daxil edin:");
                    System.out.print("Mesafe:");
                    int distanceKm = taksiAmountCalculator.nextInt();

                    System.out.print("yola gece cixmisiniz?");
                    String nightJourney = taksiAmountCalculator.next();
                    System.out.print("Yas:");
                    byte age = taksiAmountCalculator.nextByte();


                    String night = "BElI";
                    boolean isNight = false;
                    double calculateIfNotNight = 1.0 + distanceKm * 0.7;
                    double calculateAtNigth = 1.0 + distanceKm * 0.8;

                    double discountChildrenAtNight = calculateAtNigth * 0.5;
                    double discountChildrenIfNotNight = calculateIfNotNight * 0.5;
                    double discountElderIfNotNight = calculateIfNotNight * 0.7;
                    double discountElderATNight = calculateAtNigth * 0.7;


                    if (nightJourney.equalsIgnoreCase(night)) {
                        isNight = true;
                        System.out.println("Tutulacaq mebleg: " + calculateIfNotNight);
                        if (age < 12) {
                            System.out.println("endirimli mebleg: " + discountChildrenIfNotNight);
                        } else if (age >= 65) {
                            System.out.println("endirimli mebleg: " + discountElderIfNotNight);
                        }
                    } else {
                        isNight = false;

                    System.out.println("Tutulacaq mebleg: " + calculateAtNigth);
                    if (age < 12) {
                        System.out.println("endirimli mebleg: " + discountChildrenAtNight);
                    } else if (age >= 65) {
                        System.out.println("endirimli mebleg: " + discountElderATNight);
                    }}

                    break;
                case 6:
                    Scanner triagleType = new Scanner(System.in);

                    System.out.print("a terefi: ");
                    int a = triagleType.nextInt();

                    System.out.print("b terefi: ");
                    int b = triagleType.nextInt();

                    System.out.print("c terefi: ");
                    int c = triagleType.nextInt();

                    boolean triagleInequality = a + b > c && a + c > b && b + c > a && Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a;

                    if (triagleInequality) {
                        if (a == b && b == c) {
                            System.out.println("bereberterefli ucbucaq");
                        } else if (a == b || a == c || b == c) {
                            System.out.println("beraberyanli ucbucaq");
                        } else {
                            System.out.println("muxtelifterefli ucbucaq");
                        }
                    } else {
                        System.out.println("tereflerinin uzunluqu " + a + ", " + b + ", " + c + " olan ucbucaq movcud deyil");
                    }
                    break;
                case 7:
                    davamEt = false;
                default:
                    System.out.println("Xeta");
            }

//        for(
//    int i = 0;
//    i<5;i++)
//
//    {
//
//        for (int j = 0; j < i; j++)
//            System.out.print("*");
//
//        System.out.println("*");
//    }
//        System.out.println();
//        for(
//    int i = 5;
//    i >0; --i)
//
//    {
//        {
//            for (int j = 1; j < i; j++)
//                System.out.print("*");
//        }
//        System.out.println("*");
//    }


//VURMA CEDVELI
//        for (int i = 2; i  <=10; i++) {
//            for (int j = 1; j <= 10; j++)
//                System.out.println(i + "*" + j + "=" + j * i );
//
//        System.out.println();}

//            REQEMLERIN CEMI
//            Scanner digitsSum = new Scanner(System.in);
//            int number = digitsSum.nextInt();
//            int sum = 0;
//            for (; number > 0; number /= 10) {
//                sum += number % 10;
//            }
//            System.out.println(sum);
//        }
////
//        Scanner digitsSum1 = new Scanner(System.in);
//        int number1 = digitsSum1.nextInt();
//        for (; number1 >= 1; number1 /= 10) {
//            System.out.println(number1 % 10);
//        }
//        System.out.println();


        }
    }
}










