package Practice;

public class Sample {
    public static void main(String[] args) {
        for(int i=3;i<10;i++){
            isPrime(i);
        }
    }
    static void isPrime(int j){
        int flag=0;
        for(int i =2;i<j;i++){
            if(j%i==0){
              ++flag;
              break;
            }
        }

        if(flag==0){
            System.out.println(j);
        }
    }
}
