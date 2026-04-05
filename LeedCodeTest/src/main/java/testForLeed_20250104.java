import java.util.HashMap;
import java.util.Map;

public class testForLeed_20250104 {

    public static void main(String[] args) {
        climbStairs(5);
    }

    //爬楼梯--递归实现
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int result = 0; //N台阶有result走法
        Map<Integer,Integer> smap = new HashMap<>();
        if(smap.get(n)!=null){
            return smap.get(n);
        }else{
            result = climbStairs(n-1)+climbStairs(n-2);
            smap.put(n,result);
            return result;
        }

    }
}
