import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Login from './components/Login';
import SignUp from './components/SignUp';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import axios from 'axios';




class App extends Component {
  _isAuthHandler = (auth=true) => {
    this.setState({
      isAuth: auth
    })
  }    
      
  render() {
    return (
             <Router>
             <div className ="container">
             <Route path='/login' component={(props) => <Login props={props} _isAuthHandler={this._isAuthHandler} /> }/>
              <Route path='/signup' component={(props) => <SignUp props={props} _isAuthHandler={this._isAuthHandler} />} />
             </div>
             </Router>
    
    );
  }
}

export default App;
