import  java.util.Scanner ;
 kelas  publik DERET {
	int a, b, n;
	Scanner Scan =  baru  scanner ( Sistem . Di);

	DERET () {
		System.out. cetak ("------------------------------------ \ n ");
		System.out. cetak (" Nama   : Willyta Asmara Diya Abadi \ n ");
		System.out. cetak (" NIM    : 19051397017 \ n ");
		System.out. cetak (" Prodi : D4  Manajemen  Informatika \ n ");
		System.out. cetak ("------------------------------------ \ n ");
		System.out. print (" Input  nilai  awal :");
		a = memindai. nextInt ();
		Sistem. lineSeparator ();

		System.out. print (" Input  beda :");
		b = pindai. nextInt ();
		Sistem. lineSeparator ();

		System.out. print (" Input  Jumlah  Deret :");
		n = pindai. nextInt ();
		Sistem. lineSeparator ();
	}

	void arithPro () {
		suhu int ;
		suhu = a;
		untuk ( int  i = 1 ; i <= n ; i ++) {
			Sistem . keluar . cetak (temp +  "  " );
			temp = temp + b;
		}
	}


	public static void main ( String [] args) {
		DERET obj =  DERET baru  ();
		obj. arithPro ();

	}

}
