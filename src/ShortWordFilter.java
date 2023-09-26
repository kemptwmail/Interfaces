public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof String)
        {
            String shortWord =(String) x;
            return shortWord.length() < 5;
        }
        return false;
    }
}
