/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico3;

import java.util.Random;




// Clase de la tienda 
public class Tienda {
    private  String[] productos;
    private int [][] ventas;
    private int numeroProductos;
    

public Tienda(int numeroProductos){
    this.numeroProductos = productos.length;
    this.productos = productos;
    ventas = new int [7][numeroProductos]; // Matriz de 7xX
    generarVentasAleatorias();
    
}

private void generarVentasAleatorias(){
    Random random = new Random();
    for (int i =0; i < 7; i++){
        for(int j=0; j < numeroProductos; j++){
            ventas [i][j] = random.nextInt(10);
        }
    }
}

    public  void calcularVentas() {
        System.out.println(" El total de ventas por producto es: ");
        for(int j = 0; j < numeroProductos; j++){
            int total = 0;
            for (int i=0; i < 7; i++){
                total+= ventas[i][j];
            }
            System.out.println(productos[j] + " : " + total);
            
        }
    }
    public void diaDeMasVentas(){
        int maxVentas = 0, diaMayor = 0;
        for ( int i = 0; i < 7; i++){
            int sumaDia = 0;
            for ( int j = 0; j < numeroProductos; j++){
            }
            if (sumaDia > maxVentas){
                maxVentas = sumaDia;
                diaMayor = i;
            }
        }
        System.out.println("El dia con mas ventas fue " + (diaMayor + 1) +  " con " + maxVentas + " ventas. ");
    }
    public void productomasVendido(){
        int maxVentas = 0, productoIndex = 0;
        for (int j = 0; j < numeroProductos; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][j];
            }
            if (total > maxVentas) {
                maxVentas = total;
                productoIndex = j;
            }
        }
        System.out.println(" El producto mas vendido es " + productos[productoIndex] + " con " + maxVentas + "unidades. ");
     }
        
}
    


