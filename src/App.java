import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GetCarroFactory getCarro = new GetCarroFactory();
        System.out.println("Bem-vindo à calculadora de KMs.");
        System.out.println("Para saber o rendimento do seu carro informe o combustível a ser utilizado - sem acentos-");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        Carro carro = getCarro.getCarroCombustivel(s);
        carro.getTaxaConsumo();
        System.out.println("O carro percorrerá " + carro.calcularKmPorTanque() + "Kms utilizando " + s);
    }
}
