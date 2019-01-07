import React from "react";
import Markdown from 'react-remarkable';

const Declarations = props => (
  <div className="declarations">
    <h1>Erklæring og assignment af variabler</h1>

    <h3>Definition</h3>
    <div className="code">
      <Markdown>{`
      // declarations
      <visibility-modifier> <type> <variable-name>;

      // initialization
      <variable-name> = <value>
      `}</Markdown>  
    </div>

    <h3>Struktur</h3>
    <div className="code">
      <Markdown>{`
      // declarations
      private String name;
      private int age;

      // initialization
      name = "John Doe";
      age = 99;
      `}</Markdown>
    </div>
    <p>For at kunne benytte en variabel, skal den initialiseres, efter den er deklareret. Såfremt en variabel forsøges brugt, uden den er initialiseret, kommer der en error.</p>
  </div>
);

export default Declarations;
