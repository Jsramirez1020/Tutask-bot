@Grid
Feature: logueo del aplicativo Tutask
  @Smoke @Regression
Scenario Outline: Al ingresar al link de Tutask debe completar los campos para loguearse
Given Ingresar a la URL tutask en Google
When Ingresar el <state> correo
And Ingresar el <password> password
And  Realizar clic en Entrar
Then Obtener ingreso al Home
#Scenario: Al ingresara al home seleccionar la opcion tarea normal y creara una nueva tarea
Given Seleccionar el desplegable de nueva tarea
When Seleccionar la opcion Tarea normal
And Se llenan los  3 primeros campos de <asuntos> asunto, <etiquetas> etiqueta y descripcion
And Se llenan los 2 ultimos campos <invitados> invitados, <negocios> Nedocios
When Seleccionar fecha viable
Then realizar clic en Enviar
#Scenario: Crear tareas tipo PQR
Given Seleccionar el desplegable de nueva PQR
When Seleccione la opcion PQR
And Ingresar al ifram, seleccionar el tipo de PQR y seleccionar oficina
When Se llena los campos de canal, <numeroE> numero encargo, <codNegocio> codigo negocio, <nombreR> nombre y <apellidoR> apellido
When Se llena el campo <negocios> Negocios
And Seleccionar el tipo de identificador
And Ingresar el <state> correo y el <id> numero de identificacion
And Ingresar el <telefono> telefono fijo y <celular> celular
When Seleccionar el derecho de peticion, motivo interno y el producto af
And Se escribe una <descripcion> descripcion
Then Se hace clic en el boton Enviar
When Icono sesion
Then cerrar sesion
    Examples:
      | state                        | password | asuntos        | etiquetas             | invitados    | negocios | numeroE | codNegocio | nombreR | apellidoR| id        | telefono| celular  | descripcion                                             |
      |paola.gomez@xyz.com.co        | f1t1d34s | Prueba selenium| bacata                | Alexandra    | FA-220   | 20      | 25         | Jose    | Rodriguez| 1000000000| 2470830| 3058734961| pruebas Selenium, pruebas Selenium, pruebas Selenium    |
      |lorena.rodriguez@xyz.com.co   | f1t1d34s | QA SELENIUM    | DESCUENTO DE COMISION | Paola g      | FA-1011  | 16      | 18         | ********| apellido | 5178698738| 3639728| 3105763466| Preubas automatizadas de QA, Preubas automatizadas de QA|
      |duvan.garcia@xyz.com.co       | f1t1d34s | Barrido        | prueba                | diana c     | FA-2200  | 15      | 13         | Prueba  | QA       | 334789    | 4641066| 3227896311| Barrido de tutask, Barrido de tutask, Barrido de tutask |








