
package metotlarilehesapmakinesi;
import java.util.*;
public class MetotlarileHesapMakinesi {
     

    static void toplama()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz?");
        int sayac =input.nextInt();
        int sonuc=0;
                
        for(int i=1; i<=sayac; i++){
            System.out.print(i + ".sayı:");
            int sayi = input.nextInt();
            sonuc += sayi;
            
        }
        System.out.println("Sonuç:" + sonuc );
 
    }
    static void cıkarma()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz?");
        int sayac = input.nextInt();
        int sonuc=0;
        
        for(int i=1; i<= sayac; i++){
            System.out.print(i + ".sayı:");
            int sayi = input.nextInt();
            if(i==1){
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }
        System.out.println("Sonuç:" + sonuc);
    }
    static void carpma()
    {
        Scanner input = new Scanner(System.in);
        int sayi, sonuc=1, i=1;
        
        while(true){
            System.out.print(i++ + ".sayı:");
            sayi = input.nextInt();
            
            if(sayi==1){
                break;
            }
            if(sayi==0){
                sonuc =0;
                break;
            }
            sonuc *= sayi;
        }
        System.out.println("Sonuç:" + sonuc);
        
        
    }
    static void bolme(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int sayac = input.nextInt();
        double sayi, sonuc = 0.0;
        
        for(int i=1; i<=sayac; i++){
            System.out.println(i + ".sayı:");
            sayi = input.nextInt();
            if(i != 1 && sayi==0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i ==1){
                sonuc = sayi;
                continue;
            }
            sonuc /=sayi;
        }
        System.out.println("Sonuç:" + sonuc);
    }
    static void üsAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz");
        int üs = input.nextInt();
        int sonuc =1;
        
        for(int i=1; i<=üs ; i++){
            sonuc *= taban;
        }
        System.out.println("Sonuç:" + sonuc);
    }
    static void faktoriyel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int sonuc =1;
        
        for(int i=1; i<= sayi; i++){
            sonuc *=i;
        }
        System.out.println("Sonuç:" +  sonuc);
    }
    static void modAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz:");
        int sayi = input.nextInt();
        System.out.print("Mod sayısını giriniz:");
        int n = input.nextInt();
        int sonuc=1;
        
        for(int i=1; i<=sayi; i++){
            sonuc = sayi%n;
        }
        System.out.println("Sonuç:" + sonuc);
    }
    static void DikdörtgenAlanveCevreHesaplama(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz:");
        int kisaKenar = input.nextInt();
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz:");
        int uzunKenar = input.nextInt();
        
        int alan = (kisaKenar*uzunKenar);
        int cevre = 2*(kisaKenar+uzunKenar);
        System.out.println("Dikdörtgenin alanı:" + alan);
        System.out.println("Dikdörtgenin çevresi:" + cevre);
               
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen yapmak itsediğiniz işlemi seçiniz:");
        System.out.println("1-Toplama İşlemi");
        System.out.println("2-Çıkarma İşlemi");
        System.out.println("3-Çarpma İşlemi");
        System.out.println("4-Bölme İşlemi");
        System.out.println("5-Üs Alma İşlemi");
        System.out.println("6-Faktöriyel Hesaplama İşlemi");
        System.out.println("7-Mod Alma İşlemi");
        System.out.println("8-Dikdörtgen Aalan ve Çevre Hesaplama İşlemi");
        System.out.println("9-Çıkış Yap");
        int secim = input.nextInt();
        do{
                    
            switch(secim)
            {
            case 1:
                toplama();
                break;
            case 2:
                cıkarma();
                break;
            case 3:
                carpma();
                break;
            case 4:
                bolme();
                break;
            case 5:
                üsAlma();
                break;
            case 6:
                faktoriyel();
                break;
            case 7:
                modAlma();
                break;
            case 8:
                DikdörtgenAlanveCevreHesaplama();
                break;
            case 9:
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz:");
                break;  
            }
        }
        while(secim != 0);
        
          
    }
    
}
