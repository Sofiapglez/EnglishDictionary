# EnglishDictionary

Este proyecto desarrolla una herramienta que permite clasificar 
y almacenar palabras por su inicial para encontrarlas en el diccionario.

El proyecto está formado por dos clases principales:

- **La clase net.duolingo.diccionario.PalabrasPorInicial**: Permite agregar palabras al diccionario,
eliminar palabras del diccionario, buscar palabras en el diccionario
y mostrar todas las palabras almacenadas que comienzan por una determinada inicial.

- - Usa un HashMap<Character, Set<String>> para almacenar las palabras.
El método Character.toLowerCase() para convierte todas las letras a 
minúsculas.

- - Los métodos agregarPalabra, eliminarPalabra y existePalabra realizan una 
sanitización de las palabras antes de insertarlas o buscarlas en el 
diccionario. Esto se hace mediante el método sanitizarPalabra.

- - El método verPalabrasPorInicial muestra todas las palabras almacenadas 
que comienzan por la letra inicial indicada.

- - El método mostrarInicialesDisponibles muestra una lista con todas las 
iniciales que tienen alguna palabra almacenada. Si no hay palabras 
almacenadas en el diccionario, se muestra un mensaje indicando que no hay 
iniciales disponibles


- **La clase net.duolingo.Main:** Es la clase ejecutable del proyecto, que proporciona un menú
de usuario para interactuar con el diccionario de palabras clasificadas por inicial.

