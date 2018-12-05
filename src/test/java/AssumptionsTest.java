import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by mtumilowicz on 2018-12-05.
 */
public class AssumptionsTest {
    
    @Test
    public void createFile_travisSafe() throws IOException {
        var file = new File("file.txt");
        
//        assumingThat(() -> !Objects.equals(System.getProperty("user.name"), "travis"),
//                () -> assertTrue(file.createNewFile()));

        file.createNewFile();
        
        file.delete();
    }
}
