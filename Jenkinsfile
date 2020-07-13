pipeline {


  agent any

  stages {

    stage('Checkout Source') {
      steps {
        git 'https://github.com/jonig123/eks-demo.git'
      }
    }


      stage("Deploy To Kuberates Cluster"){
     steps {
      try {
             sh 'kubectl rollout restart -f nginx-deployment.yaml'
       } catch (e) {
   	      sh 'kubectl apply -f nginx-deployment.yaml'
   	}
   }
   }
   }
   }