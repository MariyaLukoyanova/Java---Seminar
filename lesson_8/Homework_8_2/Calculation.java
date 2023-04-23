package lesson_8.Homework_8_2;

public class Calculation extends Operation implements Interface{

    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double substrction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return (num1 * num2);
    }

    @Override
    public double division(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return (num1 / num2);
        }
    }



 @Override
    public String calc(Operation opera) {
        if (opera instanceof Operation){
if (opera.oper.equals("+")) return Double.toString(addition(opera.num1, opera.num2));
else if (opera.oper.equals("-")) return Double.toString(substrction(opera.num1, opera.num2)); 
else if (opera.oper.equals("*")) return Double.toString(multiplication(opera.num1, opera.num2));
else if (opera.oper.equals("/")) return Double.toString(division(opera.num1, opera.num2));
else return "Error! No such operation!";  
}
    else return "Error!";
    }



@Override
public void DpOperation(Double num1, String oper, Double num2) {
    super.DpOperation(num1, oper, num2);
    String res = calc(this);
    System.out.println(res);
}
}    
