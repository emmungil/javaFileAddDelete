import java.util.Scanner; 

  

public class Main { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

         

        System.out.println("=== BURÇ BULMA PROGRAMI ===\n"); 

         

        // Kullanıcıdan doğum bilgilerini al 

        System.out.print("Doğum gününüzü giriniz (Gün): "); 

        int gun = 0; 

         

        try { 

            gun = Integer.parseInt(scanner.nextLine()); 

        } catch (NumberFormatException e) { 

            System.out.println("Geçersiz giriş! Lütfen bir sayı giriniz."); 

            scanner.close(); 

            return; 

        } 

         

        System.out.print("Doğum ayınızı giriniz (1-12): "); 

        int ay = 0; 

         

        try { 

            ay = Integer.parseInt(scanner.nextLine()); 

        } catch (NumberFormatException e) { 

            System.out.println("Geçersiz giriş! Lütfen bir sayı giriniz."); 

            scanner.close(); 

            return; 

        } 

         

        // Doğum bilgilerini doğrula 

        if (gun < 1 || gun > 31) { 

            System.out.println("Geçersiz gün! (1-31 arası olmalı)"); 

            scanner.close(); 

            return; 

        } 

         

        if (ay < 1 || ay > 12) { 

            System.out.println("Geçersiz ay! (1-12 arası olmalı)"); 

            scanner.close(); 

            return; 

        } 

         

        // Burcu hesapla 

        String burc = burcHesapla(gun, ay); 

         int uretilengun = MetodVeriAktarimi.rastgelegunUret();
         int uretilenay = MetodVeriAktarimi.rastgeleayUret();

        // Sonucu göster 
         System.out.println("Üretilen Gün: "+uretilengun); 
         System.out.println("Üretilen Ay: "+uretilenay); 
         String otoburc = burcHesapla(uretilengun, uretilenay);
         System.out.println("Üretilen burc: "+otoburc); 
        System.out.println("\n=== SONUÇ ==="); 

        System.out.println("Doğum Tarihi: " + gun + "." + ay); 

        System.out.println("Burcunuz: " + burc); 

         

        scanner.close(); 

    } 

     

    // Burç hesaplama metodu 

    public static String burcHesapla(int gun, int ay) { 

        if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 18)) { 

            return "Oğlak"; 

        } else if ((ay == 2 && gun >= 19) || (ay == 3 && gun <= 20)) { 

            return "Kova"; 

        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 19)) { 

            return "Balık"; 

        } else if ((ay == 4 && gun >= 20) || (ay == 5 && gun <= 20)) { 

            return "Koç"; 

        } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 20)) { 

            return "Boğa"; 

        } else if ((ay == 6 && gun >= 21) || (ay == 7 && gun <= 22)) { 

            return "İkizler"; 

        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) { 

            return "Yengeç"; 

        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) { 

            return "Aslan"; 

        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) { 

            return "Başak"; 

        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) { 

            return "Terazi"; 

        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) { 

            return "Akrep"; 

        } else { 

            return "Yay"; 

        } 

    } 

} 
