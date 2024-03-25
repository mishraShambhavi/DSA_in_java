import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class lecture60 {
    static void HashMapMethods(){
        HashMap<String,Integer> pa=new HashMap<>();
        //adding elements
        pa.put("shambhavi",20);  //key,value
        pa.put("Akash",23);
        pa.put("Mohan",76);
        pa.put("Dev",32);

        //getting value of a key from hashmap
        System.out.println(pa.get("shambhavi"));
        System.out.println(pa.get("rahul"));

        //changing/update value of a key
        pa.put("Akash",25);   //no new entry is put only existing is changed
        System.out.println(pa.get("Akash"));

        //removing a pair from hashmap
        System.out.println(pa.remove("Mohan"));
        System.out.println(pa.remove("cutie"));

        //checking if key exist or not
        System.out.println(pa.containsKey("Dev"));  //true/false
        if (!pa.containsKey("Yash")) pa.put("Yash",30);
        //or
        pa.putIfAbsent("yahika",32);  //will enter
        pa.putIfAbsent("Yash",32);    //will not enter

        //get all keys,values,entries in any RANDOM ORDER
        System.out.println(pa.keySet());
        System.out.println(pa.values());
        System.out.println(pa.entrySet());

        //traversing
        for (String key:pa.keySet()){   //key se value
            System.out.printf("Age of %s is %d\n",key,pa.get(key));
        }
        System.out.println();
        for (Map.Entry<String,Integer> e :pa.entrySet()){   //entries se traverse
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for (var e:pa.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
    static int mostFreqElement(int[] arr){
        HashMap<Integer,Integer> mp =new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            if (mp.containsKey(arr[i]) == false) {
                mp.put(arr[i],1);   //insert
            }else {
                int prevValue=mp.get(arr[i]);
                mp.put(arr[i],prevValue+1);   //update
            }
        }
        System.out.println(mp.entrySet());
        int maxfreq=-1;
        int anskey=-1;
        for (var e:mp.entrySet()){
            if (e.getValue()>maxfreq){
                maxfreq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", anskey,maxfreq);
        System.out.println(

        );
        return anskey;
    }

    //CUSTOM HASHMAP IMPLEMENTATION
    static class MyHashMap<k,v>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float LOAD_FACTOR =0.75f;
        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){ //capacity-N
            buckets=new LinkedList[N];
            for (int i=0;i< buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

        }
        private int hashFunction(k key){
            int hc=key.hashCode();
            return Math.abs((hc))% buckets.length;

        }
        private int searchInbucket(LinkedList<Node> ll,k key){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>[] oldbucket=buckets;
            n=0;
            initBuckets(oldbucket.length*2);
            for (var bucket:oldbucket){
                for (var node: bucket){
                    put(node.key,node.value);
                }
            }
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }
        public void put(k key,v value){
            int bi=hashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInbucket(currBucket,key);
            if (ei==-1){
                Node node=new Node(key,value);
                currBucket.add(node);
                n++;
            }else{
                Node currNode=currBucket.get(ei);
                currNode.value=value;

            }
            if (n>=buckets.length*LOAD_FACTOR){
                rehash();
            }

        }
        public v get(k key){
            int bi=hashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInbucket(currBucket,key);
            if (ei!=-1){
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }else
                return null;

        }
        public v remove(k key){
            int bi=hashFunction(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInbucket(currBucket,key);
            if (ei!=-1){
                Node currNode=currBucket.get(ei);
                v val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }else return null;
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
        System.out.println();
        int[] arr={1,3,2,1,4,1};
        System.out.println(mostFreqElement(arr));
        System.out.println("CUSTOM HASHMAP");

        MyHashMap<String,Integer> mp1 =new MyHashMap<>();
        mp1.put("a",1);
        mp1.put("b",2);
        mp1.put("c",3);
        mp1.put("d",4);
        mp1.put("c",30);
        System.out.println("size is-"+mp1.size());

        System.out.println(mp1.get("a"));
        System.out.println(mp1.get("b"));
        System.out.println(mp1.get("c"));
        System.out.println(mp1.get("d"));

        System.out.println(mp1.remove("b"));
        System.out.println(mp1.remove("b"));
        System.out.println("size is-"+mp1.size());


    }

}
