import java.util.HashMap;

def test = body
List<String> arrText = new ArrayList<>()
def outputString = "La lista dei messaggi è: "

test.result?.each { item -> 
    arrText.add(item.message?.text as String)
    println item.message?.text
    outputString = outputString + (item.message?.text as String) + ", "
}

body = outputString