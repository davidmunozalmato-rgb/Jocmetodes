# 🗡️ Juego de Combate en Java

Este proyecto es un juego sencillo de combate desarrollado en **Java**, utilizando **clases y métodos** para representar personajes, monstruos y la lógica del juego.

El programa permite simular enfrentamientos entre distintos personajes con habilidades diferentes.

---

## 📂 Estructura del Proyecto

El proyecto está organizado en varias clases, cada una con una responsabilidad específica:

### `Main.java`
Es el **punto de entrada del programa**.  
Desde esta clase se inicia el juego y se ejecuta la lógica principal.

### `Controller.java`
Se encarga de **controlar el flujo del juego**, coordinando las acciones entre los personajes y los monstruos.

### `personajes.java`
Clase base donde se definen las **características generales de los personajes**, como por ejemplo:
- Vida
- Ataque
- Defensa
- Métodos de combate

Sirve como base para otros tipos de personajes.

### `Guerrer.java`
Representa el **personaje Guerrero**.  
Este tipo de personaje suele tener:
- Mayor vida
- Ataques físicos más fuertes

Puede incluir métodos específicos para habilidades del guerrero.

### `Mag.java`
Representa el **personaje Mago**.  
Normalmente tiene:
- Ataques mágicos
- Menor defensa pero habilidades especiales

### `Monstre.java`
Clase que representa a los **enemigos del juego**.  
Define atributos como:
- Vida del monstruo
- Daño que puede causar
- Métodos para atacar al jugador

---

## ⚙️ Funcionamiento del Juego

1. El programa inicia desde `Main.java`.
2. Se crean los personajes (guerrero o mago).
3. El `Controller` gestiona las acciones del juego.
4. Los personajes se enfrentan contra los monstruos.
5. El combate continúa hasta que uno de los participantes pierde toda su vida.

---

## ▶️ Cómo ejecutar el proyecto

1. Compilar todos los archivos `.java`

```bash
javac *.java
