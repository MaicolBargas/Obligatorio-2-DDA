import React from "react";
import { useParams } from "react-router-dom";
import { Button } from "react-bootstrap";



export const PaginaCliente = () => {
  let { id } = useParams();

  function mostrarId(){
    alert(id);
  }
  return (
    <div>
      <h1>Pagina de Cliente</h1>
      <Button onClick={mostrarId}>mostrar id</Button>
    </div>
  );
};
