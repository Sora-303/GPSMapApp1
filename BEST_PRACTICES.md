# Buenas Prácticas de Seguridad

Este documento documenta las buenas prácticas que se implementaran para fortalecer la seguridad de esta aplicacion Android.

## 1. Configuración Segura del AndroidManifest.xml

- Deshabilitar el respaldo de datos si no es estrictamente necesario:
- se deve implementar launchMode="singleInstance" y taskAffinity="" para prevenir ataques de tipo StrandHogg.
- Se deven Declarar claros los permisos requeridos por la aplicacion y dejar justificado su uso en la misma.

## 2. Gestion Segura de Permisos

- Solo se deven deven solicitar permisos nesesarios.
- Evitar el la solicitud de permisos como "Accesos a tu ubicacion actual" de no ser nesesario.

## 3. Manejo Seguro de Datos Sencible

- No se deven almacenar credenciales, claves API o tokens directamente en el codigo principal.
- Se deve implmnetar "Android Keystore para el almacenamiento de datos de forma segura.
- Se deve evitar ek uso de logs para registrar informacion sensible.

## 4. Seguridad de Red

- Se deve asegurar que todas las comunicaciones se realicen por medio de HTTPS.
- Implementar Network Security Config para restringir dominios permitidos y deshabilitar certificados no confiables

## 5. Actualización del SDK y dependencias

- Mnatener actualizado el "targetSdkVersion"
- se deven revisar y actualizar las dependencias regularmente para evitar vulnerabilidades.

## siguiendo estas practicas se puede mantener un sistema mas seguro y confiable.
