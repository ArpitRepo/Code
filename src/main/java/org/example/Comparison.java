package org.example;

public class Comparison {

    //String stringValue = Integer.toString(integerValue);

    //Additional Info :- List<Integer> lst = new ArrayList(); lst.addAll(lst1); lst.addAll(lst2);
    static int meth(){
        int max = Math.max(3,5);
        return max;
    }

    static int met(){

        int left = 0;
        int right =0;
        int max =0;

        String st = "()()";
        for(int i=0; i<st.length();i++){
            if(st.charAt(i)=='('){
                left++;
            }else{
                right++;
            }
            if(right==left){
                max= Math.max(max,left*2);
            } else if (right>left) {
                left=0;
                right=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Comparison.meth();
        int value = Comparison.met();
        System.out.println(value);
    }




}

