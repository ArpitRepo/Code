package Practice;

public class Check {
    static String str = "tad";
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean  i(){

        if("a".equalsIgnoreCase("a")){

            return false;
        }else{

        }
        return true;

    }

    static void m(){
        StringBuilder d = new StringBuilder();
        d.append("hello");
        System.out.println(d.toString().split(""));

        String v = "heya";
      String vk[]=  v.split("");
        System.out.println(vk.toString());
    }

    public static void main(String[] args) {
m();

    }
}
