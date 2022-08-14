public class Main {
    public static void main(String[] args) {

// Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }  else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
// Задание 2
        System.out.println("Задание 2");
            int ProductionYear = 2015;
            int DeviceYear = 2012;
            if (DeviceYear < ProductionYear )

        {System.out.print("Установите облегченную версию приложения для Android по ссылке ");}
        else {System.out.print ("Установите версию приложения ");}
        if (clientOS == 1)
        {System.out.println ("для Android");}
        else
        {System.out.println ("для iOS");}

 //Задание 3
    int year = 2021;
    if (year % 400 == 0) {
            System.out.println(+year+ " является високосным");
        } if (year % 4 == 0 && year % 100 != 0 || year % 400==0) {    // если год делится на 4 и не делится на 100 или делится на 400
            System.out.println(+year+ " является високосным");

        } else {System.out.println(+year+ " не является високосным");}

//Задание 4
        int deliveryDistance = 60;
        int deliveryDays = 2;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance < startInterval ) {deliveryDays = 1;}
        else
        {deliveryDays = deliveryDays + ((deliveryDistance - startInterval) / interval);}
        {System.out.println("Потребуется дней: "+deliveryDays);}

 //Задание 5 //

        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
            System.out.println("Это зимний месяц");
                 break;
            case 3:
            case 4:
            case 5:
            System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                   break;
            default:
                System.out.println("В году только 12 месяцев");}



}
}

