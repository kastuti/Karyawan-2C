public class Designer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji Anda sebagai Designer sebesar = Rp."+gaji);
		}else{
			System.out.println("Berapapun gajinya Bersyukurlah");
		}
	}
}