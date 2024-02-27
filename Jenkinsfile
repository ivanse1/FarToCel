pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Invoke Maven to build the project
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests, typically also done as part of Maven build
                bat 'mvn test'
            }
        }
    }
    post {
        always {
            // Actions to perform after the pipeline has finished
            echo 'Build completed!'
        }
    }
}
