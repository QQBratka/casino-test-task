package games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlotGameTest {
    private static SlotGame slotGame;
    private static int credit;
    private int minWin;

    @BeforeAll
    public static void beforeAll() {
        slotGame = new SlotGame();
        credit = 10;
    }

    @BeforeEach
    public void beforeEach() {
        minWin = 0;
    }

    @Test
    void playGame_ok() {
        Assertions.assertTrue(minWin <= slotGame.startSlotGame(credit));
    }

    @Test
    void negativeCredit_notOk() {
        Assertions.assertThrows(RuntimeException.class, () ->
                slotGame.startSlotGame(-1));
    }
}
