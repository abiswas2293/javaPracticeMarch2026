package JavaPractice;

import java.util.HashMap;

public class repeatingCharacter1 {
    public static void main(String args[]) {
        String s = "Programgme";//r=2,g=2,m=2
        char c[] = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    temp++;
                    hm.put(c[i], temp);
                }
            }
        }
        System.out.println(hm);
    }
}
