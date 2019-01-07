import React, { Component } from 'react';
import { ProductsContext } from '../App'

const CartLine = ({ productKey, productAmount }) => (
  <ProductsContext.Consumer>
    {products => (
      <div className="cartLine">
        <h3 className="cartLine--product__name">{products[productKey].name}</h3>
        <p className="cartLine--product__price">
          {productAmount}
        </p>
      </div>
    )}
  </ProductsContext.Consumer>

);

export default CartLine;