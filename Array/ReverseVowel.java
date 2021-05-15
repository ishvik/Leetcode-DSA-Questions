public class ReverseVowel {
    public String reverseVowels(String s) {
        String str = "";
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                list.add(ch);
            }
        }
        
        int j = list.size()-1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                str = str+list.get(j);
                j--;
            }else{
                str = str+ch;
            }
        }
        return str;
    }
}
