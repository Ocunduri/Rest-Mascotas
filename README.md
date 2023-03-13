# Rest-Mascotas

Escuela Politécnica Nacional
Facultad de sistemas

Grupo 2: API MASCOTAS

1.	Obtener todas las mascotas
Para obtener un listado de todas las mascotas existentes:
GET /mascotas/

2.	Obtener mascota por su ID
Para obtener una única mascota dependiendo de su id:
GET/mascotas/{id}

3.	Crear una nueva mascota
Para crear una nueva mascota:

POST /mascotas
{ "nombre": "Luna", "edad": 2 }

Nota: Es necesario enviar una mascota en formato JSON, el cual debe contener el nombre y la edad de la mascota.

4.	Actualizar una mascota existente
Para la actualización de una mascota existente.

PUT /mascotas/update

5.	Eliminar una mascota
Para eliminar una mascota por su id:

DELETE /mascotas/delete/{id}
