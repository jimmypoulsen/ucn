import React from 'react';
import '../Product.css';

// TODO: Add a prop to the 'add to cart' button
// so I can use the prop in App.js

const Product = props => (
  <div className="product">
    <h1 className="product__name">{props.product.name}</h1>
    <p className="product__price">{props.product.price} kr.</p>
    <button
      onClick={() => props.handleAddToCart(props.product.key)}
      product={props.product.name}
      className="product__add-to-cart"
    >
      Add to cart
    </button>
  </div>
);

export default Product;