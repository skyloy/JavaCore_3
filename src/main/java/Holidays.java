import lombok.Data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Перечисление с праздниками
 */
public enum Holidays {
    NoHoliday("Today is no holiday"), NewYear("Happy New Year!"),
    March8("Happy women's day!"), February23("Happy Day of the Defender of Motherland!");

    public String getCongratulation() {
        return congratulation;
    }

    private final String congratulation;

    Holidays(String congratulation) {
        this.congratulation = congratulation;
    }
}

