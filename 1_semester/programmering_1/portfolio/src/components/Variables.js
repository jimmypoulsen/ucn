import React from 'react';
import Markdown from 'react-remarkable';

const Variables = props => (
  <div className="variables">
    <h1>Variabler</h1>

    <h3>Definition</h3>
    <div className="code">
      <Markdown>{`
      <visibility-modifier> <type> <variable-name>;
      `}</Markdown>
    </div>

    <h3>Struktur</h3>
    <p>
      <i>Fields == Attributes == Instance variables. </i>
      De kan kaldes både det ene og det andet.
    </p>
    <div className="code">
      <Markdown>{`
      public class Car {
        private Owner owner;
        private String plateNo;
        private String brand;
        private String modelName;
      }
      `}</Markdown>
    </div>
    <p>Visibility-modifier'en er meget afgørende her. Såfremt den er <i>private</i>, kan den kun tilgås i den pågældende klasse. Ønsker man at bruge eller ændre værdien andetsteds, skal dette gøres med get/set metoder.</p>
  </div>
);

export default Variables;