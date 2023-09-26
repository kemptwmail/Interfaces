import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        BigRectangleFilter rFilter = new BigRectangleFilter();
        ArrayList<Object> rects = new ArrayList<>();

        rects.add(new Rectangle(3,4));
        rects.add(new Rectangle(5,2));
        rects.add(new Rectangle(3,3));
        rects.add(new Rectangle(4,2));
        rects.add(new Rectangle(6,3));
        rects.add(new Rectangle(2,5));
        rects.add(new Rectangle(1,3));
        rects.add(new Rectangle(1,2));
        rects.add(new Rectangle(2,3));
        rects.add(new Rectangle(2,1));

        for (Object x : rects)
            if (rFilter.accept(x))
            {
                System.out.println(x);
            }

    }
}
