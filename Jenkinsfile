pipeline {
  agent any
  stages {
    stage('Compile') {
      steps{
        sh 'mvn clean compile'
      }
    }

    stage('Unit Test 123') {
      steps{
        sh 'mvn clean test'
      }
    }

  }
}
