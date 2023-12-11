/* 
- Kata kunci public berarti bahwa object/method/atribut dapat diakses oleh class lain. 
- Kata kunci class digunakan unutk membuat sebuah class.
- dikarenakan itu, public class Task1 berfungsi untuk mendeklarasikan sebuah class dengan nama "Task1", 
yang mana object/method/atribut yang terdapat dalam block class dapat diakses oleh class lain atau bersifat public.
- Dalam program Java nama class harus sama dengan nama file.
*/

public class Task1 {
  /* 
  - kata kunci static berfungsi untuk membuat sebuah method tidak perlu diinstansiasi terlebih dahulu.
  - kata kunci void merupakan methode yang tidak mengembalikan nilai apapun atau kosong. 
  - Sehingga void main berarti methode utama yang tidak mengembalikan nilai apapun dan juga bersifat public. 
  methode main adalah titik awal program dieksekusi.
  - Methode main juga menerima parameter String[] args yang merupakan array dari objek String 
  yang dapat digunakan untuk memberikan argumen kepada program saat program dijalankan dari baris perintah.
  */
  public static void main(String[] args) {

    /* 
    - Mendeklarasikan variabel i dengan type data integer dan memberikan nilai awalnya 1.
    - Variabel i dideklarasikan dengan type data int yang berarti kita tidak dapat mengisikan nilai variabel i selain int.
    */
    int i = 1;

    /* 
    menjalankan block code yang ada didalam do sekali kemudian dilakukan pengecekan kondisi yang mana 
    jika masih terpenuhi maka perulangan do-while akan terus dijalankan.
    */
    do {

      // memeriksa apakah i sama dengan 5
      if (i == 5) {

        // Jika i sama dengan 5, tambahkan i dengan 1 lalu
        i++;

        // keluar dari perulangan
        break;
      }
      
      // menampilkan nilai i ke console/terminal
      System.out.println(i);

      // menambahkan nilai i dengan 1
      i++;
    } 
      // memeriksa apakah i kurang dari sama dengan 10, jika iya perulangan akan terus dijalankan.
      while (i <= 10);
  }
}


/* 
Output:
1
2
3
4
*/