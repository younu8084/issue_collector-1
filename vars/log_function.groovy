import groovy.json.JsonSlurper 
@NonCPS
createlog(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = resultJson.key
sh "echo ${message} >log.txt"
/*def fileName = "jira.txt"
def inputFile = new File(fileName)
if(inputFile.exists())
  {
    inputFile.append("${projectName}")
  }
  else
  {
     inputFile.write("${projectName}")
  }
}*/
}
def call(message)
{
 println(message)
 def request = libraryResource 'data1.json'
  createlog(request,message)
}
/*def call(){
def request = libraryResource 'data1.json'
createlog(request)
}*/
