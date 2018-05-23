package by.it.shumilov.Calc;

import java.util.HashMap;
import java.util.Map;

class Var implements  Operation {

    private  static Map<String,Var> vars = new HashMap<>();

    public static  Var saveVar(String key,Var var){
        vars.put(key,var);
        return var;
    }

    static Var createVar(String strVar) throws CalcException {
        if(strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        else if(strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        else if(strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        else if (vars.containsKey(strVar))
            return vars.get(strVar);
        throw new CalcException("Неизвестный тип переменной " + strVar);  //todo generate Some error(Exc)
    }

    @Override
    public String toString() {

        return "Abstract";
    }

    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("Операция сложения "   + this + "+" + other + "невозможена");

    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("Операция вычитания "   + this + "-" + other + "невозможена");

    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("Операция умножения "   + this + "*" + other + "невозможена");

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Операция деления "   + this + "/" + other + "невозможена");

    }
}
