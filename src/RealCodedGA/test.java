package RealCodedGA;

import java.util.ArrayList;
import java.util.List;

import org.python.core.PyDictionary;
import org.python.core.PyFloat;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyList;
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
        ArrayList<Double> a1 =new ArrayList<Double>();
        a1.add((double) 0);
        a1.add((double) 0);
        a1.add((double) 0);
		PyObject pyobj = calc.__call__(new PyList(a1));  
        System.out.println("anwser = " + pyobj.asDouble());   
   
    }//main  
}

