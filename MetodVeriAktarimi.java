public class MetodVeriAktarimi { 

// 1. metod: Rastgele sayı üretir 
public static int rastgeleSayiUret() { 
    int sayi = (int)(Math.random() * 10) + 1; // 1-100 arası 
//    System.out.println("Üretilen sayı: " + sayi); 
    return sayi; 
} 

public static int rastgelegunUret() { 
    int sayi = (int)(Math.random() * 30) + 1; // 1-100 arası 
//    System.out.println("Üretilen sayı: " + sayi); 
    return sayi; 
} 

public static int rastgeleayUret() { 
    int sayi = (int)(Math.random() * 11) + 1; // 1-100 arası 
//    System.out.println("Üretilen sayı: " + sayi); 
    return sayi; 
} 

// 2. metod: Gelen sayının karesini hesaplar 
public static int kareHesapla(int sayi) { 
    int kare = sayi * sayi; 
    System.out.println(sayi + " sayısının karesi: " + kare); 
    return kare; 
} 
 
// 3. metod: Gelen sayının küpünü hesaplar 
public static int kupHesapla(int sayi) { 
    int kup = sayi * sayi * sayi; 
    System.out.println(sayi + " sayısının küpü: " + kup); 
    return kup; 
} 
 
public static void main(String[] args) { 
    // 1. metodun ürettiği sayıyı al 
    int uretilenSayi = rastgeleSayiUret(); 
     
    // Bu sayıyı diğer metoda gönder 
    int kareSonuc = kareHesapla(uretilenSayi); 
     
    // kareSonuc'u başka metoda gönder 
    int kupSonuc = kupHesapla(kareSonuc); 
     
    System.out.println("\nİşlem zinciri tamamlandı!"); 
} 
  

} 
