# Etakemon_Projecte
Projecte de DSA

Etakémon: The CBL adventure
--------------------------
**Descripción del proyecto**

Crearemos un juego que se llama “Etakemon: The CBL adventure”.
Cada jugador tendrá un usuario registrado en el juego y podrá capturar criaturas basadas en profesores y alumnos (etakemons).
Cada vez que se inicie el juego se tendrá que iniciar sesión.
En tu usuario tendrás guardado tu perfil, tus etakemons capturados, puntos de experiencia, batallas jugadas y batallas ganadas.
Para capturar un etakemons tendrás que acercarte a su ubicación y aparecerá un botón de “CAPTURAR”. Se lanzará una nueva pantalla con información del etakemon, las posibilidades de atraparlo en función de tu experiencia como cazador (habrá oportunidades limitadas). Y una vez este atrapado este se añadirá a tu lista de etakemons capturados. 
Entonces ya podrás entrenar al etakemon (Habrá combates entre el etakemon que selecciones y uno de la IA)
Cada etakemon tendrá una cantidad de vida, un nivel de ataque, un nivel de defensa y un ataque aleatorio procedente de una lista genérica de ataques.
En los combates el ataque vendrá definido del nivel de ataque que tenga más el daño de la habilidad en concreto que tenga. Y el receptor del ataque aplicará sus valores defensivos al ataque recibido.
Si se da el caso que capturas el mismo etakemon varias veces, existirá la opción de “CONSUMIR” el etakemon del mismo tipo para hacer que tu etakemon gane un crédito. Dichos créditos sirven para mejorar un atributo de ese etakemon. La habilidad es fija, no se puede cambiar. Ten suerte y consigue otro etakemon igual con una habilidad diferente y mejóralo!
La posibilidad de capturar un etakemon aumenta con tu nivel de experiencia, esta experiencia se mejora ganando combates. Cuantos más combates ganes, más experiencia tendrás y más etakemons podrás capturar para aumentar tu colección o conseguir créditos y mejorar los atributos de tus etakemons.
----------------------------
**Parte Android**

En ella aparecerán las pantallas de login, crear cuenta (en caso de no tenerla todavía y te redirige a la página web) y la pantalla propia del juego una vez logueado.
Una vez en la pantalla del juego habrá un botón que te llevará a un menú con: perfil de usuario, tus etakemons, etakedex, objetos y logros.
La pantalla de juego mostrará un mapa en el cual irán apareciendo etakemons y etakeStops.
Los etakeStops mostrarán un pequeño cuestionario y si se realiza correctamente se obtendrá objetos a cambio (pociones, revivir, etc.)

-----------------------------
**Parte Web**

La página web mostrará un menú inicial.
Dicho menú tendrá las diferentes opciones: Crear cuenta, recuperar tus datos (user o pass), loguearte, consultar el perfil, consultar el ranking, ver tus logros, etakedex, tus etakemons, entrena tus etakemons, consultar habilidades y un pequeño tutorial sobre el juego.
Los logros consisten por ejemplo en capturar X etakemons, etc.

--------------------------------
**Funciones **
-	añadir usuario
-	eliminar usuario
-	modificar usuario (nombre, contraseña..)
-	login
-	mostrar usuario concreto(datos, etakemons, objetos…)
-	mostrar lista de usuarios 
-	logros de usuario
-	lista de etakemon de usuario
-	capturar etakemon
-	añadir experiencia al usuario
-	consumir etakemon
-	mostrar información del juego
-	mostrar FAQ
-	cálculo probabilidad atrapar etakemon en función te tu experiencia
-	mostrar etakedex
-	mostrar lista habilidades genéricas
-	Interactuar con una etakeStop
-	Selección cuestionario para la etakeStop
-	Usar créditos para mejorar atributos de un etakemon
-	entrenar al etakemon (para ganar experiencia)
o	seleccionar etakemon para jugar
o	atacar
o	salir del combate
