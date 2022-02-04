import my.first.code.Utils;

public class Main {

    public static void main(String[] args) {
        Utils.printDelim("Игрок 1");
        int out = Utils.moves(5);
        Utils.printGameResult(out);

        Utils.printDelim("Игрок 2");
        out = Utils.moves(0);
        Utils.printGameResult(out);

        Utils.printDelim("Игрок 3");
        out = Utils.moves(2);
        Utils.printGameResult(out);

    }
}
