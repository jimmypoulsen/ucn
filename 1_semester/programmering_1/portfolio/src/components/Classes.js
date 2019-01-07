import React from 'react';
import Markdown from 'react-remarkable';

const Classes = props => (
  <div className="classes">
    <h1>Klasser</h1>

    <h3>Definition</h3>
    <div className="code">
      <Markdown>{`
      <visibility-modifier> class <class-name> {//}
      `}</Markdown>
    </div>

    <h3>Struktur</h3>
    <div className="code">
      <Markdown>{`
      public class ClassName {
        // attributes
        // constructors
        // methods
      }
      `}</Markdown>
    </div>
  </div>
);

export default Classes;