import java.awt.Rectangle;

public class BigRectangleFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof Rectangle)
        {
            Rectangle r = (Rectangle) x;
            double perimeter = 2 * (r.height + r.width);
            return perimeter > 10;
        }
        return false;
    }
}
