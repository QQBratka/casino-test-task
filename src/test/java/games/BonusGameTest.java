package games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BonusGameTest {
    private static BonusGame bonusGame;
    private static int credit;
    private int minWin;
    private int maxWin;

    @BeforeAll
    public static void beforeAll() {
        bonusGame = new BonusGame();
        credit = 10;
    }

    @BeforeEach
    public void beforeEach() {
        minWin = -10;
        maxWin = 20;
    }

    @Test
    void playGame_ok() {
        Assertions.assertTrue(minWin <= bonusGame.startBonusGame(credit)
                && maxWin >= bonusGame.startBonusGame(credit));
    }

    @Test
    void negativeCredit_notOk() {
        if (credit <= 0) {
            Assertions.assertThrows(RuntimeException.class, () ->
                    bonusGame.startBonusGame(-1));
        }
    }
}