Feature: logueo del aplicativo Tutask

Scenario: Al ingresar al link de Tutask debe completar los campos para loguearse 
Given Ingresar a la URL tutask en Google
When Ingresar el correo
And Ingresar el password
And  Realizar clic en Entrar
Then Obtener ingreso al Home

Scenario: Al ingresara al home seleccionar la opcion tarea normal y creara una nueva tarea
Given Seleccionar el desplegable de nueva tarea
When Seleccionar la opcion Tarea normal
And Se llenan los  3 primeros campos de asunto, etiqueta y descripcion
And Se llenan los 2 ultimos campos invitados, Nedocios
When Seleccionar fecha viable
Then realizar clic en Enviar

Scenario: Crear tareas tipo PQR
Given Seleccionar el desplegable de nueva PQR
When Seleccione la opcion PQR
And Ingresar al ifram, seleccionar el tipo de PQR y seleccionar oficina
When Se llena los campos de canal, numero encargo, codigo negocio, nombre y apellido
When Se llena el campo Negocios
And Seleccionar el tipo de identificador
And Ingresar el numero de documento y el correo
And Ingresar el telefono fijo y celular
When Seleccionar el derecho de peticion, motivo interno y el producto af
And Se escribe una descripcion
Then Se hace clic en el boton Enviar

