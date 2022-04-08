import java.util.ArrayList;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
	
		System.out.println("-basit-:");
		basitRas(20, 15,5);
		System.out.println("-sistematik-");
		sistematikRas(72, 9);
		
	}
	
	public static void diziGoster(int array[]) {
		System.out.print("Dizi: ");
		for (int i : array) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	
	
	// N = array.lenght  n = orneklem hacim
	public static void sistematikRas(int buyuk,int kucuk) {
		int sonuc;
		int k = buyuk/kucuk;
		Random r=new Random();
		int a=r.nextInt(k)+1;
		for(int i = 0; i < k-1; i++) {
			sonuc = a+(i*k);
			System.out.println((i+1)+".ci sayi: " +sonuc);
		}
	}
	
	public static int degerAra(int[] dizi, int aranan) {
		int donen_deger= 1;
		for(int i = 0; i < dizi.length; i++) {
			if(dizi[i] == aranan)
			donen_deger = -1;
		}
		return donen_deger;
	}
	
	
	public static void basitRas(int buyuk,int kucuk,int n) {
		Random r = new Random();
		int a;
		int sayac = 0;
		int[] array = new int[n];
		boolean control = true;
		
		while(control) {
			
			a = kucuk + r.nextInt(buyuk-kucuk);
			int k = degerAra(array, a);
			
			if(k != -1) {
				array[sayac] = a;
				sayac++;
			}
			
			
			if(sayac == n) {
				control = false;
			}
		}
		for(int i = 0; i < array.length; i++)
			System.out.println(i+".ci sayi: "+array[i]);		
	}
	
	
}
/*
 * 
		for(int i = 0; i < sayiAdedi; i++) {	
			int sayac =0; 
			Random r = new Random();
			int temp = buyuk-kucuk;
			while(sayac < sayiAdedi) {
				int a = kucuk + r.nextInt(temp);
				for (Integer integer : list) {
					if(integer != a) {
						list.add(a);
						sayac++;
					}
				}	
				}
			}
			for (Integer integer : list) {
				System.out.println(integer);
			}
		}
		
			public static void basitRasgele(int buyukSayi,int kucukSayi,int boyut) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Random r = new Random();
		int temp = buyukSayi-kucukSayi;
		int sayac = 0;
		int a = kucukSayi + r.nextInt(temp);
		while(sayac < boyut) {
			if(!(myList.contains(a))) {
				myList.add(a);
				sayac++;
			}
			
		}
			
	

		System.out.println(myList);
		
		
	}

	public static void basitRagele(int buyukSayi,int kucukSayi,int boyut) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();// arraylist yarattik
		Random r = new Random(); 
		int temp = buyukSayi-kucukSayi; 
		int sayac = 0;
		int a;
		while(sayac < boyut) {
		a = kucukSayi + r.nextInt(temp); // istedigimiz aralýkta uretiyo
		
		if(!myList.contains(a)) { // arraylisti geziyo icinde a varsa false donderiyo (! dolayi)
			myList.add(a);		// arrayliste ekliyo
			sayac++;			// dongu icin sayaci arttiyio
		}
			
		}

		System.out.println(myList);	// arraylisti goruntuluyo
	
	}
		
 * */
