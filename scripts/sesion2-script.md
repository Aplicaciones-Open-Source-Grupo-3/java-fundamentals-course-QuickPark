# Sesión 2 – Variables y tipos de datos

## 1. Introducción

Bienvenidos a la **Sesión 2** del curso.  
En la sesión pasada dimos nuestros primeros pasos en programación: aprendimos qué es programar, qué es un lenguaje, por qué Java sigue siendo tan importante hoy en día y, sobre todo, escribimos nuestras primeras líneas de código. Ese fue nuestro primer contacto con el mundo de la programación, un mundo donde todo se construye a partir de instrucciones claras y precisas.

Hoy vamos a subir un nivel. Vamos a comenzar a trabajar con una de las piezas más fundamentales en cualquier lenguaje: **las variables y los datos**.

¿Por qué son tan importantes?

Porque hasta ahora, en la primera sesión, nuestros programas siempre mostraban lo mismo. No importaba cuántas veces ejecutábamos el código, el resultado era exactamente igual. Eso está bien para empezar, pero un programa real necesita trabajar con información que cambia, como:

- la edad de una persona,
- una temperatura,
- una contraseña,
- un precio,
- o incluso los puntos de un videojuego.

Cada vez que llenas un formulario, envías un mensaje, usas una calculadora online o ves tu saldo bancario, estás usando variables.

En esta sesión vamos a aprender:

- qué son los datos,
- qué es una variable,
- cómo se declaran,
- cómo se guardan los valores,
- qué tipos de datos existen,
- y algo muy importante: **cómo pedirle datos al usuario** para que nuestro programa sea interactivo.

Vamos a trabajar hoy con el famoso objeto **`Scanner`**, que será como un “micrófono” del programa: tú escribes algo en consola, y Java lo recibe, lo guarda en una variable y lo puede usar para hacer cálculos.

También vamos a hacer dos ejercicios prácticos:

- uno para calcular la **suma y el promedio de tres números**,  
- y otro para **convertir temperaturas**.

Al final, te dejaré un **mini reto** para que practiques lo aprendido.  
Esta sesión marca el momento donde nuestros programas empiezan a ser **dinámicos y realmente útiles**.  
¡Vamos a comenzar!

---

## 2. ¿Qué es un dato?

Ahora sí, antes de comenzar a programar de verdad, necesitamos detenernos un momento en algo que puede parecer muy simple, pero que es la base de absolutamente todo lo que vamos a hacer desde hoy: **el dato**.

**¿Qué es un dato?**

Un dato es simplemente **información**. Puede ser un número, un texto, una letra, una fecha, una temperatura, una edad, un precio, un color, una contraseña… cualquier cosa que pueda ser representada de alguna manera dentro de una computadora.

Y aunque suene sencillo, los datos están en todo lo que usamos cada día.

Por ejemplo, cuando entras a *Instagram*:

- la cantidad de seguidores que ves es un dato,
- cada comentario es un dato,
- tu nombre de usuario es un dato,
- incluso las coordenadas internas del algoritmo que decide qué mostrarte primero… también son datos.

En *YouTube*, un video tiene miles de datos asociados: vistas, likes, duración, la fecha en que se subió, los subtítulos, los hashtags, la resolución del video.

Cuando usas *Google Maps*, tu ubicación es un dato, la distancia a tu destino es otro dato y el tiempo estimado del viaje es otro dato más.

En los videojuegos también:

- tu nivel,
- tus puntos,
- tu inventario,
- la vida de tu personaje,
- el daño que causa un ataque…

todo eso son datos que el juego está actualizando constantemente.

Y algo muy importante:

> La computadora no entiende ideas, solo datos.

Si tú le dices a alguien “hace calor”, esa persona te entiende.  
Pero una computadora necesita un número. Necesita que le digas:

- 28 grados,  
- 70% de humedad,  
- índice UV 8.

Por eso, cuando programamos, nuestro trabajo es **convertir la realidad en datos** que la computadora pueda procesar.

Cada vez que un programa funciona es porque está tomando datos, transformándolos y generando **nuevos datos**.

Por ejemplo, una calculadora toma dos números y te devuelve otro: esos son simplemente **datos entrando y datos saliendo**.

A lo largo de esta sesión vamos a ver cómo manejar esos datos, cómo guardarlos y cómo hacer operaciones con ellos.  
Porque si los datos son los ingredientes, nuestras instrucciones van a ser las recetas.

> Sin datos, no hay programa.  
> Y a partir de hoy, vamos a empezar a trabajar con ellos de manera práctica.

---

## 3. ¿Qué es una variable?

Muy bien, ahora que ya tenemos claro qué es un dato, vamos con un concepto que es absolutamente esencial en cualquier programa que escribamos: **la variable**.

Si los datos son la información, entonces las variables son **los lugares donde esa información se guarda**.

A mí me gusta explicarlo con una metáfora muy simple:  
imagina que una variable es una **caja**.

