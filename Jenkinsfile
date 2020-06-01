pipeline {
  agent any
  stages {
    stage('Compile') {
      steps{
        sh 'mvn clean compile '
      }
    }
    stage('Code Review') {
      steps{
        sh 'mvn clean pmd:pmd'
      }
    }

  }

  }
