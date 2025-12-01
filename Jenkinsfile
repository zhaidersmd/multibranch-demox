pipeline {
    agent any

    stages {
        stage('Print Branch Name') {
            steps {
                echo "Building branch: ${env.BRANCH_NAME}"
            }
        }

        stage('Build Java') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run JAR') {
            steps {
                sh 'java -jar target/java-multibranch-demo-1.0.0.jar'
            }
        }
    }

    post {
        success {
            echo "✅ Build Success for: ${env.BRANCH_NAME}"
        }
        failure {
            echo "❌ Build Failed for: ${env.BRANCH_NAME}"
        }
    }
}

