import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());

        LRU<Integer,Integer> lru = new LRU(size);

        while(in.hasNext()){
            String input = in.nextLine();
            String[] strs = input.split(" ");
            if(strs[0].equals("p")){
                lru.put(Integer.parseInt(strs[1]), Integer.parseInt(strs[2]));
            }else if(strs[0].equals("g")){
                Integer res = lru.get(Integer.parseInt(strs[1]));
                if(res == null){
                    System.out.println(-1);
                }else{
                    System.out.println(res);
                }
            }
        }

    }
}

class LRU<K,V>{
    final int CAPCITY;
    LinkedHashMap<K,V> map;

    public LRU(int capcity){
        this.CAPCITY = capcity;
        this.map = new LinkedHashMap<K,V>((int) Math.ceil(capcity / 0.75f) + 1,0.75f,true){
            private static final long serialVersionUID = 1L;
 
			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
                return size() > LRU.this.CAPCITY;
            }

        };
    }

    public V get(K key){
            return map.get(key);
    }

    public V put(K key, V value){
        return map.put(key, value);
    }

}