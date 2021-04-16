class LongPressName {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        
        while(i<name.length()&&j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else{
                if(j == 0){
                    return false;
                }
                if(typed.charAt(j) != typed.charAt(j-1)){
                    return false;
                }else{
                    j++;
                }
            }
        }
        
        if(i != name.length()){
            return false;
        }
        
        while(j<typed.length()){
            if(j == 0){
                return false;
            }else if(typed.charAt(j) != typed.charAt(j-1)){
                return false;
            }else{
                j++;
            }
        }
        return true;
    }
}