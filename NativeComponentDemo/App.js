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
        <Text style={styles.welcome}>
          Creating Android Components for React Native
        </Text>
        <EditText
          style={styles.editText}
          hint="Enter Your Name"
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
