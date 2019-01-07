import React from 'react';
import CartLine from './CartLine';
import '../Cart.css';

const Cart = props => (
  <div className="cart">
    <h1>Cart</h1>
    {props.cartKeys.map(key =>
      <CartLine key={key} productKey={key} productAmount={props.cart[key]}></CartLine>
    )}
  </div>
);

export default Cart;