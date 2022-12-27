import java.util.Scanner;
public class main{
    public static void main(String[] args){
         double tutar,kdvOran=0.18;
         Scanner input=new Scanner(System.in);
         System.out.print("Ücret Tutarını Giriniz: ");
         tutar=input.nextDouble();
         double kdvTutar=tutar*kdvOran;
         double etiketFiyatı=tutar + kdvTutar;
         System.out.println(etiketFiyatı);





    }
}

