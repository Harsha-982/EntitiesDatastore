public class dispDuplicateCharOnlyOnce {
    public static void main(String[] args){
        String s1="ushasatyadurgamanisri";
        StringBuffer s=new StringBuffer(s1);
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.substring(i,i+1).equals(s.substring(j,j+1))&& j!=i){
//                     s=s.replaceFirst(s.substring(i,i+1),"");
                    s=s.replace(i,i+1, "");
                    i--;
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
