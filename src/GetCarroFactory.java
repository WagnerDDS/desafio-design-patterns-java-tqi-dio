public class GetCarroFactory {
    // escolhendo o modelo do carro
    public Carro getCarroCombustivel(String tipoCombustivel) {

        if (tipoCombustivel.equalsIgnoreCase("DIESEL")) {
            return new CarroDiesel();
        } else if (tipoCombustivel.equalsIgnoreCase("GASOLINA")) {
            System.out.println("escolhido gasolina");
            return new CarroGasolina();
        } else if (tipoCombustivel.equalsIgnoreCase("ALCOOL")) {
            return new CarroAlcool();
        }
        return null;

    }
}
