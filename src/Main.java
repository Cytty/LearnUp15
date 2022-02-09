import my.first.code.Game;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Game");

        int[] speed = {5, 0, 2};

        Game.printDelim("Количество выбывающих");
        int quantityLosers = Game.moves(speed);
        System.out.println(quantityLosers);

        Game.printDelim("Скорости выбывающих");
        int[] quantitySpeedLosers = Game.losers(speed);
        System.out.println(Arrays.toString(quantitySpeedLosers));

        Game.printDelim("Скорости победителей");
        int[] quantitySpeedWinners = Game.winners(speed);
        System.out.println(Arrays.toString(quantitySpeedWinners));

    }
}

