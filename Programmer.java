public class Programmer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji Anda sebagai Programmer sebesar = Rp. "+gaji);
		}else {
			System.out.println("Berapapun gajinya Bersyukurlah");
		}
	}
}