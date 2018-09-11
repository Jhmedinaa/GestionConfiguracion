node{
  stage('SCM Checkout'){
    git 'https://github.com/Jhmedinaa/GestionConfiguracion'  
  }
  stage('Compile-package'){
    sh 'mvn spring-boot:run'
  }
}
