import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void subtraction(){
        assertEquals(1, SkillDemo1.subtract(3, 1)); //Fails
    }
}
