public class mahasiswa {
    private String NIM,NAMA;

    public void dataMhs(){
        System.out.println("Menampilkan data Mahasiswa");
    }
    public void dataMhs(String N){
        this.NIM = N;

        System.out.println("Data Mahasiswa : ");
        System.out.println("NIM : "+this.NIM);
    }
    public void dataMhs(String N1, String N2){
        this.NIM = N1;
        this.NAMA = N2;

        System.out.println("Data Mahasiswa");
        System.out.println("NIM : "+this.NIM);
        System.out.println("NAMA : "+this.NAMA);
    }
}
