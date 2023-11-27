import iryna.bodnyk.AppLab3;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class TestAppLab3 {
    @Test
    public void testMult() throws Exception{
        AppLab3 calc = new AppLab3();
        int mult = calc.mult(2,3);
        Assert.assertEquals(6,mult);
    }
}
