public class DuplicateCharactersInString {
    public static void main(String[] args){
        String s="harsha";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.substring(i,i+1).equals(s.substring(j,j+1))&& j!=i){
                    System.out.println(s.substring(i,i+1));
                }
            }
        }
    }
}
