package om.team3d.testUnit;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class AppTest2 {

    @Mock
    private SubtractService subtractService;
    @Test
    @BeforeEach
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @AfterEach
    public void subTest(){
        SubtractService subtractService;
        CalcService calcService;
        subtractService=Mockito.mock(SubtractService.class);
        calcService = new CalcService(subtractService);
        int num1=10;
        int num2=5;
        int expect=5;

        when(subtractService.Subtract(num1,num2)).thenReturn(expect);
        int actual = calcService.calc(num1,num2);
        assertEquals(expect,actual);




    }
    @Test
    @AfterEach
    public void After(){
        System.out.println("After All");
    }


}
