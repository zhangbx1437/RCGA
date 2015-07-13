package RealCodedGA;

import org.python.core.PyFloat;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyType;
import org.python.util.PythonInterpreter;  
public class test
{  
    public static void main(String args[])  
    {  
        PythonInterpreter interpreter = new PythonInterpreter(); 
        String str="C:/Users/admin/Desktop/test.py";
        interpreter.execfile(str);
        PyFunction calc = (PyFunction)interpreter.get("calculate",PyFunction.class);  
		double a=1.1,b=1.1;
        PyObject pyobj = calc.__call__(new PyFloat(a),new PyFloat(b));  
        System.out.println("anwser = " + pyobj.toString());   
   
    }//main  
}

