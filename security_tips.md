# Tips de Seguridad

En este documento se muestran diversos tips para mejorar la seguridad del sistema.

## 1. Desactivar el respaldo de datos (`android:allowBackup="false"`)

- Expliacion: Evita que los usuarios con acceso físico y depuración USB puedan extraer datos sensibles de la aplicación mediante herramientas ADB.


## 2. Configurar "launchMode="singleInstance" y "taskAffinity="""

- Explicacion: Esto protege contra ataques de tipo StrandHogg eh impide que otras aplicaciones maliciosas sobrepongan actividades falsas sobre la interfaz real.


## 3. Evitar el uso de logs para datos sensibles

- Esto se recomienda ya que Reduce el riesgo de exposición accidental de información sensible en registros accesibles por diversas personas o durante la depuración o ejecucucion.


## 4. Usar HTTPS para todas las comunicaciones

- Explicacion: Garantiza la confidencialidad e integridad de los datos transmitidos, evitando ataques de tipo man-in-the-middle o otros similares.


## 5. Implementar Network Security Config

- Explicacion: Permite definir políticas de seguridad para conexiones de red, restringiendo dominios permitidos y deshabilitando certificados inseguros.


## Siguiendo etos tips de seguridad es posible conseguir un sistema mas robusto y seguro.




