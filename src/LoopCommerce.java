import java.util.Scanner;

public class LoopCommerce {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] productos = {
        "Manzanas - $1000",
        "Leche - $1200",
        "Pan - $800",
        "Cereal - $2500"
    };
    String[] carrito = new String[0];
    int opcion;

    do {
      System.out.println("===== MENÚ PRINCIPAL =====");
      System.out.println("0. Salir");
      System.out.println("1. Ver Productos Disponibles");
      System.out.println("2. Agregar productos al carrito");
      System.out.println("3. Ver subtotal actual");
      System.out.println("4. Realizar checkout");

      System.out.print("> Selecciona una opción: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          int productIndex = 1;
          for (String producto : productos) {
            System.out.println(productIndex + ". " + producto);
            productIndex++;
          }
          break;
        case 2:
          // Mostrar productos disponibles
          System.out.println("\nProductos disponibles:");
          for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ") " + productos[i]);
          }

          // Ingresar cantidad de productos
          System.out.print("> Cuantos productos deseas añadir: ");
          int quantityProduct = sc.nextInt();

          carrito = new String[quantityProduct];

          // Llenar carrito
          for (int i = 0; i < quantityProduct; i++) {
            System.out.print("\n> Selecciona el producto #" + (i + 1) + ": ");
            opcion = sc.nextInt();

            // Validar opción
            if (opcion >= 1 && opcion <= productos.length) {
              carrito[i] = productos[opcion - 1];
              System.out.println("Producto agregado: " + carrito[i]);
            } else {
              System.out.println("Opción inválida. Intenta nuevamente.");
              i--; // repetir la posición
            }
          }

          // Mostrar resultado final
          System.out.println("\n||||| Productos en el carrito |||||");
          for (String p : carrito) {
            System.out.println("- " + p);
          }
          break;
        case 3:
          int subtotal = 0;

          for (String item : carrito) {
            if (item != null) {
              String[] partes = item.split("\\$");
              int precio = Integer.parseInt(partes[1]);
              subtotal += precio;
            }
          }

          System.out.println("||||| El subtotal de tu carrito es: $" + subtotal + " |||||");
          break;
        case 4:
          String[] pasos = {
              "Validación de stock...",
              "Confirmación de datos...",
              "Procesamiento de pago...",
              "Generación de envío..."
          };

          System.out.println("\nIniciando proceso de checkout...\n");

          for (int i = 0; i < pasos.length; i++) {
            System.out.println("Paso " + (i + 1) + ": " + pasos[i]);

            try {
              Thread.sleep(1200); // Delay de 1.2 segundos (modificable)
            } catch (InterruptedException e) {
              System.out.println("Error al aplicar delay.");
            }
          }

          System.out.println("\n✔ Checkout completado con éxito!\n");
          break;
        default:
          System.out.println("||||| Programa Terminado |||||");
      }

    } while (opcion != 0);

  }
}
