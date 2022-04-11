import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args) {
        String s="regex";
        System.out.println(Pattern.matches("s",s));
        System.out.println(Pattern.matches("[regx]+",s));//
//         one letter only once specified in Square brackets returns true
//     " + " indicates occurrence of any number of letter multiple times
        System.out.println(Pattern.matches("[^abc]+",s));
        System.out.println(Pattern.matches("[a-zA-Z]+",s));// to check if a string has only alhpabets
        System.out.println(Pattern.matches("[0-9a-z][^f-k]+","1234abc"));
//        [a-el-z]
        System.out.println(Pattern.matches("\\W","@"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "953038949"));
//        {} indicates length of the string
    }
}
