@Library('sharedlibrary_demo') _

pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                gitrepo()
            }
        }
        stage('Build') {
            steps {
                build()
            }
        }
    }
}
