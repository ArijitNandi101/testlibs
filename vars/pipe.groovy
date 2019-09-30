def call(def someSr="none"){
  pipeline{
    agent any
    stages{
      stage("Boop boop"){
        input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
            }
        steps{
          echo "$someSr $params.PERSON"
        }
      }
    }
  }
}
