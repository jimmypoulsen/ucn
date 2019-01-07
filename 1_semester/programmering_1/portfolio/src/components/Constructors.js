import React from "react";
import Markdown from 'react-remarkable';

const Constructors = props => (
  <div className="constructors">
    <h1>Constructors</h1>

    <h3>Definition</h3>
    <div className="code">
      <Markdown>{`
      <visibility-modifier> <class-name>()
      `}</Markdown>
    </div>

    <h3>Struktur</h3>
    <div className="code">
      <Markdown>{`
      public class Car {
        private String brand;
        private String modelNo;
        private String plateNo;

        // constructor with parameters
        public Car(brand, modelNo, plateNo) {
          this.brand = brand;
          this.modelNo = modelNo;
          this.plateNo = plateNo;
        }

        // constructor without parameters
        public Car() {
          this.brand = "";
          this.modelNo = "";
          this.plateNo = "";
        }
      }
      `}</Markdown>
    </div>
  </div>
);

export default Constructors;
