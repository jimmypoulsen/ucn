import React from 'react';
import { Link } from 'react-router-dom';

const Topics = props => (
  props.displayNavigation ?
  <div className="topics">
    {props.topics.map(topic => (
      <Link key={topic.key} to={topic.path}>
        <p>{topic.name}</p>
      </Link>
    ))}
  </div> : ''
);

export default Topics;