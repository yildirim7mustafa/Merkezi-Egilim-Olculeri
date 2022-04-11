import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, tarih, muzik;
        int toplam;
        float ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunu giriniz: ");
        muzik = input.nextInt();

        toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        ortalama = toplam / 6.0f;

        System.out.println(ortalama);

        String durum = ortalama>60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(durum);

	}

}
