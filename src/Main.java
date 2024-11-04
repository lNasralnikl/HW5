public class Main {

    public static void main(String[] args){

        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i += 2){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 5");
        System.out.println("Высокосными годами являются: ");
        for (int i = 1904; i < 2097; i += 4) {
            if (i % 100 != 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i +=7){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i *=2){
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("Задача 8");
        int rub = 29000;
        for (int i = 1; i < 13; i++){
            System.out.println("Месяц " + i + " сумма накоплений равна " + rub*i + " рублей");
        }

        System.out.println();
        System.out.println("Задача 9");
        rub = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++){
            total = total + rub + total/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
        System.out.println("Задача 10");
        for (int i = 1; i < 11; i++){
            System.out.println("2*" + i + "=" + i*2);
        }


    }

}
