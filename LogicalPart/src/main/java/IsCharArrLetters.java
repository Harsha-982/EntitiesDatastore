public class IsCharArrLetters {
    public static void main(String[] args) {
        String s ="kaljfkla1";
        char[] c =s.toCharArray();

        boolean flag=true;
        for(int i=0;i<c.length;i++){

           if(Character.isDigit(c[i])){
               System.out.println("we have digit");
               flag=false;
               break;
           }
        }
        if(flag){
            System.out.println("Purely string");
        }
    }
}
