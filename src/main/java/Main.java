import games.BonusGame;
import games.SlotGame;

public class Main {
    public static void main(String[] args) {
        SlotGame slotgame = new SlotGame();
        BonusGame bonusgame = new BonusGame();
        int creditForMillionGames = 10000000;
        int coinsForGame = 10;
        int wonSlotCoins = 0;
        int wonBonusCoin = 0;
        for (int i = 0; i < 1000000; i++) {
            wonSlotCoins += slotgame.startSlotGame(coinsForGame);
            wonBonusCoin += bonusgame.startBonusGame(coinsForGame);
        }
        System.out.println((double) wonSlotCoins / creditForMillionGames);
        System.out.println((double) wonBonusCoin / creditForMillionGames);
    }
}
