
package interfacegrafica;


public class Imc {
   
    public double calcular(double peso, double altura){
      return peso/(altura*altura);  
    }
    public String situacao(double peso, double altura){
        double imc = calcular(peso, altura);
       
        if(imc>=18.5 && imc<=24.99){
            return "PESO NORMAL !!!";
        }
        else if(imc>=25 && imc<=29.99){
            return "ACIMA DO PESO !!!";
        }
        else if(imc>=30 && imc<=34.99){
            return "OBESIDADAE I !!!";
        }
        else if(imc>=35 & imc<=39.99){
            return "OBESIDADAE II(SEVERA) !!!";
        }
        else if(imc>40){
            return "OBESIDADE GRAVE !!!";
        }
        return null;
         
    }
}
