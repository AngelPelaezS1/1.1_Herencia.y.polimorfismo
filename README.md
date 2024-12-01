Este proyecto incluye una serie de ejercicios diseñados para practicar conceptos avanzados de programación en Java, como herencia, clases abstractas, métodos estáticos y la implementación de interfaces.

Ejercicio 1: Gestión de Instrumentos Musicales

Crea una jerarquía de clases para representar instrumentos musicales, con las siguientes características:

Atributos comunes: Todos los instrumentos tienen un nombre y un precio.
Método común: Un método tocar(), definido como abstracto en la clase base Instrument, que debe ser implementado en las clases hijas:
Instrumentos de viento: Muestra “Está sonando un instrumento de viento”.
Instrumentos de cuerda: Muestra “Está sonando un instrumento de cuerda”.
Instrumentos de percusión: Muestra “Está sonando un instrumento de percusión”.
Adicional:

Investiga los bloques de inicialización y bloques estáticos en Java.
Demuestra cómo se carga una clase al crear la primera instancia o al acceder a un miembro estático.
Ejercicio 2: Clase "Coche" y Métodos Estáticos

Crea una clase Coche con los siguientes atributos y características:

Atributos:
marca: Estático y final.
modelo: Estático.
potencia: Final.
Tareas:

Demuestra la diferencia entre estos modificadores y cuál puede inicializarse en el constructor.
Añade dos métodos:
frenar(): Método estático que muestra “El vehículo está frenando”.
acelerar(): Método no estático que muestra “El vehículo está acelerando”.
Desde el método main():

Muestra cómo invocar tanto el método estático como el no estático.
Nivel 2: Gestión de Teléfonos y Smartphones

Crea un conjunto de clases y una jerarquía con los siguientes requisitos:

Clase Teléfono:
Atributos: marca y modelo.
Método trucar(): Recibe un número de teléfono (String) y muestra por consola “Se está llamando al número [número]”.
Interfaz Cámara:
Método fotografiar(): Muestra por consola “Se está haciendo una foto”.
Interfaz Reloj:
Método alarma(): Muestra por consola “Está sonando la alarma”.
Clase Smartphone:
Subclase de Teléfono.
Implementa las interfaces Cámara y Reloj.
Implementa los métodos de las interfaces con los mensajes especificados.
Desde el método main():

Crea un objeto Smartphone y utiliza todos los métodos implementados.
