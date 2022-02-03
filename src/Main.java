public class Main {

    public static boolean trafficGreenLight = false; // объявляется свет светофора

    public static void printDelim(String player) {  // выводится номер игрока
        System.out.println("---------------------------------");
        System.out.println(player);
    }

    public static int moves(int speedPlayer) { // расчет одного из трех результатов игры
        int out;
        if (trafficGreenLight == true) {
            out = 1; //"остается в игре: светофор зеленый";
        } else {
            if (speedPlayer > 0) {
                out = 2; //"выбывает: двигался на красный светофор";
            } else {
                out = 3; //"остается в игре: не двигался при красном светофоре";
            }
        }
        return out;
    }

    public static void printGameResult(int out) { //вывод на экран расшифровки результата
        if (out == 1) {
            System.out.println("Зеленый свет. Остается в игре");
        }
        if (out == 2) {
            System.out.println("Выбывает: двигался на красный светофор");
        }
        if (out == 3) {
            System.out.println("Остается в игре: не двигался при красном светофоре");
        }
    }

    public static void main(String[] args) {
        printDelim("Игрок 1");
        int out = moves(5);
        printGameResult(out);

        printDelim("Игрок 2");
        out = moves(0);
        printGameResult(out);

        printDelim("Игрок 3");
        out = moves(2);
        printGameResult(out);

    }
}
