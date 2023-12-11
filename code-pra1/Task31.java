/* 
mengimport library utilitas, sehingga nantinya kita dapat menggunakan class - class yang ada pada library tersebut. 
seperti ArrayList dan Iterator
*/
import java.util.*;

/* 
- Kata kunci public berarti bahwa object/method/atribut dapat diakses oleh class lain. 
- Kata kunci class digunakan unutk membuat sebuah class.
- dikarenakan itu, public class Task31 berfungsi untuk mendeklarasikan sebuah class dengan nama "Task31", 
yang mana object/method/atribut yang terdapat dalam block class dapat diakses oleh class lain atau bersifat public.
- Dalam program Java nama class harus sama dengan nama file.
*/
public class Task31 {

/* 
  - kata kunci static berfungsi untuk membuat sebuah method tidak perlu diinstansiasi terlebih dahulu.
  - kata kunci void merupakan methode yang tidak mengembalikan nilai apapun atau kosong. 
  - Sehingga void main berarti methode utama yang tidak mengembalikan nilai apapun dan juga bersifat public. 
  methode main adalah titik awal program dieksekusi.
  - Methode main juga menerima parameter String[] args yang merupakan array dari objek String 
  yang dapat digunakan untuk memberikan argumen kepada program saat program dijalankan dari baris perintah.
  */
  public static void main(String args[]) {

    // Membuat object ArrayList yang bernama list yang berisikan objek String.
    ArrayList<String> list = new ArrayList<String>();

    // Menambahkan elemen-elemen kedalam ArrayList yang bernama list, elemen yang ditambahakan merupakan string
    list.add("Mango");
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");

    // Membuat object Iterator yang bernama itr untuk melakukan iterasi atau perulangan pada elemen - elemen ArrayList
    Iterator<String> itr = list.iterator();

    // periksa apakah masih ada elemen selanjutnya
    while (itr.hasNext()) {
    // jika iya, tampilkan elemen saat ini kemudian lanjut ke elemen berikutnya
      System.out.println(itr.next());
    }
  }
}


/*
Output:
Mango
Apple
Banana
Grapes
*/

/* 
Untuk perbedaan antara Task31.java dan Task32.java yaitu: 
pada Task31 yang ditampilkan diconsole ialah elemen - elemen dari ArrayListnya, sedangkan pada Task32 yang ditampilkan diconsole ialah ArrayListnya.
*/