package tb_java;

public class Tampil extends RuangKelas{
	
public void ListInputan(){
		
		System.out.println(""+super.getNamaruang());
		System.out.println(""+super.getLokasiruang());
		System.out.println(""+super.getStudi());
		System.out.println(""+super.getPanjang());
		System.out.println(""+super.getLebar());
		KondisiRKelas a = new KondisiRKelas();
		System.out.println(" Hasil = "+a.Hitungluas());
		System.out.println(""+a.BentukRuang());
		System.out.println(""+super.getJumlahkursi());
		System.out.println("luas rasio = "+a.rasio());
		System.out.println(""+super.getJumlahpintu());
		System.out.println(""+super.getJumlahjendela());
		System.out.println(""+a.AnalisaPintu());
		System.out.println(""+a.AnalisaJendela());
		System.out.println(""+super.getJumlahstopkontak());
		System.out.println(""+super.getKondisistopkontak());
		System.out.println(""+super.getPosisistopkontak());
		JmlhKondisiPosisiSarana b = new JmlhKondisiPosisiSarana();
		System.out.println(""+b.AnalisaKelistrikan());
		System.out.println(""+super.getKabelLCD());
		System.out.println(""+super.getKondisikabelLCD());
		System.out.println(""+super.getPosisikabelLCD());
		System.out.println(""+b.AnalisisLCD());
		System.out.println(""+super.getJumlahlampu());
		System.out.println(""+super.getKondisilampu());
		System.out.println(""+super.getPosisilampu());
		System.out.println(""+b.AnalisisLampu());
		System.out.println(""+super.getJumlahkipasangin());
		System.out.println(""+super.getKondisikipasangin());
		System.out.println(""+super.getPosisikipasangin());
		System.out.println(""+b.AnalisisKipas());
		System.out.println(""+super.getJumlahAC());
		System.out.println(""+super.getKondisiAC());
		System.out.println(""+super.getPosisiAC());
		System.out.println(""+b.AnalisisAC());
		System.out.println(""+super.getSSID());
		System.out.println(""+super.getBandwidth());
		System.out.println(""+b.AnalisisInternet());
		System.out.println(""+super.getJumlahCCTV());
		System.out.println(""+super.getKondisiCCTV());
		System.out.println(""+super.getPosisiCCTV());
		System.out.println(""+b.AnalisisCCTV());
		System.out.println(""+super.getKondisilantai());
		System.out.println(""+super.getKondisidinding());
		System.out.println(""+super.getKondisiatap());
		System.out.println(""+super.getKondisipintu());
		System.out.println(""+super.getKondisijendela());
		LingkunganRuangKelas c = new LingkunganRuangKelas();
		System.out.println(""+c.AnalisisKebersihan());
		System.out.println(""+super.getSirkulasiudara());
		KebersihanRuangKelas d = new KebersihanRuangKelas();
		System.out.println(""+d.AnalisisPencahayaan());
		System.out.println(""+d.AnalisisKelembapan());
		System.out.println(""+d.AnalisisSuhu());
		KenyamananRuangKelas e = new KenyamananRuangKelas();
		System.out.println(""+e.AnalisisKebisingan());
		System.out.println(""+super.getBau());
		System.out.println(""+e.AnalisisBau());
		System.out.println(""+super.getKebocoran());
		System.out.println(""+e.AnalisisKebocoran());
		System.out.println(""+super.getKerusakan());
		System.out.println(""+e.AnalisisKerusakan());
		System.out.println(""+super.getKeausan());
		System.out.println(""+e.AnalisisKeausan());
		System.out.println(""+super.getKekokohan());
		KeamanaRuangKelas f = new KeamanaRuangKelas();
		System.out.println(""+f.AnalisisKekokohan());
		System.out.println(""+super.getKuncipintu());
		System.out.println(""+f.AnalisisKunciPintu());
		System.out.println(""+super.getKuncijendela());
		System.out.println(""+f.AnalisisKunciJendela());
		System.out.println(""+super.getBahaya());
		System.out.println(""+f.AnalisisKeamananRuang());
	}
}
	
