// @Author 20101061 Putu Indra Cahyadi
// Method Overloading

public class prak7lat1 {
    public static void main(String[] args) {
        mahasiswa MHS = new mahasiswa();

//        Overloading
        MHS.dataMhs(); // Tanpa Parameter
        MHS.dataMhs("20101061"); // Menggunakan 1 Parameter
        MHS.dataMhs("20101061", "Sawadikhap"); // Menggunakan 2 Parameter
    }
}
