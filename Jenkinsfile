node() {

    stage('checkout'){
        checkout scm
    }

    stage('build'){
        withGradle(){
            sh "gradle clean build"
        }
    }

}