
    node('master'){

        stage('Checkout'){

            cleanWs()
            checkout scm
        }

        stage('JobSeeding'){
            jobDsl(targets:'jobdsl/*.groovy', sandbox: true)
        }
    }
