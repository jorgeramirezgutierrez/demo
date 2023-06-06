// Call the dataTables jQuery plugin
$(document).ready(function() {
});

 async function registrarUsuarios(){
let datos = {};

datos.nombre = '';
  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
body: JSON.stringify(datos)
  });
  const usuarios = await request.json();


}
