package om.team3d.testUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @BeforeAll
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("inside method with annotated of before all!");
    }
    @Test
    @DisplayName("add test")
    public void myfirstTest(){
        System.out.println("inside my first test");
        int a=2;
        int b=3;
        assertEquals(a+b,new Calculation().Add(a,b),"fuck you asshole 2+5 equals 5 !!!!");

    }

    @Test
    public void mySecoundTest(){
        System.out.println("inside my second test");
        int a=2;
        int b=10;

    }

    //avval test ra minevisim


}
