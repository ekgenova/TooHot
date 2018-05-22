import org.junit.Assert;
import org.junit.Test;

public class IsItTooHotTest {

    @Test
    public void isItTooHotTest(){
        IsItTooHot isItTooHot = new IsItTooHot();
        Assert.assertFalse(isItTooHot.isItTooHot(50,true));
        Assert.assertFalse(isItTooHot.isItTooHot(50,false));
        Assert.assertFalse(isItTooHot.isItTooHot(100,false));
        Assert.assertTrue(isItTooHot.isItTooHot(100,true));
        Assert.assertTrue(isItTooHot.isItTooHot(75,true));
        Assert.assertTrue(isItTooHot.isItTooHot(75,false));
    }
}
