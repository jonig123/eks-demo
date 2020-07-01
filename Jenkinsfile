pipeline {

 agent any

  stages {

    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "kubia-manual.yaml", kubeconfigId: "mykubeconfig")
        }
      }
    }

  }

}