Esa caja tiene dos cosas importantes:

- un **nombre**, que sería la etiqueta que le pegas afuera, y  
- un **valor**, que es lo que guardas dentro.

Por ejemplo, si tengo una variable llamada `edad` y dentro coloco el número `18`, entonces la caja se llama `edad` y contiene `18`.

Lo interesante es que podemos **cambiar el contenido de la caja** cuando queramos.  
Hoy la variable `edad` tiene 18, el próximo año puede tener 19 y después 20… la etiqueta sigue siendo la misma, pero lo que está dentro cambia.  
Por eso se llama *variable*, porque su valor puede variar.

Y aquí viene lo importante:  
en programación, prácticamente **todo lo que hacemos** implica trabajar con variables.

- Si un juego muestra cuántas vidas te quedan, cada vez que pierdes una vida, la variable `vidas` baja.  
- Si usas una app de ejercicio, tus pasos se guardan en una variable. Cuando llegas a 10 000, la app lo sabe porque la variable llegó a ese número.  
- En un banco, tu saldo también es una variable, y cada vez que haces una compra o un depósito, el valor cambia.  
- Incluso cuando escribes tu nombre en un formulario, ese texto se guarda temporalmente en una variable antes de enviarse a un servidor.

En Java, para poder usar una variable tenemos que decir dos cosas:

1. **de qué tipo de dato es**, y  
2. **cómo se llama**.



Luego podemos darle un valor:

```java
puntos = 10;
```

Algo muy importante es que una computadora no puede trabajar con ideas abstractas, necesita valores concretos guardados en variables.

Si yo le digo “calcula el promedio”, la computadora no entiende. Pero si le digo:

```
   a = 5;
   b = 10;
   c = 15;
```

### Variables y Tipos de Datos en Java

Entonces ya tiene números reales guardados en variables y sí puede hacer operaciones.

A partir de esta sesión, todas nuestras operaciones matemáticas, conversiones y cálculos van a funcionar gracias a las variables. Son la base para que cualquier programa haga algo útil.

Muy bien, ahora que ya sabemos qué son los datos y qué son las variables, viene algo muy importante: el tipo de dato.

En Java, cada variable no solo necesita un nombre, sino también un tipo.

#### ¿Por qué es esto tan importante?

Porque Java necesita saber exactamente qué tipo de información vamos a guardar para poder usarla correctamente.

Es como si las cajas que mencionamos antes tuvieran distintos tamaños y formas. No puedes guardar agua en una caja de cartón y no puedes guardar una bicicleta en una caja pequeñita.

Lo mismo pasa en programación: si una variable fue creada para guardar números, no puede guardar texto; si fue creada para guardar texto, no puede guardar un número sin convertirlo.

Vamos a ver los tipos más importantes, que son los tipos primitivos y los tipos de referencia.


### Tipos Primitivos

Primero, los tipos primitivos, que son los más básicos del lenguaje.

Tenemos:

- `int`, que sirve para números enteros, como 10, 200 o -5.
- `double`, que sirve para números con decimales, como 4.5, 3.14 o 100.76.
- `char`, que guarda un solo carácter, como ‘A’, ‘@’, o ‘3’.
- `boolean`, que solo puede tener dos valores: true o false.


Estos tipos son muy rápidos, muy eficientes, y se usan muchísimo para operaciones matemáticas, contadores, ciclos y lógica dentro del programa.

Por ejemplo, un videojuego usa `int` para los puntos del jugador, pero usa `double` para cosas más precisas, como la velocidad del personaje o el daño de un ataque.

El tipo `boolean` es clave para tomar decisiones: por ejemplo, si un usuario está autenticado o no, si un botón está activado o desactivado, si un juego ha terminado o sigue en curso.


### Tipos de Referencia

Luego tenemos los tipos de referencia, y aquí el más conocido es `String`, que sirve para guardar texto.

Si tú escribes tu nombre, una dirección o una contraseña, todo eso se guarda en variables de tipo `String`.

La diferencia es que un `String` no guarda directamente el valor como tal, sino una referencia a un objeto que contiene ese texto. Es como si la caja no tuviera el contenido adentro, sino una etiqueta que te lleva al lugar donde está guardado.

#### ¿Por qué es importante esta diferencia?

Porque los tipos primitivos son muy ligeros y viven directamente en la memoria más rápida del programa, mientras que los tipos de referencia son más flexibles, pueden ser más grandes y pueden almacenar contenido más complejo.

En la práctica, no tienes que preocuparte demasiado por esta diferencia cuando estás empezando, pero sí es importante entender que `int` y `double` funcionan diferente que un `String`.

Hoy vamos a trabajar principalmente con `double` para cálculos, y veremos cómo Java maneja estos valores dentro de las variables.

A medida que avancemos en el curso, usaremos cada vez más tipos, pero con solo `int`, `double`, `boolean` y `String` podemos hacer programas muy útiles desde ya.


