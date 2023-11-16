import com.learn.Vector2D;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v;

    @BeforeClass
    public static void createNewVector(){
        v = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, v.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0,v.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0,v.getY(),EPS);
    }
}
