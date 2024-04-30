# Conversor de Divisas

Desafio de Allura para implementar el consumo de Apis con codigo java, implementando los siguientes elementos:

### ExchangeRate Api
Api utilizada para obtener los parametros de conversion de cada divisa con nuestra divisa base

https://www.exchangerate-api.com/docs/overview

### Java.net

Utilizando esta libreria implementamos los modulos:

- `HttpClient`
- `HttpRequest`
- `HttResponse`

Utilizados para generar una conexion a la Api y posteriormente realizar una consulta de tipo GET para optener los datos necesario

### Jave.time

Se utiliza para obtener la fecha y hora actual de la pc y colocarla en el registro de consultas que se an realizado con el metodo `LocalDateTime`

### GSON

Utilizamos la liberia gson para deszerializar los elementos que obtenemos del json que nos provee APi

### JOptionPane

Se crean crean ventanas interactivas con JOptionPane de tipo:

- `showInputDialog` : Para solicitar datos
- `showMessageDialog` : Para mostrar los datos
