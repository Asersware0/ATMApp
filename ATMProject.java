import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		double bakiye = 1000, deger;
		int input;
		String sifre, correctsifre;
		correctsifre  = "1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("****** Aser Banka Hoş Geldiniz!! ******");
		System.out.println("Lütfen Şifrenizi giriniz: ");
		sifre = scan.nextLine();
			
		
		if(sifre.equals(correctsifre))
			
		{
			
			System.out.println("**** Giriş Başarılı****");
			System.out.println("Güncel Bakiyeniz: " + bakiye + "TL");
		
			while(bakiye >= 0 ) {
				System.out.println(" ");
				System.out.println("1- Para Çek");
				System.out.println("2- Para Yatır");
				System.out.println("3- Bakiye Sorgula");
				System.out.println("4- Çıkış Yap");
				System.out.println(" ");
				System.out.println("Lütfen işlem seçiniz. (1-4 arası sayı girşi yapınız)");
				input = scan.nextInt();


			//para çekme işlemi
				if(input == 1){
					System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
					deger= scan.nextDouble();
					if(deger > bakiye) {
						System.out.println("Bakiye yetersiz!!!");
					}
					else {
						bakiye = bakiye - deger;
						System.out.println("İşlem Tamamlandı.... Güncel Bakiyeniz: " + bakiye);
					}
				}
			
			
			// para yatırma işlemi
				else if(input == 2) {
				
				
					System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
				
					deger= scan.nextDouble();
					bakiye = bakiye + deger;
					System.out.println("İşlem Tamamlandı... Güncek Bakiyeniz: " + bakiye);			
				
				}
			


			// bakiye sorgulama işlemi
				else if(input == 3) {
					System.out.println("Güncel Bakiyeniz. " + bakiye);
				}
			
			
			// sistemden çıkış işlemi
				else if(input == 4) {
					System.out.println("Başarıyla Çıkış yaptınız");
					break;
				}

			//geçersiz sayı girilince ekranda gözüken yazı
				else{
					System.out.println("Lütfen geçerli bir işlem seçiniz....");
				}
			
			
			
			}
			System.out.println(" ");
			System.out.print("İyi Günler Yine Bekleriz \n **************************** ");
		}
		else {
			System.out.println("Şifreniz yanlış!!! Lütfen tekrar deneyiniz");
		}
	}

}
