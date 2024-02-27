pipeline {
    agent any
    environment {
        // Append the Maven bin directory to the PATH
        PATH = "${env.PATH};C:\\apache-maven-3.9.6\\bin"
        // Set up your Git credentials
        GIT_CREDENTIALS = credentials('1')
    }
    stages {
        stage('Checkout') {
            steps {
                // Check out the source code from the Git repository
                git branch: 'main', credentialsId: '1', url: 'https://github.com/ivanse1/FarToCel'
            }
        }
        // Add additional stages as needed, for example:
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
