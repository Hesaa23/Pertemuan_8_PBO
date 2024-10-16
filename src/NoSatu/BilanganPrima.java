package NoSatu;
public class BilanganPrima {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bilangan Prima dari 0 Sampai 20 : ");
        for (int i = 0; i <= n; i++) {
            int angka = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    ++angka;
                }
            }
            if(angka == 2){
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nBilangan bukan prima dari 0 sampai 20");
        for (int i = 0; i <= n; i++) {
            int angka = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    ++angka;
                }
            }
            if(angka != 2){
                System.out.print(i + " ");
            }
        }
    }
}
