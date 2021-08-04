pipeline {
  agent any
  stages {	
	stage('Maven Compile'){
		steps{
			sh "mvn compile"
	       	}
	}
	
	stage('Unit Test') {
	   steps {
			sh "mvn test"
	       
       		}
   	}

	stage('Jacoco Coverage Report') {
        	steps{
            		jacoco()
		}
	}
       
//        stage('SonarQube'){
// 		steps{
// 				bat label: '', script: '''mvn sonar:sonar \
// 				-Dsonar.host.url=http://localhost:9000 \
// 				-Dsonar.login=095977cf540205c8781c3be94721b6da0bfcef4d'''
// 			}
//    		}
	
	stage('Maven Package'){
		steps{
			sh "mvn package"
		}
	} 
        stage('Archiving') { 
            steps {
                 archiveArtifacts '**/target/*.jar'
            }
        }
    
  }
}
