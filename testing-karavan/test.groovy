import java.util.HashMap;
//import groovy.json.JsonOutput;
import com.fasterxml.jackson.databind.ObjectMapper

def test = body
List<String> arrText = new ArrayList<>()

test.result?.each { item -> 
    arrText.add(item.message?.text as String)
    println item.message?.text
}

body = arrText