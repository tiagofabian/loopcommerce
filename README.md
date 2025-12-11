# LoopCommerce - E-Commerce Simulator (Consola en Java)

# Descripción general

Este desafío consiste en crear un sistema simple de compras utilizando distintos tipos de ciclos en Java. El programa
permite al usuario ver productos, agregar artículos al carrito y simular un proceso de checkout, todo controlado
mediante un menú principal.

1) Ver productos disponibles
   El sistema almacena los productos en un arreglo de Strings y los recorre mediante un ciclo for-each para mostrarlos
   junto a su número y precio correspondiente.

2) Agregar productos al carrito
   El usuario puede ir agregando productos mediante un while, el cual se repite hasta que se ingresa “0”. Cada selección
   suma un valor al subtotal, que se va acumulando en una variable.

3) Ver subtotal actual
   En cualquier momento, el usuario puede visualizar el subtotal acumulado del carrito.

4) Realizar checkout
   El checkout simula un proceso de compra compuesto por 4 pasos fijos, utilizando un ciclo for:

- Validación de stock
- Confirmación de datos
- Procesamiento de pago
- Generación de envío

Cada etapa muestra un mensaje de avance.

5) Salir del sistema
   El programa utiliza un do-while para mantener el menú activo hasta que el usuario elija la opción “Salir”.

# Tecnologías usadas

- Java 21
- Scanner
- Loops (for, foreach, while, do-while)

# Ejecución

javac src/LoopCommerce.java
java -cp src LoopCommerce

# Funcionalidad del programa

**Salir**
- Finaliza el programa y cierra el sistema. 
- El menú deja de repetirse.
  **Ver Productos Disponibles**
- Muestra en pantalla todos los productos que existen en la tienda, incluyendo su nombre y precio.
- Se recorren usando un for-each.
  **Agregar productos al carrito**
- Permite que el usuario seleccione cuántos productos quiere agregar y los elija uno por uno.
- Los productos seleccionados se guardan en un arreglo llamado carrito.
  **Ver subtotal actual**
- Calcula y muestra el total acumulado del carrito.
- Extrae los precios de cada producto agregado y los suma en un subtotal.
  **Realizar checkout**
- Simula el proceso de compra recorriendo 4 pasos (stock, datos, pago y envío) usando un for
- muestra cada estado con un pequeño delay.

# Aprendizajes del equipo

Se reforzó el uso de ciclos en Java aplicándolos a un sistema de compras simulado. Practicamos el manejo de arreglos,
la creación de menús interactivos y la organización del flujo del programa con distintos loops. Este desafío nos ayudó a
mejorar la lógica, la estructura del código y la colaboración para desarrollar una solución funcional.