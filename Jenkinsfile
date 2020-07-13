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
   	      sh 'kubectl apply -f nginx-deployment.yaml'

   }
   }
   }
   }