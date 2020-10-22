import  java.util.Scanner ;
 kelas  publik ConanNovel {
	Judul string , penulis, desc;
	int tahun, buyPrice, sellPrice;
	Scanner Scan =  baru  scanner ( Sistem . Di);

	// konstruktor
	ConanNovel ( String  t , String  w , String  d , int  y , int  bp ) {
		ini . judul = t;
		ini . penulis = w;
		ini . desc = d;
		ini . buyPrice = bp;
	}

	void  showTitle () {
			Sistem . keluar . println ( " Judul: "  +  ini . title);
	}

	void  showItemData () {
		Sistem . keluar . println ( " Judul: "  +  ini . title);
		Sistem . keluar . println ( " Penulis: "  +  penulis ini . );
		Sistem . keluar . println ( " Deskripsi: "  +  this . desc);
		Sistem . keluar . println ( " Tahun Penerbit: "  + tahun  ini . );
		Sistem . keluar . println ( " Harga Novel: "  +  ini . buyPrice);
	}


	public  static  void  main ( String [] args ) {
		int n =  0 , x, bp, y;
		String t, w, d;

		Scanner Scan =  baru  scanner ( Sistem . Di);
		ConanNovel [] obj =  ConanNovel baru  [ 3 ];

		// masukan deskripsi novel
		Sistem . keluar . cetak ( " ------------------------------------ \ n " );
		Sistem . keluar . cetak ( " Nama: Willyta Asmara Diya Abadi \ n " );
		Sistem . keluar . cetak ( " NIM: 19051397017 \ n " );
		Sistem . keluar . cetak ( " Prodi: D4 Manajemen Informatika \ n " );
		Sistem . keluar . cetak ( " ------------------------------------ \ n " );
		Sistem . keluar . println ( " Silahkan masukan data novel " );
		sementara (n <  3 ) {
			x = n + 1 ;
			Sistem . keluar . println ( " Data ke- "  + x);

			Sistem . keluar . print ( " Judul: " );
			t = pindai . lanjut();
			Sistem . lineSeparator ();

			Sistem . keluar . cetak ( " Penulis: " );
			w = pindai . lanjut();
			Sistem . lineSeparator ();

			Sistem . keluar . cetak ( " Deskripsi: " );
			d = memindai . lanjut();
			Sistem . lineSeparator ();

			Sistem . keluar . cetak ( " Tahun Penerbit: " );
			y = pindai . nextInt ();
			Sistem . lineSeparator ();

			Sistem . keluar . cetak ( " Harga Novel: " );
			bp = pindai . nextInt ();
			Sistem . lineSeparator ();
			obj [n] =  ConanNovel baru  (t, w, d, y, bp);
			n ++ ;
		}

		Sistem . lineSeparator ();
		Sistem . keluar . println ( " ================= " );
		Sistem . keluar . println ( " Daftar Data: " );
		Sistem . keluar . println ( " ================= " );
		untuk ( int z =  0 ; z <  3 ; z ++ ) {
			obj [z] . showItemData ();
		}
	}
}
