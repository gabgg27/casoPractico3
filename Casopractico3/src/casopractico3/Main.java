
package casopractico3;



public class Main {
    public static void main(String[] args) {
        String[] productos = {"Arroz", "Azúcar", "Leche"};
        Tienda tienda = new Tienda(productos);
        tienda.calcularVentas();
        tienda.diaDeMasVentas();
        tienda.productomasVendido();
    }
}

 
