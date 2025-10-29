# GPSMapApp

# Descripción

En este documento se muestran los sistemas que se deven implementar para proteger al sistema y sus usuarios de peligros potenciales.
La aplicacion esta diseñada como una herramienta GPS que prioriza la protección de datos del usuario y la integridad del sistema.

## 1. Vulnerabilidades Identificadas

- Inyección SQL  
- Comunicación no segura  
- Exposición de datos sensibles  
- Vulnerabilidad StrandHogg 2.0  
- Permisos peligrosos mal gestionados  
- Logging de información sensible  

## 2. Mejoras Implementadas

- Cifrado de datos sensibles  
- Comunicación segura (HTTPS)  
- Validación y sanitización de entradas  
- Eliminación de credenciales hardcodeadas  
- Desactivación de respaldo de datos ("allowBackup=false")  
- Configuración segura de actividades ("launchMode", "taskAffinity")  

## 3. Documentación

- [Vulnerabilidades](vulnerabilities.md)  
- [Best Practices](best_practices.md)  
- [Security Tips](security_tips.md)  
- [Security Improvement Program](security_improvement_program.md)  

## Cómo Ejecutar la Aplicación de Forma Segura

1. Clonar el repositorio  
2. Importar el proyecto en Android Studio  
3. Ejecutar la aplicación en un dispositivo o emulador  
4. Asegurarse de que los permisos necesarios están configurados correctamente  
5. Verificar que el "targetSdkVersion" esté actualizado  
6. Validar que las conexiones se realicen sobre HTTPS  

## Reporte de Vulnerabilidades

El presente reporte detalla las pruebas de vulnerabilidad realizadas en la aplicacion "GPSMapApp"
