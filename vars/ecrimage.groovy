def call {
	echo "building and pushing an image to ECR....."
	sh "docker build -t ${Image_name} ."
}
