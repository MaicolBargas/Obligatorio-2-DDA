import React, { useState } from "react";
import { useParams } from "react-router-dom";
import { Button } from "react-bootstrap";

export const PaginaCliente = () => {
  let { id } = useParams();

  var [Name, setName] = useState("");

  function mostrarId() {
    alert(id);
  }
  return (
    <div>
      <div className="container">
        <div className="crud shadow-lg p-3 mb-5 mt-5 bg-body rounded">
          <Button onClick={mostrarId}>mostrar id</Button>

          <h3>Nombre del Cliente</h3>
          <input
            placeholder="nombre"
            // value={Name}
            onChangeText={(text) => setName(text)}
          />
          <h3>CI del Cliente</h3>
          <input
            placeholder="nombre"
            // value={Name}
            onChangeText={(text) => setName(text)}
          />
          <h3>Correo Electronico</h3>
          <input
            placeholder="nombre"
            // value={Name}
            onChangeText={(text) => setName(text)}
          />
          <br />
          <br />
          <div
            className="btn-group"
            role="group"
            aria-label="Basic mixed styles example"
          >
            <button type="button" className="btn btn-success">
              Guardar
            </button>
            <button type="button" className="btn btn-warning">
              Middle
            </button>
            <button type="button" className="btn btn-danger">
              Eliminar
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};
