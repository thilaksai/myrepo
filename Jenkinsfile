pipeline {

  agent { label 'worker' }

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


stage("Parallel") {
  steps {
    parallel (
      "Taskone" : {
        sh 'echo "In Taskone"'
      },
      "Tasktwo" : {
        sh 'echo "In Tasktwo"'
      }
    )
  }
}

  }

post {
    always {
      echo 'always runs regardless of the completion status of the Pipeline run'
    }
    success {
      echo 'step will run only if the build is successful'
    }
    failure {
      echo 'only when the Pipeline is currently in a "failed" state run, usually expressed in the Web UI with the red indicator.'
    }
  }
}
