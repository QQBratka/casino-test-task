package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GamesUtil {
    public List<Integer> getRandom(int index) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < index; j++) {
            list.add(j);
        }
        Collections.shuffle(list);
        return list;
    }

    public void creditValidation(int credit) {
        if (credit <= 0) {
            throw new RuntimeException("Credit must be positive!");
        }
    }
}
