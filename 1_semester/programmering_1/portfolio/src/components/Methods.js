import React from "react";
import Markdown from 'react-remarkable';

const Methods = props => (
  <div className="methods">
    <h1>Metoder</h1>

    <h3>Definition</h3>
    <div className="code">
      <Markdown>{`
      <visibility-modifier> <type> <method-name>()
      `}</Markdown>
    </div>

    <h3>Struktur</h3>
    <div className="code">
      <Markdown>{`
      public class Human {
        private String name = "John Doe";

        public String getName() {
          return this.name;
        }

        public void setName(String name) {
          this.name = name;
        }
      }
      `}</Markdown>
    </div>
  </div>
);

export default Methods;
