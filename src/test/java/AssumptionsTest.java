import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * Created by mtumilowicz on 2018-12-05.
 */
public class AssumptionsTest {
    
    @Test
    public void createFile_travisSafe() {
        assumingThat(() -> !Objects.equals(System.getProperty("user.name"), "travis"),
                () -> assertTrue(false));
    }
}
