pipeline {
    agent any
    options {
        skipDefaultCheckout(true)
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'javac *.java'
                bat 'jar cfe notes.jar Main *.class'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t priyanappu30/notes-app:v1 .'
            }
        }

        stage('Push') {
            steps {
                bat 'docker push priyanappu30/notes-app:v1'
            }
        }
    }
}
