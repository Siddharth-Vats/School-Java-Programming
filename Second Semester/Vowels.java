// WAP to input a word and print the frequency of vowels.

public class Vowels {
    public static void main(String[] args) {
        String w = "Siddharth";
        int f = 0;
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if(ch == 'A' || ch == 'a' ||ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' ||ch == 'u'){
                f++;
            }
        }
        System.out.println(f+" is the frequency of vowels");
    }
}
