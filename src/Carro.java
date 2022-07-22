abstract class Carro {
    protected double taxaConsumo;

    abstract void getTaxaConsumo();

    protected final int CAPACIDADE = 60;// capacidade do tanque em litros

    public double calcularKmPorTanque() {
        return taxaConsumo * CAPACIDADE;
    }

}
