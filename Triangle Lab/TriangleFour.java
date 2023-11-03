//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFour
{
  public static String createTriangle( String let, int sz)
    {
        String output="";
        for(int i = 0; i < sz; i++){
            for(int j = 0; j < i; j++){
                output += " ";
            }
            for(int j = 0; j < sz - i; j++){
                output += let;
            }
            output += "\n";
        }
        return output;
    }
}