pipeline {
  agent any

  tools {
    maven 'maven 3.5.0'
    jdk 'openjdk 1.8.0'
  }

  stages {
    stage('Checkout') {
      steps {
        checkout([$class: 'GitSCM', branches: [[name: 'testng']], userRemoteConfigs: [[url: 'https://github.com/selste/simple-maven-project-with-tests']]])
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
        step([$class: 'Publisher', reportFilenamePattern: '**/target/surefire-reports/testng-results.xml', showFailedBuilds: true])
      }
    }
  }
}