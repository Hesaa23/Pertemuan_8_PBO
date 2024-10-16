package NoSatu;
public class GanjilGenap {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bilangan Genap dari 0 sampai 20 : ");
        for (int i = 0; i <= n; i++) {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan Ganjil dari 0 sampai 20 : ");
        for (int i = 0; i <= n; i++) {
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
