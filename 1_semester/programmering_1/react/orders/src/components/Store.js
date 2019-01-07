import React from "react";
import Product from './Product';
import '../Store.css';

const Store = props => (
  <div className="store">
    <h1 className="store__title">Store</h1>
    <div className="store--products">
      {props.products.map(function(product) {
        return <Product key={product.key} product={product} handleAddToCart={props.handleAddToCart}></Product>;
      })}
    </div>
  </div>
);

export default Store;
