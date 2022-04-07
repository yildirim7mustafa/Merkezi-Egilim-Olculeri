package permutasyonVkombinasyon;


// n!/(n-r)!
// n!/r!.(n-r)!
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faktoriyel: "+faktoriel(140));
		System.out.println("Permutasyon: "+permutasyon(140, 5));
		System.out.println("Kombinasyon: "+kombinasyon(140, 5));
		
		
	}

	 public static double faktoriel(int sayi) {
		 double temp = 1;
		 for(int i = sayi; i > 0 ; i--) {
			temp = i*temp;
			
		}
		
		return temp;
	}
	 
	 public static double permutasyon(int n,int r) {
		 double sonuc = 0;
		 
		 if((n-r) == 0) {
			 System.out.println("Hata payda sifir");
			 return -1;
		 }
		 
		 sonuc = faktoriel(n) / faktoriel(n-r);
		 
		 
		 
		 return sonuc;
	 }
	 
	 public static double kombinasyon(int n,int r) {
		 double sonuc = 0;
		 
		 if((n-r) == 0) {
			 System.out.println("Hata payda sifir");
			 return -1;
		 }
		 
		 sonuc = faktoriel(n) / (faktoriel(n-r) * faktoriel(r));
		 
		 return sonuc;
	 }
	 
	 
}
