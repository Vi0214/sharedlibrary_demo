def call {
	      withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'Kube_config', namespace: '', serverUrl: '') {
        sh "sed -i s/_BUILD_NUMBER_/${env.BUILD_NUMBER}/g eks-deploy-k8s.yaml"
        sh "kubectl apply -f eks-deploy-k8s.yaml"
    }
}
