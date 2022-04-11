public class Delallcharacters {
    public static void main(String[] args) {
        String s = "usha satya durga manisri";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(i, i + 1).equals(s.substring(j, j + 1)) && j != i) {
                    s = s.replace(s.substring(i, i + 1), "");// single line change from dispDuplicateChar
                    i--;
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
