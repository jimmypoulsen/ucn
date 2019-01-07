import React, { Component } from 'react';
import Store from './components/Store';
import Cart from './components/Cart';
import './App.css';

export const ProductsContext = React.createContext()

class App extends Component {
  state = {
    products: [
      { key: 1, name: 'iPhone X', price: 10000 },
      { key: 2, name: 'iPhone XS', price: 12000 },
      { key: 3, name: 'iPhone XS Max', price: 15000 },
      { key: 4, name: 'iPhone XS Maxx', price: 15000 },
    ],
    cart: {},
  }

  handleAddToCart = key => {
    console.log("ADD TO CART CLICKED!! " + key);

    const cart = { ...this.state.cart};
    cart[key] = cart[key] + 1 || 1;
    this.setState({ cart });
  }


  render() {
    const cartKeys = Object.keys(this.state.cart);
    const cartValues = Object.values(this.state.cart);
    return (
      <ProductsContext.Provider value={this.state.products}>
      <div className="App">
        <div className="App--store">
          <h1>Hello, World!</h1>
          <p>This is our products:</p>
          <Store products={this.state.products} handleAddToCart={this.handleAddToCart}></Store>
        </div>

        <div className="App--cart">
          <h1>Hello, again!</h1>
          <p>This is your cart:</p>
          <Cart cartKeys={cartKeys} cartValues={cartValues} cart={this.state.cart} products={this.state.products}></Cart>
        </div>
      </div>
      </ProductsContext.Provider>
    );
  }
}

export default App;
