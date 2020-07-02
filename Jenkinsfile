pipeline {


  agent any

  stages {

    stage('Checkout Source') {
      steps {
        git 'https://github.com/jonig123/eks-demo.git'
      }
    }


    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "kubia-manual.yaml", kubeconfigId: "mykubeconfig")
        }
      }
    }

  }

}