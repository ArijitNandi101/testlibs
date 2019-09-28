def call(def name='Hey there!!!'){
  echo "$name , I";
}

def jenkinsScriptHere(){
  sh "echo 'can be called only within script block, as sh is used only by jenkins pipeline'"
}
