import PropTypes from 'prop-types';
import { requireNativeComponent, ViewPropTypes } from 'react-native';

// Component Interface
var iface = {
  name: 'EditText',
  propTypes:{
    ...ViewPropTypes, // include the default view properties
    hint: PropTypes.string,
    fontSize: PropTypes.number,
  }
};

const EditText = requireNativeComponent('EditText', iface);

export default EditText;
