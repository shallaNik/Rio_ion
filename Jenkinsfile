pipeline {
    agent any
     tools {
        maven 'Maven 3.6.3' 
    }

    stages {
        stage ('Compile Stage') {
           
            steps {
                    sh 'mvn clean compile'
                }
        }
        stage ('Testing Stage') {

            steps {
                    sh 'mvn test'
                }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
       }
       stage ('building war file'){
            steps {
                    sh 'mvn clean install'   
               }
        }


        stage ('Deployment Stage') {
            steps {
             
                    echo "deployed"
                }
            
        }
    }
}
