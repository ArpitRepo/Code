package Practice;

import java.util.List;
import java.util.Objects;

public class LogicCreationListStreams {

    static boolean meth(List<String> lst, List<String> lst1){
        if(lst1.size()!=lst.size()){
            return false;
        }
        else{
            for (int i=0;i<lst.size();i++){
                if(!Objects.equals(lst.get(i),lst1.get(i))){
                    return false;
                }
            }
        }

        return true;
    }

 /*   public static void main(String[] args) {
        LogicCreationListStreams.,meth(["abc","def","hig"],["abc","def","hig"]);
    }*/
}
