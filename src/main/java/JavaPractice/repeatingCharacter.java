package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class repeatingCharacter {


    public static void main(String args[]) {
        String s = "programgmingr";//r=2,m=2,g=3
        char c[] = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < c.length; i++) {

            if (hs.contains(c[i]))
                continue;

            int temp = 1;//i =4 // c[4] = r

            for (int j = i + 1; j < c.length; j++) {

                if (c[i] == c[j]) {
                    hs.add(c[i]);// r
                    temp++;
                }
            }
            if(temp>1)
                System.out.println(c[i] + "=" + temp);
        }
    }
}
