fun main() {
    try {
        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toInt()
        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toInt()

                println("Hasil  tambah = ${angka1+angka2}")

                println("Hasil kurang = ${angka1-angka2}")

                println("Hasil  kali= ${angka1*angka2}")

                println("Hasil bagi = ${angka1/angka2}")



    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}