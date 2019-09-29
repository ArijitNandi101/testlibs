def call(){
  pipeline{
    agent any
    stages{
      stage("Boop boop"){
        steps{
          echo "Some sound"
        }
      }
    }
  }
}
