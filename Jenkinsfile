node{
  stage('SCM Checkout'){
    git 'https://github.com/Jhmedinaa/GestionConfiguracion'  
  }
  stage('Compile-Package'){
    sh 'mvn spring-boot:run'
  }
}
