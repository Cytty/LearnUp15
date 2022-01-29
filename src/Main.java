class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 3;
        int speedOfPlayer3 = 2;

        int nOfPlayers = 0;

        if (speedOfPlayer1 > 0) {
            nOfPlayers = (nOfPlayers + 1);
        }
        if (speedOfPlayer2 > 0) {
            nOfPlayers = (nOfPlayers + 1);
        }
        if (speedOfPlayer3 > 0) {
            nOfPlayers = (nOfPlayers + 1);
        }
        if (isGreenLight == false) {
            System.out.println("Выбыло игроков: " + nOfPlayers);
        } else {
            System.out.println("Выбывших нет");
        }


    }
}