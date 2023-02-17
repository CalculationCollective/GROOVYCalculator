println "Enter the first number: "
def num1 = System.in.newReader().readLine().toDouble()

println "Choose between:\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division"
def calculationType = System.in.newReader().readLine()

println "Enter the second number: "
def num2 = System.in.newReader().readLine().toDouble()

switch(calculationType) { 
  case "1": 
    println num1 + num2
    break;
  case "2": 
    println num1 - num2
    break;
  case "3": 
    println num1 * num2
    break;
  case "4": 
    println num1 / num2
    break;
  default:
    println calculationType + " is not a valid function"
} 