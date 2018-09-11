import org.junit.Assert;
import org.junit.Test;

public class TestCalculator
{
    @Test
    public void Add_1Plus1()
    {
        //Arrange = Organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;

        //Act = Faire l'action
        int actualResult = Calculator.Add(arg1, arg2);

        //Assert - Vérifier
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void Add_MaxPlus1()
    {
        //Arrange = Organiser
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        //Act = Faire l'action
        Calculator.Add(arg1, arg2);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void Add_MinPlusMinus1()
    {
        //Arrange = Organiser
        int arg1 = Integer.MIN_VALUE;
        int arg2 = -1;

        //Act = Faire l'action
        Calculator.Add(arg1, arg2);
    }

    @Test
    public void Substract_3Minus1()
    {
        int arg1 = 3;
        int arg2 = 1;
        int expectedResult = 2;

        int actualResult = Calculator.Substract(arg1, arg2);

        //this is a comment
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void FailedTest()
    {
        Assert.fail();
    }
}
