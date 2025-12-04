Guía de Inicio Rápido del Sistema PROFECO

Paso 1: Iniciar el Servidor de Aplicaciones (GlassFish)

Antes de desplegar la aplicación web, el servidor de aplicaciones debe estar corriendo.

Nota Importante: Si no tienes GlassFish configurado en tu IDE o instalado en tu sistema, hemos incluido una carpeta llamada glassfish7 dentro de este paquete.

Puedes utilizar esta carpeta para añadir el servidor a tu entorno (NetBeans, IntelliJ, etc.) e iniciarlo sin necesidad de descargas adicionales.

1.  Abre la pestaña de Servicios o Servers en tu IDE.
2.  Si no aparece GlassFish, selecciona Add Server (Añadir Servidor).
3.  Selecciona GlassFish Server y apunta a la ruta de la carpeta glassfish7 incluida en el proyecto.
4.  Una vez añadido, haz clic derecho sobre el servidor y selecciona Start (Iniciar).

Paso 2: Ejecutar los Microservicios

Localiza y ejecuta los archivos ejecutables (clase main) correspondientes a estos cuatro proyectos. Asegúrate de iniciarlos simultáneamente:
1.  `api-gateway`
2.  `auth-service`
3.  `notification-service`
4.  `quejas-service`

Paso 3: Desplegar el Frontend

Finalmente, ejecuta el proyecto `profeco-webapp`. Esto desplegará la interfaz de usuario en el servidor GlassFish.

Una vez completado el paso 3, se abrirá automáticamente una ventana en tu navegador web predeterminado mostrando la pantalla de inicio del sistema PROFECO.

¡Tu entorno está listo para usarse!
