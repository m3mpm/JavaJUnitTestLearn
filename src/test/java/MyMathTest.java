import com.learn.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDelitelShouldThrowExceptino(){
        MyMath.divide(1,0);
    }
}
