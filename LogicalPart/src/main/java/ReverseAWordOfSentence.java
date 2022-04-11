public class ReverseAWordOfSentence {
    public static void main(String[] args) {
        String sentence="Hi, I am Harsha Welcome to my page";
        String[] splitStr=sentence.split(" ");
        StringBuffer sb;
        for(int i=0;i<splitStr.length;i++){
            sb=new StringBuffer(splitStr[i]);
            System.out.print(sb.reverse()+" ");

        }
    }
}
