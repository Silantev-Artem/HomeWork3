public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int a = 40000;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        byte b = 22;
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        short c = 2025;
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        long d = 52000L;
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        float e = 3.75F;
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        double f = 12.345;
        System.out.println("Значение переменной 'f' с типом double равно " + f);

        System.out.println("\nЗадание 2");
        float variable21 = 27.12f;
        long variable22 = 987678965549L;
        float variable23 = 2.786f;
        short variable24 = 569;
        short variable25 = -159;
        short variable26 = 27897;
        byte variable27 = 67;
        System.out.println(" Переменные инициализированы");

        System.out.println("\nЗадание 3");
        byte pupilsLudPav = 23;
        byte pupilsAnnSer = 27;
        byte pupilsEkaAnd = 30;
        short totalPapers = 480;
        byte totalPupils = (byte) (pupilsEkaAnd + pupilsAnnSer + pupilsLudPav);
        short papersPerPupil = (short) (totalPapers / totalPupils);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        System.out.println("\nЗадание 4");
        byte productPerMinute = 16 / 2;
        short product20Minutes = (short) (productPerMinute * 20);
        System.out.println("За 20 минут машина произвела " + product20Minutes + " штук бутылок");
        short minutesInDay = (short) (60 * 24);
        short productInDay = (short) (minutesInDay * productPerMinute);
        System.out.println("За сутки машина произвела " + productInDay + " штук бутылок");
        int minutesIn3Days = minutesInDay * 3;
        int productIn3Days = minutesIn3Days * productPerMinute;
        System.out.println("За три дня машина произвела " + productIn3Days + " штук бутылок");
        int minutesInMonth = minutesInDay * 31;
        int productInMonth = minutesInMonth * productPerMinute;
        System.out.println("За месяц машина произвела " + productInMonth + " штук бутылок");

        System.out.println("\nЗадание 5");
        byte totalPaints = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte sumPaintPerClass = (byte) (whitePaintPerClass + brownPaintPerClass);
        byte totalClasses = (byte) (totalPaints / sumPaintPerClass);
        byte whitePaintForTotalClasses = (byte) (whitePaintPerClass * totalClasses);
        byte brownPaintForTotalClasses = (byte) (brownPaintPerClass * totalClasses);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintForTotalClasses + " банок белой краски и " + brownPaintForTotalClasses + " банок коричневой краски");

        System.out.println("\nЗадание 6");
        byte amountBananas = 5;
        byte weightOneBanana = 80;
        short weightTotalBananas = (short) (amountBananas * weightOneBanana);
        short amountMilkTotalMl = 200;
        byte amountMilk100Ml = 100;
        byte weightMilkPer100Ml = 105;
        short weightTotalMilk = (short) ((amountMilkTotalMl / amountMilk100Ml) * weightMilkPer100Ml);
        byte amountIceCream = 2;
        byte weightOneIceCream = 100;
        short weightTotalIceCream = (short) (amountIceCream * weightOneIceCream);
        byte amountEggs = 4;
        byte weightOneEgg = 70;
        short weightTotalEggs = (short) (amountEggs * weightOneEgg);

        int totalWeightGr = weightTotalBananas + weightTotalMilk + weightTotalIceCream + weightTotalEggs;
        int grPerKg = 1000;
        float totalWeightKg = (float) totalWeightGr / grPerKg;
        System.out.println("Вес спортзавтрака составляет " + totalWeightGr + " граммов, или " + totalWeightKg + " килограммов");

        System.out.println("\nЗадание 7");
        byte loseWeightKg = 7;
        int loseWeightG = grPerKg * loseWeightKg;
        short minLoseWeight = 250;
        short maxLoseWeight = 500;
        int daysMinLoseWeight = loseWeightG / minLoseWeight;
        int daysMaxLoseWeight = loseWeightG / maxLoseWeight;
        int daysAverageLoseWeight = (daysMaxLoseWeight + daysMinLoseWeight) / 2;
        System.out.println("У спортсмена уйдет " + daysMinLoseWeight + " дней на похудение, если спортсмен будет терять каждый день по " + minLoseWeight + " грамм.");
        System.out.println("Уйдет " + daysMaxLoseWeight + " дней, — если каждый день будет худеть на " + maxLoseWeight + " грамм.");
        System.out.println("В среднем может потребоваться " + daysAverageLoseWeight + " день , чтобы добиться результата похудения.");

        System.out.println("\nЗадание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float koefSalary = 1.1f;
        int mashaNewSalary = (int) (masha * koefSalary);
        int denisNewSalary = (int) (denis * koefSalary);
        int kristinaNewSalary = (int) (kristina * koefSalary);
        int diffMasha = mashaNewSalary - masha;
        int diffDenis = denisNewSalary - denis;
        int diffKristina = kristinaNewSalary - kristina;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + diffMasha + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + diffDenis + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + diffKristina + " рублей.");









    }
}