import java.util.ArrayList;
import java.util.List;

public class Select
{
    public static List<Object> collectAll(Object[] objects, Filter filter)
    {
        List<Object> acceptedObjects = new ArrayList<>();
        for (Object obj : objects)
        {
            if (filter.accept(obj))
            {
                acceptedObjects.add(obj);
            }
        }
        return acceptedObjects;

    }
}
