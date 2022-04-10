import java.util.Arrays;
// artý alýndý
public class Main {
// aritmetik ortalama medyan mod
	static double ortalama;
	
	public static void main(String[] args) {
	int array[] = {145,235,150,155,170,210,175,210,200,205};
	ortalama(array);
	diziGoster(array);
	sirala(array);
	diziGoster(array);
	medyan(array);
	geoOrtalama(array);
	harmonikOrtalama(array);
	mod(array);
	}
	
	
	public static double ortalama(int array[]) {	
		double temp = 0;
		for(int i = 0; i < array.length ; i++) {
			temp += array[i];	
		}
		ortalama = temp / array.length;
		System.out.println("ortalama: " + ortalama);
		return ortalama;
	}
	
	public static void diziGoster(int array[]) {
		System.out.print("Dizi: ");
		for(int i = 0;i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void sirala(int array[]) {
		System.out.print("Sýralanmýs ");
		Arrays.sort(array);
	}
	
	
	public static double medyan(int array[]) {
		double sonuc = 0;
		if(array.length % 2 == 0) {// çift 
			sonuc = array[(array.length / 2)] + array[(array.length / 2) - 1];
			sonuc = sonuc / 2;
		}
		else{ // tek
			sonuc = array[array.length / 2];
		}
		System.out.println("Medyan: "+sonuc);
		return sonuc;
	}
	
	public static double geoOrtalama(int array[]) {
		long carpim = 1;
		double uzunluk = array.length;
		double us = (1/uzunluk);
		for(int i = 0; i < array.length; i++) {
			carpim *= array[i];
		}
		double sonuc = Math.pow(carpim,us);
		System.out.println("Geo ortalama: "+sonuc);
		return sonuc;
		
	}
	
	public static double harmonikOrtalama(int array[]) {
		System.out.println("---Harmonik---");
		System.out.println("Harmonik = Geometrik*Geometrik/Aritmetik");
		double sonuc = (geoOrtalama(array)*geoOrtalama(array)/ortalama(array));
		System.out.println("Harmonik ortalama: "+ sonuc);
		return sonuc;
	}
	
	public static void mod(int array[]) {
		int enBuyuk = -99;
		int sayac = 1;
		int sonuc = 0;
		for(int i = 0;i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					sayac++;
				}
				if(sayac >= enBuyuk) {
					enBuyuk = sayac;
					sonuc = array[i];
				}
			}
			
		}
		System.out.println("Mod: "+sonuc);
	}
}

