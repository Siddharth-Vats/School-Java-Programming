// WAP to input a word and print all those alphabets whose index no. is odd.

class Word {
    public static void main(String[] args) {
        String w = "Siddharth";
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if(i%2!=0){
                System.out.println(ch);
            }
        }
    }
}