public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Gaji Karyawan Perusahaan SW-House XYZ");
		System.out.println(" ");
		Designer d = new Designer();
		d.setNama("Syahrul Diyono");
		d.setAlamat("Desa Rambatan Wetan");
		d.setGaji(70);

		System.out.println(" ");
		Proman pm = new Proman();
		pm.setNama("Kastuti");
		pm.setAlamat("Desa Rambatan Kulon");
		pm.setGaji(90);

		System.out.println(" ");
		Programmer p = new Programmer();
		p.setNama("Diyanto");
		p.setAlamat("Desa Sukasari");
		p.setGaji(100);

	}
}