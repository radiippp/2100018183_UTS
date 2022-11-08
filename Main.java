public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Riski Adi Pangestu");
        System.out.println("NIM     : 2100018183");
        System.out.println("Kelas   : D");
        System.out.println("UTS");
        System.out.println("\n");
        Tendik tndk = new Tendik();
        tndk.setNama("Suprapto");
        tndk.setNip(12345678);
        tndk.setTglLahir("20/11/1990");
        tndk.setAlamat("Bandung");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2019);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(24112002);
        dsn.setNama("Takahiro Moriuchi S.Kom");
        dsn.setNip(213456789);
        dsn.setTglLahir("11/02/1985");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("Jakarta");
        dsn.setTahunMasuk(2017);

        System.out.println("Nama Tendik         : "+ tndk.getNama());
        System.out.println("NIP  Tendik         : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}