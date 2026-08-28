# Trabajo Práctico 1 - Entorno, Git y fundamentos de Java

**Alumno/a:** Luciano DIndart
**Materia:** Programación II 

## Programas incluidos

* **Viaje.java**: Registra los datos de un viaje individual de un camión, calculando su consumo de combustible, rendimiento, costos y el porcentaje del tanque utilizado.
* **Flota.java**: Registra y analiza los datos de los viajes de seis camiones, calculando métricas totales de la flota, promedios y clasificando cada unidad según su nivel de eficiencia energética.

## Instrucciones de compilación y ejecución

Para ejecutar los programas, abrí la consola o terminal en la misma carpeta donde se encuentran los archivos `.java` y ejecutá los siguientes comandos:

**Para el programa Viaje:**
1. Compilar: `javac Viaje.java`
2. Ejecutar: `java Viaje`

**Para el programa Flota:**
1. Compilar: `javac Flota.java`
2. Ejecutar: `java Flota`

## Preguntas

**1. En la parte C calculaste un promedio dividiendo un total por una cantidad. Explicá por qué ese cálculo puede dar un resultado equivocado en Java aunque el programa compile y no dé ningún error, y cómo lo resolviste.**
Si se dividen dos variables enteras (`int`), Java realiza una "división entera" descartando la parte decimal. Lo resolví utilizando el tipo de dato `double` tanto para los acumuladores (`totalKm`, `totalLitros`) como para la variable de promedios, obligando a Java a realizar la división con punto flotante y conservando así la precisión de los datos.

**2. Explicá para qué te sirvió haber trabajado la parte C en una rama aparte en vez de escribirla directamente sobre la rama principal. No repitas la definición de rama: contá qué te habilitó a hacer en este trabajo concreto.**
Trabajar en la rama `parte-c` me dio la seguridad de poder experimentar con los arreglos y la nueva lógica de `Flota.java` sin riesgo de romper el código estable de `Viaje.java` que ya tenía listo en `main`. Me permitió hacer commits intermedios de prueba sabiendo que mi entrega principal seguía intacta hasta que decidí hacer el merge.

**3. Mirá el historial de tu repositorio con git log. Elegí uno de tus mensajes de commit que hoy escribirías distinto, transcribilo, y escribí la versión mejorada explicando qué le faltaba al original.**
*   **Mensaje original:** "agrego flota y un par de cosas"
*   **Mensaje mejorado:** "Agrega programa Flota.java con registro en arreglos y cálculo de consumos"
*   **Explicación:** El mensaje original no detallaba qué cambios se introducían y usaba lenguaje informal. La versión mejorada describe de forma precisa la funcionalidad y el archivo que se añadieron en ese punto de la historia, tal como vimos en clase.