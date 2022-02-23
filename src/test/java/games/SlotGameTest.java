package games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlotGameTest {
    private static SlotGame slotGame;
    private static int credit;
    private int minWin;
    private int maxWin;

    @BeforeAll
    public static void beforeAll() {
        slotGame = new SlotGame();
        credit = 10;
    }

    @BeforeEach
    public void beforeEach() {
        minWin = 0;
        maxWin = 30;
    }

    @Test
    void playGame_ok() {
        Assertions.assertTrue(minWin <= slotGame.startSlotGame(credit)
                && maxWin >= slotGame.startSlotGame(credit));
    }

    @Test
    void negativeCredit_notOk() {
        if (credit <= 0) {
            Assertions.assertThrows(RuntimeException.class, () ->
                    slotGame.startSlotGame(-1));
        }
    }

}