node{
  stage('SCM Checkout'){
    git 'https://github.com/Jhmedinaa/GestionConfiguracion'  
  }
  stage('Compile-Package'){
    bat 'mvn spring-boot:run'
  }
}
