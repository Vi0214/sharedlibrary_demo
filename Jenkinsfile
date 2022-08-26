@Library('sharedlibrary_demo') _

pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                gitrepository()
            }
        }
        stage('Build') {
            steps {
                Buildcode()
            }
        }
    }
}
