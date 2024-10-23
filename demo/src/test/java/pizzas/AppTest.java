package pizzas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() //teste de unidade do sum
    {
        int expected= 2;
        int actual= App.sum(1,1);
        assertTrue( expected==actual );
    }
}
