import "bootstrap/dist/css/bootstrap.min.css";
import { useState } from "react";
import { Button, Modal } from "react-bootstrap";
import { users } from "../users";
import { Cliente } from "./Cliente";
import { Filtrar } from "./Filtrar";
import { NavLink } from "react-router-dom";

function Table() {
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  const [filter, setFilter] = useState("");
  const clientesFiltrados = users.filter((user) =>
    user.first_name.toLocaleLowerCase().includes(filter.toLocaleLowerCase())
  );

  return (
    <div class="container">
      <div className="crud shadow-lg p-3 mb-5 mt-5 bg-body rounded">
        <div class="row ">
          <div class="col-sm-3 mt-5 mb-4 text-gred">
            <div className="search">
              <form class="form-inline">
                <Filtrar filter={filter} setFilter={setFilter} />
              </form>
            </div>
          </div>
          <div
            class="col-sm-3 offset-sm-2 mt-5 mb-4 text-gred"
            style={{ color: "green" }}
          >
            <h2>
              <b>Clientes</b>
            </h2>
          </div>
          <div class="col-sm-3 offset-sm-1  mt-5 mb-4 text-gred">
            <Button variant="primary" onClick={handleShow}>
              Add New Cliente
            </Button>
          </div>
        </div>
        <div class="row">
          <div class="table-responsive ">
            <table class="table table-striped table-hover table-bordered">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Nombre</th>
                  <th>Apellido</th>
                  <th>Email </th>
                  <th>Genero </th>
                  <th>Actions</th>
                </tr>
              </thead>
              <tbody>
                {clientesFiltrados.length > 0 ? (
                  clientesFiltrados.map((user) => (
                    <tr>
                      <td>{user.id}</td>
                      <td>{user.first_name}</td>
                      <td>{user.last_name}</td>
                      <td>{user.email}</td>
                      <td>{user.gender}</td>
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
                          to={"/Cliente/" + user.id}
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
                    No se encontro ningun Cliente con la busqueda{" "}
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
              <Modal.Title>Add Record</Modal.Title>
            </Modal.Header>
            <Modal.Body>
              <Cliente />
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
