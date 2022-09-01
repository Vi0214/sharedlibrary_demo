def call {
	echo "building and pushing an image to ECR....."
	sh "docker build -t ${Image_name} ."
  sh "docker tag ${Image_name}:latest 975513479057.dkr.ecr.us-east-1.amazonaws.com/${Image_name}:1.0.${env.BUILD_NUMBER}"
	sh "aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 975513479057.dkr.ecr.us-east-1.amazonaws.com"
  sh "docker push 975513479057.dkr.ecr.us-east-1.amazonaws.com/${Image_name}:1.0.${env.BUILD_NUMBER}"

}
