import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Topics from './components/Topics';
import Home from './components/Home';
import Classes from './components/Classes';
import Variables from './components/Variables';
import Declarations from './components/Declarations';
import Methods from './components/Methods';
import Constructors from './components/Constructors';
import IfSentences from './components/IfSentences';
import Loops from './components/Loops';
import './App.css';

class App extends Component {
  state = {
    topics: [
      { key: 0, name: 'Hjem', path: '/home', component: 'Home' },
      { key: 1, name: 'Klasse', path: '/classes', component: 'Classes' },
      { key: 2, name: 'Variabler', path: '/variables', component: 'Variables' },
      { key: 3, name: 'Deklarering og initialisering af variabler', path: '/declaration_and_initialization_of_variables', component: 'Declarations' },
      { key: 4, name: 'Metoder', path: '/methods', component: 'Methods' },
      { key: 5, name: 'Constructors', path: '/constructors', component: 'Constructors' },
      { key: 6, name: 'If sætninger', path: 'if_sentences', component: 'IfSentences' },
      { key: 7, name: 'Loops', path: '/loops', component: 'Loops' },
    ],
    displayNavigation: true
  }

  handleDisplayNavigation = () => {
    const displayNavigation = this.state.displayNavigation;
    this.setState({displayNavigation: !displayNavigation});
  }

  render() {
    return <Router>
        <div className="App">
          <div className="navigation">
            <div className="container">
              <Topics topics={this.state.topics} displayNavigation={this.state.displayNavigation} />
              <button onClick={this.handleDisplayNavigation} className="toggleNavigationButton">Menu</button>
            </div>
          </div>

          <div className="container">
            <div className="page">
              <Switch>
                <Route exact path="/" component={Home} />
                <Route exact path="/home" component={Home} />
                <Route exact path="/classes" component={Classes} />
                <Route exact path="/variables" component={Variables} />
                <Route exact path="/declaration_and_initialization_of_variables" component={Declarations} />
                <Route exact path="/methods" component={Methods} />
                <Route exact path="/constructors" component={Constructors} />
                <Route exact path="/if_sentences" component={IfSentences} />
                <Route exact path="/loops" component={Loops} />
              </Switch>
            </div>
          </div>
        </div>
      </Router>;
  }
}

export default App;
