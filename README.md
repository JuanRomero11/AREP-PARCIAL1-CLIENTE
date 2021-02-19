# Parcial primer corte
# Profesor: Luis Daniel Benavides
# AREP - Arquitecturas Empresariales 2021-1

## Prerrequisitos

Como primera medida se debera intalar el JDK y maven y si es necesario un editor como ECLIPSE,NETBEANS,etc. Si solo se quiere ejecutar el proyecto de manera local solo se necesitara el JDK y maven. Para el JDK JAVA se instala la versión 8, a continuacion se adjuntara el link donde muestran las instrucciones detalladas de como descargar este y ademas en esta mismo link se podra realizar la descarga y futura instalacion, de igual forma se adjunta el link de la pagina oficial de maven en el cual esta el instructivo detallado y los paquetes necesarios para la version del sistema operativo en el cual se ejecutara, y por ultimo es recomdable descargar la aplicacion git tambien se anexara el link desde la pagina oficial, se anexan los links debido a que se especifican mas en cada uno con respecto a cada sistema operativo y no uno en especifico.

### Instalacion

Descargar JDK e instrucciones de instalacion
https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
Descargar maven e instrucciones de instalacion
https://maven.apache.org/download.cgi
Descargar Git e instrucciones de instalacion
https://git-scm.com/downloads

## Construccion
Este proyecto basicamente esta construido en maven y el editor que se utilizo fue NetBeans, teniendo el JDK antes mencionado, especificamente se utilizo el lenguaje Java, con el mini framework spark y el despliegue se realizo en heroku.

## Diseño

![alt text](https://github.com/JuanRomero11/AREP-PARCIAL1-TrigCalculator/blob/main/imagenes/descargaParcial.png)


En este repo esta la Fachada y en este el trigCalculator asociado
https://github.com/JuanRomero11/AREP-PARCIAL1-TrigCalculator

## Descripcion del diseño


## Como usar el Proyecto
En este mismo repositorio puede clonar o descargar el proyecto a traves de la aplicacion git ya instalada en su computador. Recomendacion, Si se clona utilizar el comando :

        git clone https://github.com/JuanRomero11/AREP-PARCIAL1-TrigCalculator.git
        
Despues de que el proyecto esta clonado se accede a la consola del computador en este caso accedemos a la terminal de comandos de Windows(cmd) y entramos directamente en la carpeta en donde esta nuestro proyecto y como primer paso compilamos con el comando 

        mvn package
        
## Despliegue

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://calm-cliffs-88878.herokuapp.com/index?calcular=cos-3.1415)

## Integracion continua

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)]()

## Ejecución de Pruebas

Para ejecutar las pruebas se pueden utilizar dos comandos:

          mvn package
          
          mvn test
          
Despues de ello se ejecutan todas las pruebas realizadas 

Las pruebas se realizaron con los siguientes datos:

![alt text](https://github.com/JuanRomero11/AREP-PARCIAL1-TrigCalculator/blob/main/imagenes/desliegueHeroku.PNG)

Aqui se puede eviendeciaor que los parametros para que funcione la apliacion tiene que ser la operacion que quiere realizar como
        
                cos
                sen
                tang
                
y un guion seguido del numero al que le quiere realizar la operacion 
 
https://calm-cliffs-88878.herokuapp.com/index?calcular={operacion}-{numero}


## Autor
Juan Guillermo Romero 
## License
Este codigo tiene una licencia Apache License 2.0 la cual se detalla en https://github.com/JuanRomero11/AREP-PARCIAL1-TrigCalculator/blob/main/LICENSE

Despliegue 
https://calm-cliffs-88878.herokuapp.com/index?calcular=cos-3.1415
