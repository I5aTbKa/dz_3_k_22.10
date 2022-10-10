import java.util.Scanner;

public class Main {
    private static int x = 1;

    public static void main(String[] args) {
        while (x == 1) {
            System.out.println("Работаем? \n1-да \n0-нет");
            Scanner odin = new Scanner(System.in);
            int konec = odin.nextInt();
            if (konec==0) {
                break;

            }
            reshenie();
        }
    }

    public static void reshenie() {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте. Калькулятор - 1. Решение уравнения - 2");
        String e = in.next();

        if (e.equals("1")) {
            System.out.println("Введите 1 число");
            double cislo1 = in.nextInt();
            System.out.println("Введите 2 число");
            double cislo2 = in.nextInt();
            System.out.println("Введите операцию(+,-,/,*):");
            String op = in.next();

            if (op.equals("+")) {
                System.out.println( summa(cislo1, cislo2));
            } else if (op.equals("-")) {
                System.out.println(raz(cislo1, cislo2));
            } else if (op.equals("/")) {
                System.out.println(delenie(cislo1, cislo2));
            } else if (op.equals("*")) {
                System.out.println(umnojenie(cislo1, cislo2));
            }else {
                System.out.println("Error");
            }
        } else if (e.equals("2")) {
            System.out.println("Введите a:");
            double a = in.nextInt();
            System.out.println("Введите b:");
            double b = in.nextInt();
            System.out.println("Введите c:");
            double c = in.nextInt();
            System.out.println(urav(a,b,c ));

        }else {
            System.out.println("Error");
        }

    }


    public static double summa(double cislo1, double cislo2) {
        return cislo1 + cislo2;
    }

    public static double raz(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double umnojenie(double cislo1, double cislo2) {
        return cislo1 * cislo2;
    }

    public static String urav(double a, double b, double c) {
        double d = b * b - (4 * a * c);
        String korni;
        if (d > 0) {
            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            korni = ("x1 = " + x1 + "\nx2 = " + x2);
        } else if (d == 0) {
            double x = (-1) * b / (2 * a);
            korni = ('x' + "=" + x);
        } else {
            korni = ("Нет корней.");
        }

        return korni;
    }
}