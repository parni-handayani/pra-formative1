import java.util.*;
public class HashMapExample1{
 public static void main(String args[]){
   HashMap<Integer,String> map=new HashMap<Integer,String>();
   map.put(1,"Mango");
   map.put(2,"Apple");
   map.put(3,"Banana");
   map.put(4,"Grapes");
   map.put("pisang","Pisang");                     //map.put(5,"Pisang");

   System.out.println("Iterating Hashmap...");
   for(Map.Entry m  : map.entrySet()){                       //for(Map.Entry<Integer, String> m  : map.entrySet()){ 
    System.out.println(m.getKey()+" "+m.getValue());
   }
  }
}

/* 
Menurut pendapat saya mengenai code diatas, code diatas akan mengalami error.
karena key pada baris ke-9 diisi dengan String sedangkan object Hashmap yang bernama map dibuat 
dengan key: Integer dan Value: String.
Kemudian, pada baris ke-12 dimana variabel m belum memiliki tipe data untuk key dan value yang akan disimpan.
*/


