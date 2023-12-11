/* 
- Kata kunci public berarti bahwa object/method/atribut dapat diakses oleh class lain. 
- Kata kunci class digunakan unutk membuat sebuah class.
- dikarenakan itu, public class Task2 berfungsi untuk mendeklarasikan sebuah class dengan nama "Task2", 
yang mana object/method/atribut yang terdapat dalam block class dapat diakses oleh class lain atau bersifat public.
- Dalam program Java nama class harus sama dengan nama file.
*/
public class Task2 {

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
    - Mendeklarasikan variabel age dengan type data integer dan memberikan nilai awalnya 25.
    - Variabel age dideklarasikan dengan type data int yang berarti kita tidak dapat mengisikan nilai variabel age selain int.
    */
    int age = 25;

    /* 
    - Mendeklarasikan variabel weight dengan type data integer dan memberikan nilai awalnya 48.
    - Variabel weight dideklarasikan dengan type data int yang berarti kita tidak dapat mengisikan nilai variabel weight selain int.
    */
    int weight = 48;

    // memeriksa apakah age lebih dari atau sama dengan 18
    if (age >= 18) {
    
        // jika iya, periksa apakah weight lebih dari 50
      if (weight > 50) {

        // jika iya, tampilkan di console "You are eligible to donate blood"
        System.out.println("You are eligible to donate blood");
      } 
        // jika tidak atau weight kurang dari atau sama dengan 50, 
        // tampilkan di console "You are not eligible to donate blood"
        else {
        System.out.println("You are not eligible to donate blood");
      }

    //   jika tidak atau age kurang dari 18, tampilkan "Age must be greater than 18"
    } else {
      System.out.println("Age must be greater than 18");
    }
  }
}



/* 
Output:
You are not eligible to donate blood
*/
