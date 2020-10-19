# Chatbot con Telegram usando Spring Boot

Chatbot de telegram que muestra el valor del dolar, euro, utm y uf del día.

## Comenzando 🚀

Clonar el proyecto en un directorio e importar con Eclipse(con SpringTools instalado), Spring Tool Suite 4 o IntelliJ como proyecto Maven.

Antes de desplegar, ir al properties del proyecto (telegram.properties) y reemplazar los valores de: 

```
* telegram.botname=<<NameBot>> 
* telegram.token=<<TokenBot>>
```
Estos valores deben ser reemplazados por los entregados por el BotFather (Nombre y Token).

_Para crear un bot en telegram, visitar https://core.telegram.org/bots y seguir instrucciones_

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

* Java 1.8
* Maven 3.6.3
* Eclipse, Spring Tool Suite 4 o IntelliJ

## Despliegue 📦

Una vez clonado, ejecutar el siguiente comando:

```
mvn spring-boot:run
```

Una vez desplegado, ir a Telegram y buscar el nombre del chatbot creado.
Al iniciar el bot, se ejecutara el comando /start, el cual desplegara un mensaje de información.

![Imágen de ejemplo](./Screenshot_20200928-170022.jpg)

Al seleccionar una palabra, mostrará la información del indicador.

## Ejecutando las pruebas ⚙️

_(EN DESARROLLO)_

## Construido con 🛠️

* [Spring Boot](https://spring.io/projects/spring-boot) - Framework Java
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [TelegramBots](https://github.com/rubenlagus/TelegramBots) - Libreria en Java para crear un chatbot

## Contribuyendo 🖇️

_En desarrollo ..._

## Versionado 📌

_En desarrollo ..._

## Autor ✒️

* **Juan Valenzuela** - [jvalenzuelaortega](https://github.com/jvalenzuelaortega) 

---

