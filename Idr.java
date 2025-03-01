import java.util.*;
// INsert Delete Randomget program

class Randomget {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random random;

    public Randomget() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;

    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastValue = list.get(list.size() - 1);
        list.set(index, lastValue);
        map.put(lastValue, index);
        map.remove(val);
        return true;

    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);

    }
}

public class Idr {
    public static void main(String[] args) {
        Randomget obj = new Randomget();
        System.out.println(obj.insert(10));
        System.out.println(obj.insert(20));
        System.out.println(obj.insert(30));
        System.out.println(obj.remove(20));
        System.out.println(obj.getRandom());
    }

}