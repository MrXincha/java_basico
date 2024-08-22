public class Main {
    public static void main(String[] args) {
        Carros carros = new Carros();
        carros.setMarca("Volkswagen");
        carros.setModelo("Polo");
        carros.setAno(2007);

        System.out.println("Marca: " + carros.getMarca());
        System.out.println("Modelo: " + carros.getModelo());
        System.out.println("Ano: " + carros.getAno());
    }
}