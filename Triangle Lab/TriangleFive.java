
import static java.lang.System.*;

public class TriangleFive
{
   public static String createTriangle( String let, int sz)
    {
        String output="";
        for(int i = 0; i < sz; i++){
            char cur = let.charAt(0);
            for(int j = 0; j < sz- i; j++){
                for(int k = 0; k < sz - j; k++){
                    output += cur;
                }
                if(cur == 'Z'){cur = 'A';}
                else if(cur == 'z'){cur = 'a';}
                else{cur++;}
                output += " ";
            }
            output += "\n";
        }
        return output;
    }
}