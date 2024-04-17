pipeline {
    agent any
    stages {
        stage('Jenkins Partner') {
            steps {
                echo 'Jenkins Partner'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}