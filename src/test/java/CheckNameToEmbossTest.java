import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckNameToEmbossTest {

    private final String name;
    private final boolean expected;


    public CheckNameToEmbossTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"ТимотейШевроле ", false},
                {"Тимоти Шаламе", true},
                {" Тимоти Шаламе", false},
                {"", false},
                {"Тимоти  Шаламе", false},
                {"12", false},
                {"12345 7890123456789", false},
                {"12345 78901234567890", false},
                {null, false},
        };
    }

    @Test
    public void checkNameToEmbossTest() {
        Account account = new Account(name);
        boolean result = account.checkNameToEmboss();
        assertEquals(result, expected);
    }
}
