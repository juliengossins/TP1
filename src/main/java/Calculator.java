
public class Calculator
{
    public static int Add(int a, int b)
    {
        int result = a + b;
        if(a > 0 && b > 0 && result <= 0)
            throw new IndexOutOfBoundsException();
        else if(a < 0 && b < 0 && result >= 0)
            throw new IndexOutOfBoundsException();

        return result;
    }

    public static int Substract(int a, int b)
    {
        int result = a - b;
        return result;
    }
}
