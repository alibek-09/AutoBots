import java.util.*;
import java.util.stream.Collectors;

public class Draft {
    public static void main(String[] args) {


    }
    int max = 0;
    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20){
            if (a > b ){
                return max = a;
            }else {
                return max = b;
            }
        }else {
            return 0;
        }
    }

}