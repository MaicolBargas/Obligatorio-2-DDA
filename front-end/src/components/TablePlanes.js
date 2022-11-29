import "bootstrap/dist/css/bootstrap.min.css";
import { useEffect, useState } from "react";
import { Button, Modal } from "react-bootstrap";
import { Filtrar } from "./Filtrar";
import { NavLink } from "react-router-dom";

import "../App.css";
import FormInput from "./FormInput";

import fetch from "cross-fetch";

function Table() {
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  const handleSubmit = (e) => {
    e.preventDefault();
  };

  //METODO LISTAR CLIENTES
  const [clients, setClients] = useState([]);
  useEffect(() => {
    fetch("http://localhost:8080/plan/list")
      .then((res) => res.json())
      .then((result) => {
        setClients(result);
      });
  }, []);
  //------------------------------------------------------------------------------------------

  //METODO POST
  const altaPlan = (e) => {
    var url = "http://localhost:8080/plan/add";
    var data = {
      ci: values.ci,
      nombre: values.name,
      apellido: values.apellido,
      email: values.email,
    };
    console.log(data);
    fetch(url, {
      method: "POST", // or 'PUT'
      body: JSON.stringify(data), // data can be `string` or {object}!
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((res) => res.json())
      .catch((error) => console.error("Error:", error))
      .then((response) => console.log("Success:", response));
  };
  //------------------------------------------------------------------------------------------

  //FORMULARIO ALTA CLIENTE
  const onChange = (e) => {
    setValues({ ...values, [e.target.name]: e.target.value });
  };

  const [values, setValues] = useState({
    ci: "",
    name: "",
    apellido: "",
    email: "",
  });

  const inputs = [
    {
      id: 1,
      name: "ci",
      type: "text",
      placeholder: "CI",
      errorMessage:
        "CI should be 7-8 characters and shouldn't include any special character!",
      label: "CI",
      pattern: "^[z0-9]{7,8}$",
      required: true,
    },
    {
      id: 2,
      name: "name",
      type: "text",
      placeholder: "Name",
      errorMessage:
        "Name should be 5-30 characters and shouldn't include any special character!",
      pattern: "^[A-Za-z0-9]{5,30}$",
      label: "Name",
      required: true,
    },
    {
      id: 3,
      name: "apellido",
      type: "text",
      placeholder: "Apellido",
      errorMessage:
        "Name should be 5-30 characters and shouldn't include any special character!",
      pattern: "^[A-Za-z0-9]{5,30}$",
      label: "Email",
      required: true,
    },
    {
      id: 4,
      name: "email",
      type: "email",
      placeholder: "Email",
      errorMessage: "It should be a valid email address!",
      label: "Email",
      required: true,
    },
  ];
  //------------------------------------------------------------------------------------------

  //FILTRAR CLIENTES
  const [filter, setFilter] = useState("");
  const planesFiltrados = clients.filter((client) =>
    client.nombre.toLocaleLowerCase().includes(filter.toLocaleLowerCase())
  );
  //------------------------------------------------------------------------------------------

  return (
    <div className="container">
      <div className="crud shadow-lg p-3 mb-5 mt-5 bg-body rounded">
        <div className="row ">
          <div className="col-sm-3 mt-5 mb-4 text-gred">
            <div className="search">
              <form className="form-inline">
                <Filtrar filter={filter} setFilter={setFilter} />
              </form>
            </div>
          </div>
          <div
            className="col-sm-3 offset-sm-2 mt-5 mb-4 text-gred"
            style={{ color: "green" }}
          >
            <h2>
              <b>Planes</b>
            </h2>
          </div>
          <div className="col-sm-3 offset-sm-1  mt-5 mb-4 text-gred">
            <Button variant="primary" onClick={handleShow}>
              Add New Plan
            </Button>
          </div>
        </div>
        <div className="row">
          <div className="table-responsive ">
            <table className="table table-striped table-hover table-bordered">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Nombre</th>
                  <th>Apellido</th>
                  <th>Email </th>
                  <th>Actions</th>
                </tr>
              </thead>
              <tbody>
                {planesFiltrados.length > 0 ? (
                  planesFiltrados.map((client) => (
                    <tr>
                      <td>{client.ci}</td>
                      <td>{client.nombre}</td>
                      <td>{client.apellido}</td>
                      <td>{client.email}</td>
                      <td>
                        {/* <a
                          href="#"
                          class="view"
                          title="View"
                          data-toggle="tooltip"
                          style={{ color: "#10ab80" }}
                          onClick={handleShowDelete}
                        >
                          <i class="material-icons">&#xE417;</i>
                        </a>
                        <a
                          href="#"
                          class="edit"
                          title="Edit"
                          data-toggle="tooltip"
                        >
                          <i class="material-icons">&#xE254;</i>
                        </a>
                        <a
                          href="#"
                          class="delete"
                          title="Delete"
                          data-toggle="tooltip"
                          style={{ color: "red" }}
                        >
                          <i class="material-icons">&#xE872;</i>
                        </a> */}
                        <NavLink
                          exact
                          to={"/Plan/" + client.ci}
                          activeClassName="active"
                          className="nav-links"
                        >
                          <Button variant="info" size="sm">
                            Editar
                          </Button>
                        </NavLink>
                      </td>
                    </tr>
                  ))
                ) : (
                  <h5>
                    No se encontro ningun Plan con la busqueda{" "}
                    <strong>"{filter}"</strong>.
                  </h5>
                )}
              </tbody>
            </table>
          </div>
        </div>

        {/* <!--- Model Box ---> */}
        <div className="model_box">
          <Modal
            show={show}
            onHide={handleClose}
            backdrop="static"
            keyboard={false}
          >
            <Modal.Header closeButton>
              <Modal.Title>Add Plan</Modal.Title>
            </Modal.Header>
            <Modal.Body>
              <div className="container-form">
                <form onSubmit={handleSubmit}>
                  <h1>Plan</h1>
                  {inputs.map((input) => (
                    <FormInput
                      key={input.id}
                      {...input}
                      value={values[input.name]}
                      onChange={onChange}
                    />
                  ))}
                  <button className="Mybutton" onClick={altaPlan}>
                    Submit
                  </button>
                </form>
              </div>
            </Modal.Body>

            <Modal.Footer>
              <Button variant="secondary" onClick={handleClose}>
                Close
              </Button>
            </Modal.Footer>
          </Modal>

          {/* Model Box Finsihs */}
        </div>
      </div>
    </div>
  );
}

export default Table;
