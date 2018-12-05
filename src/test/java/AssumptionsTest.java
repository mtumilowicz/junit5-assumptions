import org.junit.Test;

import java.io.File;
import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * Created by mtumilowicz on 2018-12-05.
 */
public class AssumptionsTest {
    
    @Test
    public void createFile_travisSafe() {
        var file = new File("file.txt");
        
        assumingThat(() -> !Objects.equals(System.getProperty("user.name"), "travis"),
                () -> assertTrue(file.createNewFile()));

        file.delete();
    }
}
