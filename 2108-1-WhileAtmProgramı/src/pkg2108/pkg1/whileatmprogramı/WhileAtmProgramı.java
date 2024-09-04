
package pkg2108.pkg1.whileatmprogramı;

import java.util.Scanner;


public class WhileAtmProgramı {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int bakiye = 1000;
         String İslemler = "1. İşlem : Bakiye Öğrenme\n"
                          +"2. İşlem : Para Çekme\n"
                          +"3. İşlem : Para Yatırma\n"
                          +"Çıkış için q'a basınız.";
         System.out.println("****************************");
         System.out.println(İslemler);
         System.out.println("****************************");
         
         
         while (true){
             System.out.println("İşlemi Seçiniz; ");
             String islem = scanner.nextLine();
             
             if (islem.equals("q")){
                 System.out.println("Programdan Çıkılıyor...");
                 break;
             }
             
             else if (islem.equals("1")){
                 System.out.println("Bakiye : "+bakiye);
                 
             }
             else if (islem.equals("2")){
                 System.out.println("Çekmek İstediğiniz Tutar : ");
                 int tutar = scanner.nextInt();
                 scanner.nextLine();
                 if(bakiye - tutar <0){
                     System.out.println("Yetersiz Bakiye... Mevcut Bakiyeniz :"+ bakiye);
                 }
                 else{
                     bakiye -= tutar;
                     System.out.println("Yeni Bakiyeniz ; "+ bakiye);
                 }
                         
                 
             }
             else if (islem.equals("3")){
                 System.out.println("Yatırmak İstediğiniz Tutar : ");
                 int tutar = scanner.nextInt();
                 scanner.nextLine();
                 
                 bakiye +=tutar;
                 
                 System.out.println("Yeni Bakiyeniz : "+ bakiye);
                 
             }
             else {
                 System.out.println("Geçersiz İşlem...");
             }
                 
                 
         }
         
                 
        
    }
    
}
