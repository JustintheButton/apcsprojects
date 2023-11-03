
import static java.lang.System.*;

public class TriangleThree
{
  public static String createTriangle( String let, int sz)
    {
        String output="";
        for(int i = 0; i < sz; i++){
            for(int j = 0; j < sz - i - 1; j++){
                output += " ";
            }
            for(int j = 0; j < i + 1; j++){
                output += let;
            }
            output += "\n";
        }
        return output;
    }
}