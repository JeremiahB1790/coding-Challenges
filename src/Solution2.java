import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> abracadabra(int n) {
       //int i = 0;
       List<String> input = new ArrayList<>();
       String a = "abraca";
       String b = "dabra";
       String c = "abracadabra";


        if(n % 3==0 && n % 5 == 0 ){

            for(int i = 1; i < n ;i++) {
                String conversion = String.valueOf(i);
                input.add(conversion);
            }
            input.add(a);
            for(int i = 1; i < n;i++) {
                String conversion = String.valueOf(i);
                input.add(conversion);
            }

            input.add(b);
            for(int i = 1; i < n;i++) {
                String conversion = String.valueOf(i);
                input.add(conversion);
            }
            input.add(c);
    return input;
        }
        else if(n % 3 == 0){
            for(int i = 1; i < n;i++) {
                String conversion = String.valueOf(i);
                input.add(conversion);
            }
            input.add(a);
    return input;
        }
        else if(n % 5 == 0){
            for(int i = 1; i < 3;i++) {
                String conversion = String.valueOf(i);
                input.add(conversion);

            }
            input.add(a);
            input.add(b);
            return input;
        }
        else{

            String conversion = String.valueOf(n);
            input.add(conversion);
            return input;

        }

    }

}