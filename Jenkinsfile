pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2 --network host' 
        }
    }
    stages {
        stage("build & SonarQube analysis") {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh 'mvn -f pom.xml clean package sonar:sonar -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=admin -Dsonar.password=allister-dev'
                }
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn -f pom.xml -B -DskipTests clean install' 
            }
        }
    }
}

