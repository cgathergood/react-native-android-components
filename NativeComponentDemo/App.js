import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View
} from 'react-native';
import EditText from './EditText';

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text>Bridging Native Components</Text>
        <EditText
          style={styles.editText}
          hint="Floating Title"
          fontSize={20}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
    paddingBottom: 20,
  },
  editText: {
    width: 300,
    height: 200,
    margin: 10,
  }
});
