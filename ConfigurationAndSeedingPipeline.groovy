pipeline {
    node('master'){

        stage('Checkout'){

            cleanWs()
            checkout scm
        }

        stage('JobSeeding'){
            jobdsl(targets:'jobdsl/*.groovy', sandbox: true)
        }
    }
}
