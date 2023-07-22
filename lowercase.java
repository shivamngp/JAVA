import java.util.*;
public class lowercase {
    public static String toLowerCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toLowerCase(str.charAt(0));
        sb.append(ch);
        for (int i=1; i<str.length();i++) {
            if(str.charAt(i) == ' '&&i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args[]){
        //String str = "hi, i am shivam raj singh.";
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Returned String is : ");
        System.out.println(toLowerCase(str));
    }
}
