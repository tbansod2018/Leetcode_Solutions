package Leetcode;

public class StrongPasswordChecker2299 {

    public static boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        boolean num = false;
        boolean upp = false;
        boolean low = false;
        boolean special = false;
        boolean same = true;

        same = sameChar(password);
        if(!same){
            return false;
        }

        //loop to check uppercase
        for(int i = 0 ; i < password.length() ; i++){
            if(isUpper(password.charAt(i))){
                upp = true;
                break;
            }
        }

        //loop to check lowercase
        for (int i = 0 ; i < password.length() ; i++){
            if(isLower(password.charAt(i))){
                low = true;
                break;
            }
        }

        //loop to check number
        for(int i = 0 ; i < password.length() ; i++){
            if(isNum(password.charAt(i))){
                num = true;
                break;
            }
        }
        //loop to check special character
        for(int i = 0 ; i < password.length() ; i++){
            if(specialChar(password.charAt(i))){
                special = true;
                break;
            }
        }


        if(num && upp && low && special){
            return true;
        }
        return false;

    }

    //function to check uppercase
    public static boolean isUpper(char c){
        if(c>='A' && c<= 'Z'){
            return true;
        }
        return false;
    }

    //function to check lowercase
    public static boolean isLower(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }

    //function to check number
    public static boolean isNum(char c){
        if(c>='0' && c<='9'){
            return true;
        }
        return false;
    }

    //function to check special character
    public static boolean specialChar(char c){
        String s = "!@#$%^&*()-+";
        if(s.contains(c+"")){
            return true;
        }
        return false;
    }

    //function to check adjacent characters are same or not
    public static boolean sameChar(String s){
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
    }
}
