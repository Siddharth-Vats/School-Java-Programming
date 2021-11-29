public class program17 {
    void input(String s){
        String ns = s.toLowerCase();
        ns += " ";
        String nw = "",st = "",nst = "";
        for (int i = 0; i < ns.length(); i++) {
            char ch = ns.charAt(i);
            if(ch != ' ')
            st += ch;
            else{
                char ch1 = st.charAt(0);
                int asc = (int) ch1 - 32;
                char ch2 = (char) asc;
                for (int j = 1; j < st.length(); j++) {
                     char c = ns.charAt(j);
                    nw = nw + c;
                }
                nw = ch2 + nw + ' ';
                nst += nw;
                nw = "";
                st = "";
            }
        }
        System.out.println("new word : "+nst);
    }
    public static void main(String[] args) {
        program17 program17 = new program17();
        program17.input("siddharth is Good");
    }
}
