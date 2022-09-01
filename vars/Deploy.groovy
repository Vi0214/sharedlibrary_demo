def call {
	withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'Kube_config', namespace: '', serverUrl: '') {
        sh "kubectl apply -f eks-deploy-k8s.yaml"
    }
}