### Declaración, Inicialización y Conversión de Variables

Muy bien, ahora que ya entendemos qué son los datos y qué son los tipos, vamos a ver cómo se trabajan realmente en Java.

Cuando queremos usar una variable en un programa, normalmente seguimos tres pasos fundamentales: declararla, inicializarla y, si es necesario, convertir su tipo de dato.

Vamos con el primer paso: **declarar una variable.**

Declarar una variable significa decirle a Java dos cosas:

- qué tipo de dato va a guardar,
- y cómo se llama.

Por ejemplo, si yo escribo: `int edad;` estoy declarando una variable llamada edad y diciendo que solo almacenará números enteros.

Java necesita esa información desde el principio, porque es un lenguaje de tipado fuerte: si una variable nació para guardar números enteros, no puedo luego guardar un texto dentro de ella.

El segundo paso es inicializar, que significa darle un valor inicial.

Por ejemplo: 
```
   edad = 18;
```

Ahora la variable ya tiene contenido.

Muchas veces hacemos estos dos pasos juntos, así: 
```
int edad = 18;
```

Y esto es algo que verás muchísimas veces a lo largo de todas las clases.

A lo largo del programa, podemos cambiar el valor de la variable cuando queramos, siempre respetando su tipo.

Por ejemplo, si mañana quiero cambiar la edad, puedo decir: 
```
edad = 19;
```

Y Java no tiene ningún problema con eso porque estamos modificando el valor, no el tipo.

#### Conversión de tipo (Casting)

El tercer paso es la conversión, también llamada casting.

A veces necesitamos convertir un tipo de dato en otro. Por ejemplo, convertir un entero en un número decimal, o convertir un decimal en entero.

Esto es muy útil cuando hacemos operaciones matemáticas.

Por ejemplo, si tengo: 
```
int a = 5;
int b = 2;
```
 y hago 
 
 ```
a / b
```

Java va a hacer división entera, y el resultado será 2, no 2.5.

Para evitar eso, puedo convertir uno de los dos a double, así: 

```
(double) a / b
```

Entonces la operación ya produce decimales.

También está la conversión automática, que Java hace cuando combinamos tipos diferentes. Por ejemplo, si sumo un int con un double, Java convierte automáticamente el int en double para no perder precisión.

Esta conversión ocurre todo el tiempo en cálculos y es exactamente lo que vamos a ver hoy en los ejercicios.

En resumen, cada vez que uses una variable, recuerda este flujo: primero la declaras, luego la inicializas, y cuando haces operaciones, Java puede convertirla si es necesario para obtener el resultado correcto.

Con esto ya estamos listos para comenzar a usar variables reales en nuestros programas.

Antes de pasar al código, quiero detenerme un momento para revisar la estructura de un programa en Java.

A diferencia de otros lenguajes más simples, como Python, Java tiene una estructura muy organizada y siempre sigue el mismo patrón, incluso cuando el programa es muy pequeño.

Todo programa en Java comienza con una clase. Esa clase es como el contenedor principal donde Java busca el código.

Por ejemplo, normalmente usamos una clase llamada Main. Dentro de esa clase es donde escribimos todo nuestro código.

Java funciona de manera muy orientada a objetos, incluso desde el principio, así que siempre vamos a ver algo como:

```
public class Main {
```

Luego viene la parte más importante: el método main.

El método main es el punto de entrada del programa, es decir, es el lugar donde Java comienza a ejecutar las instrucciones. No importa cuántas clases tenga un proyecto grande, Java siempre va a buscar este método primero:

```
public static void main(String[] args) {
```

Cada una de estas palabras tiene un significado que en este curso exploraremos poco a poco, pero por ahora lo importante es que siempre debe estar escrito exactamente así, porque esta es la firma oficial que Java reconoce para empezar el programa.

Todo el código que escribimos hoy **—declarar variables, leer datos, hacer operaciones, imprimir resultados—** va a ir dentro de las llaves del método main.

Y es importante acostumbrarnos a ver estas llaves `{ }`, porque delimitan bloques de código. Cuando abrimos una llave, estamos diciendo **“a partir de aquí empieza un bloque”.**

Por ejemplo, para la clase abrimos una llave, y la cerramos al final del archivo. Para el método main hacemos lo mismo: abrimos una llave después de la línea del método y la cerramos cuando terminan las instrucciones.

Entender esta estructura desde ahora es muy importante, porque cuando los programas crezcan un poco más, vamos a tener varios métodos, varias clases, y muchos bloques.

Pero lo bueno es que todo empieza igual.

Así que en resumen, la estructura mínima que siempre debemos tener es:

- una clase
- un método main
- llaves que abren y cierran cada bloque

A partir de ahí, podemos escribir cualquier programa que queramos.

Y justo ahora vamos a practicar esta estructura en **JDoodle**, para que la veas funcionando en la vida real.


