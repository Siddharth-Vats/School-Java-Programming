// WAP to input a sentence. Change all the first letter in upper case and rest of the alphabets in lower case.
public class program18 {
    void input(String s) {
        char n = ' ';
        String ns = s.toLowerCase();
        for (int i = 0; i < ns.length(); i++) {
            char ch = ns.charAt(i);
            if (ch != ' ') {
                ns+=ch;
        //     }
        //     System.out.println("new word: "+ ns);}
        // }
            } else {
                char ch1 = s.charAt(0);
                int asc = ch1;
                asc = (char) asc;
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    n = (char) (n + c);
                }
                ns = ns+ch1+n+' ';   
                s = "";
            }
            
        }
        System.out.println("new word: " +ns);
    }
    public static void main(String[] args) {
        program18 program18 = new program18();
        program18.input("My name is siDDhaRtH VaTs");
    }
    
}
