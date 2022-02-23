package games;

import util.GamesUtil;
import java.util.List;
import java.util.Random;

public class SlotGame {
    public GamesUtil gamesUtil = new GamesUtil();
    public Random random = new Random();

    public int startSlotGame(int credit) {
        gamesUtil.creditValidation(credit);
        int wonCoins = 0;
        List<Integer> randomList = gamesUtil.getRandom(10);
        int yourNumber = random.nextInt(10);
        int firstLuckyNumber = randomList.get(0);
        int secondLuckyNumber = randomList.get(1);
        int luckyNumberWithFreeGame = randomList.get(2);
        if (yourNumber == firstLuckyNumber
                || yourNumber == secondLuckyNumber) {
            wonCoins = credit * 2;
            return wonCoins;
        }
        if (yourNumber == luckyNumberWithFreeGame) {
            wonCoins = startFreeGame(credit * 3, credit);
        }
        return wonCoins;
    }

    public int startFreeGame(int wonCoins, int credit) {
        List<Integer> randomList = gamesUtil.getRandom(10);
        int yourNumber = random.nextInt(10);
        int firstLuckyNumber = randomList.get(0);
        int secondLuckyNumber = randomList.get(1);
        int luckyNumberWithFreeGame = randomList.get(2);
        if (yourNumber == firstLuckyNumber
                || yourNumber == secondLuckyNumber) {
            wonCoins += credit * 2;
            return wonCoins;
        }
        if (yourNumber == luckyNumberWithFreeGame) {
            wonCoins += credit * 3;
            startFreeGame(wonCoins, credit);
        }
        return wonCoins;
    }
}
