 GPSMapApp 

Esta es una aplicación diseñada para mostrar la ubicacion actual del usuario al precionar un boton
tambien permite descargar una imagen

 Características del GPS

- Solicitud de permisos de ubicación en tiempo de ejecución
- Obtención de ubicación actual mediante ´FusedLocationProviderClient´
- Generación de mapa estático con marcador usando Google Static Maps API
- Visualización del mapa en un ´ImageView´
- Compatible con emuladores y dispositivos físicos

 Tecnologías utilizadas

- Java
- Android SDK
- Google Play Services (Location)
- Google Maps Static API
- Picasso (para cargar imágenes desde URL)

 Características de la descarga de Imagen 

- Obtencion de imagen al precionar un boton 
- Visualizacion de la imagen en un ´ImagenView´

 Tecnologías utilizadas

- Java
- XML


 Permisos requeridos

´´´xml´´´
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />

 Llave

<meta-data
android:name="com.google.android.geo.API_KEY"
android:value="AIzaSyDNVYEYXYLu2D3Gorih_HKSYAuvhnJhY-0" />





