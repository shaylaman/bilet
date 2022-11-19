import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age,km,tarife;
        double kmprice = 0.10, total;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        age = inp.nextInt();
        System.out.print("Lutfen Km giriniz: ");
        km = inp.nextInt();
        System.out.println("Seyahat Türü seciniz:\n1.Gidiş\n2.Gidiş-Dönüş");
        tarife = inp.nextInt();
        total = 0;
        if(age <0 || km < 0 || tarife < 1 || tarife > 2){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            if(tarife == 1){
                if(age < 12){
                    total += 0.5*(km*kmprice);
                }
                else if (age < 25) {
                    total += 0.9*(km*kmprice);
                }
                else if ( age > 64){
                    total += 0.7 * (km*kmprice);
                }
                else{
                    total += km * kmprice;
                }
            }
            else{
                if(age < 12){
                    total += 0.8*(0.5*(2*km*kmprice));
                }
                else if (age < 25) {
                    total += 0.8*(0.9*(2*km*kmprice));
                }
                else if ( age > 64){
                    total += 0.8*(0.7 * (2*km*kmprice));
                }
                else{
                    total += 0.8*(2*km * kmprice);
                }
            }
            System.out.println("Toplam Tutrar: " + total + " TL");
        }

    }
}