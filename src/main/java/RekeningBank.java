public class RekeningBank {

    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo + "\n");
    }

    void setorUang(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor " + jumlah + " Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setoran tidak boleh 0 atau minus!");
        }
    }

    void tarikUang(double jumlah){
        if (jumlah > saldo){
            System.out.println(namaPemilik + " menarik " + jumlah + " (Gagal. Saldo tidak mencukupi) Saldo saat ini: " + saldo);
        } else if (jumlah <= 0) {
            System.out.println("Gagal. Jumlah uang yang ditarik tidak boleh 0 atau minus!");
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik " + jumlah + " (Berhasil) saldo sekarang: " + saldo);
        }
    }
}
