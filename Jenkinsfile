pipeline {

  agent { label 'worker' }

  stages {

    stage('Compile') {
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('Code Review') {
      steps{
        sh 'mvn clean pmd:pmd'
      }
    }
    stage('Unit Test') {
      steps{
        sh 'mvn clean test'
      }
    }
    stage('Code Coverage') {
      steps{
        sh 'mvn clean cobertura:check'
      }
    }
    stage('Install') {
      steps{
        sh 'mvn clean install'
      }
    }
  }
}
