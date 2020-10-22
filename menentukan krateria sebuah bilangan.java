import  java.util.Scanner ;
 nomor kelas  umum {
	int num;
	Scanner Scan =  baru  scanner ( Sistem . Di);

	nomor () {
		Sistem . keluar . cetak ( " ------------------------------------ \ n " );
		Sistem . keluar . cetak ( " Nama: Willyta Asmara Diya Abadi \ n " );
		Sistem . keluar . cetak ( " NIM: 19051397017 \ n " );
		Sistem . keluar . cetak ( " Prodi: D4 Manajemen Informatika \ n " );
		Sistem . keluar . cetak ( " ------------------------------------ \ n " );
		Sistem . keluar . print ( " Nomor masukan: " );
		num = scan . nextInt ();
		Sistem . lineSeparator ();
	}

	void  checkLessGre () {
		jika (num <  0 ) {
			Sistem . keluar . cetak (num +  " adalah bilangan Negatif " );
		}
		lain {
			Sistem . keluar . cetak (num +  " adalah bilangan Positif " );
		}
	}

	void  checkEvenOdd () {
		jika (num %  2  ==  0 ) {
			Sistem . keluar . println ( " Genap! " );
		}
		lain {
			Sistem . keluar . println ( " Ganjil! " );
		}
	}

	batal  cek () {
		checkLessGre ();
		checkEvenOdd ();
	}

	public  static  void  main ( String [] args ) {
		nomor obj =  nomor baru ();
		obj . memeriksa();
	}

}
