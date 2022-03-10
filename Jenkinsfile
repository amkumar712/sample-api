pipeline {
    agent { label "linux" }

    stages {

        stage('AWS Version') {
            steps {
                sh '''
                aws --version
                '''
            }
        }

    }
}