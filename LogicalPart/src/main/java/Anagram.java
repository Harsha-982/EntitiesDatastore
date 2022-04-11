public class Anagram {
    private static boolean flag=true;

    public static void main(String[] args) {
        String s="124abc";
        String b="a1b24c";
        char[] c1=s.toCharArray();
        char[] c2=b.toCharArray();
        int[] a= new int[256];
        for(int i=0;i<c1.length;i++){
            a[c1[i]]++;
            a[c2[i]]--;
        }
        for(int i=0;i<256;i++){
            if(a[i]!=0){
                System.out.println("not anagram");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Anagram");
        }
    }
}
