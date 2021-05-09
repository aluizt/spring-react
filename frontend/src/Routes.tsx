import Dashboard from "pages/Dashboard/dashboard"
import Home from "pages/Home/home"
import React from "react"
import {BrowserRouter, Route, Switch} from "react-router-dom"

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard" exact>
                    <Dashboard />
                </Route>
            </Switch>

        </BrowserRouter>
    )
}

export default Routes