public class Proman extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=90){
			System.out.println("Gaji Anda sebagai Project Manager = Rp. "+gaji);
		}else{
			System.out.println("Berapapun gajinya Bersyukurlah");
		}
	}
}