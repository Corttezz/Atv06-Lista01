import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) throws Exception {
        double raio, area;
        double pi = Math.PI;

        System.out.println("Digite o raio do círculo: ");

        Scanner tc = new Scanner(System.in);
        raio = tc.nextDouble();
        tc.close();
        
        area = pi * Math.pow(raio, 2);

        System.out.println("A área do círculo é de: " + area);
    
    }
}
