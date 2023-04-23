package lesson_8.Homework_8_2;

public abstract class Operation {
    protected Double num1;
    protected Double num2;
    protected String oper;

    public void DpOperation(Double num1, String oper, Double  num2){
        this.num1 = num1;
        this.oper = oper;
        this.num2 = num2;
    }
}
