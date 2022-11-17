import "./App.css";
import NavBar from "./components/NavBar";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import { Home } from "./components/Pages/Home";
import { PaginaClientes } from "./components/Pages/PaginaClientes";
import { PaginaCliente } from "./components/Pages/PaginaCliente";
import { Login } from "./components/Pages/Login";
import { PaginaPlanes } from "./components/Pages/PaginaPlanes"

function App() {
  return (
    <>
      <Router>
        <NavBar />
        <div className="pages">
          <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/clientes" component={PaginaClientes} />
            <Route path="/cliente/:id" component={PaginaCliente} />
            <Route path="/planes" component={PaginaPlanes} />
            <Route path="/login" component={Login} />
          </Switch>
        </div>
      </Router>
    </>
  );
}

export default App;

