# Vulnerabilidades Detectadas – GPSMapApp

Este documento resume las vulnerabilidades encontradas en el análisis estático realizado con MobSF sobre la aplicación Android GPSMapApp.
El análisis se hizo el 28 de octubre de 2025 y arrojó una puntuación de seguridad de 55/100 (Riesgo Medio).

##1. Vulnerabilidad StrandHogg 2.0
- Componente en Riesgo: MainActivity
- Severidad: Alta
- Descripción: La actividad principal es vulnerable a la técnica de secuestro de tareas conocida como StrandHogg 2.0.
  Esto permite que otras apps maliciosas superpongan pantallas falsas para realizar ataques de phishing.


## 2. Permiso de respaldo habilitado
- Flag: android:allowBackup=true
- Severidad: Media
- Descripción: Permite que los datos de la app sean respaldados vía ADB, lo que puede exponer información sensible si el dispositivo tiene depuración USB activa.


## 3. Información sensible hardcodeada
- Archivo: com/example/gpsmapapp/GPS.java
- Severidad: Media
- Descripción: Se detectó posible almacenamiento en texto claro de credenciales o claves.


## 4. Logging de información
- Archivo: com/example/gpsmapapp/GPS.java
- Severidad: Info
- Descripción: La app realiza logging de información que podría incluir datos sensibles.


## Permisos Abusados

| Permiso                         | Tipo      | Descripción breve         |
|--------------------------------|-----------|----------------------------|
| ACCESS_FINE_LOCATION           | Peligroso | Acceso a ubicación GPS     |
| ACCESS_COARSE_LOCATION         | Peligroso | Ubicación por red          |
| INTERNET                       | Normal    | Acceso a red               |

Estos permisos coinciden con 3 de los 25 permisos comúnmente abusados por malware, lo que puede poner en riesgo datos sencibles.










