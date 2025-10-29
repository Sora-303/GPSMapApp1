## Programa de Mejora de Seguridad

En este documento se describe la la estructura del programa propuesto.

## 1. Objetivos del Programa

- Evaluar y mejorar la seguridad de la aplicación.
- Establecer un proceso de revisión periódica de la seguridad. 
- Identificar métricas clave para medir la seguridad de la aplicación.


## 2. Evaluación Inicial

- Herramienta utilizada: MobSF v4.4.3
- Fecha del análisis: 28 de octubre de 2025
- Puntuación de seguridad: 55/100 (Riesgo Medio)
- Vulnerabilidades detectadas:
  - StrandHogg 2.0 en ".MainActivity"
  - Permiso de respaldo habilitado ("allowBackup=true")
  - Logging de información sensible
  - Hardcoded credentials en "GPS.java"

## 3. Proceso de Revisión Periódica

| Fase                  | Frecuencia     | Actividades clave                                 |
|-----------------------|----------------|---------------------------------------------------|
| Análisis estático     | Mensual        | Uso de MobSF, revisión de código fuente           |
| Auditoría de permisos | Trimestral     | Validación de permisos declarados y su uso real   |
| Pruebas dinámicas     | Semestral      | Simulación de ataques, análisis de comportamiento |
| Revisión de dependencias | Mensual     | Actualización de librerías y SDKs                 |
| Informe de seguridad  | Trimestral     | Documentación de hallazgos y acciones tomadas     |


## 4. Métricas Clave

| Métrica                             | Descripción                                         |
|-------------------------------------|-----------------------------------------------------|
| Puntuación de seguridad MobSF       | Indicador general del estado de seguridad           |
| Número de vulnerabilidades críticas | Riesgos que requieren atención inmediata            |
| Porcentaje de componentes exportados | Actividades, servicios, etc. expuestos públicamente |
| Uso de permisos peligrosos          | Cantidad y justificación de permisos sensibles       |
| Tiempo promedio de remediación      | Días entre detección y corrección de vulnerabilidades|


## 5. Mejoras Implementadas

- Desactivación de "allowBackup" en "AndroidManifest.xml"
- Configuración de "launchMode="singleInstance"" y "taskAffinity=""" para mitigar StrandHogg
- Eliminación de credenciales hardcodeadas
- Revisión de logs para evitar exposición de datos sensibles
- Validación de uso de permisos y justificación funcional


## 6. Plan de Acción Futuro

| Acción                                       | Responsable       | Fecha estimada |
|---------------------------------------------|-------------------|----------------|
| Actualizar "targetSdkVersion" a 33          | Equipo de desarrollo | Noviembre 2025 |
| Implementar Network Security Config         | Seguridad & DevOps  | Noviembre 2025 |
| Integrar análisis de seguridad en CI/CD     | DevOps              | Diciembre 2025 |
| Migrar almacenamiento sensible al Keystore  | Backend             | Diciembre 2025 |
| Realizar pruebas dinámicas con emuladores   | QA                  | Enero 2026     |

