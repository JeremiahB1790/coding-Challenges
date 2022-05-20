import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String reverseString(String s) {
        char character;
        String t = "";
int i =0;
boolean set = true;
        while(set == true){
            if(t.length() != s.length()) {
                character = s.charAt(i);
                t = character + t;
                i++;
            }
            else {
                set = false;
            }
        }

return t;
    }

}