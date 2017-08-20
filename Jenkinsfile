pipeline {
  agent any

  tools {
    maven 'maven 3.5.0'
    jdk 'openjdk 1.8.0'
  }

  stages {
    stage('Checkout') {
      steps {
        checkout([$class: 'GitSCM', branches: [[name: 'findbugs']], userRemoteConfigs: [[url: 'https://github.com/selste/simple-maven-project-with-tests']]])
      }
    }

    stage('Build') {
      steps {
        bat 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test'
        findbugs canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/target/findbugsXml.xml', unHealthy: ''
      }
    }
  }
}
