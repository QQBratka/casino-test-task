package games;

import util.GamesUtil;
import java.util.List;
import java.util.Random;

public class BonusGame {
    public GamesUtil gamesUtil = new GamesUtil();
    public Random random = new Random();

    public int startBonusGame(int credit) {
        gamesUtil.creditValidation(credit);
        int wonCoins = 0;
        List<Integer> randomList = gamesUtil.getRandom(10);
        int yourNumber = random.nextInt(10);
        int luckyNumber = randomList.get(0);
        if (yourNumber == luckyNumber) {
            List<Integer> exitList = gamesUtil.getRandom(5);
            int exitGame = exitList.get(0);
            List<Integer> pickedList = gamesUtil.getRandom(5);
            for (int j = 0; j < 5; j++) {
                if (pickedList.get(j) == exitGame) {
                    break;
                }
                wonCoins += credit / 2;
            }
        }
        return wonCoins;
    }
}
