def call(def someSr="none"){
  pipeline{
    agent any
    stages{
      stage("Boop boop"){
        steps{
          echo "$someSr"
        }
      }
    }
  }
}
