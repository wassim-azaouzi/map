import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("here come the sun", "it's alright tararara");
        userMap.put("hallelujah", "david played but you dont care about music do ya");
        userMap.put("uptown funk", "come on you own it ");
        userMap.put("hotel california", "such a lovely place such a lovely face ");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}

