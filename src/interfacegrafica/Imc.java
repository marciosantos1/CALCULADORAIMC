
package interfacegrafica;


public class Imc {
   
    public double calcular(double peso, double altura ){
      return peso/(altura*altura);  
    }
    public String situacao(double peso, double altura,String nome){
        double imc = calcular(peso, altura);
       String n = nome;
        
       if(imc<18.5){
           return nome+ " Você está com : "+" ABAIXO DO PESO !!!";
       }
        
       else if(imc>=18.5 && imc<=24.99){
            return nome+ " Você está com : "+" PESO NORMAL !!!";
        }
        else if(imc>=25 && imc<=29.99){
            return nome+ " Você está com : "+" ACIMA DO PESO !!!";
        }
        else if(imc>=30 && imc<=34.99){
            return nome+ " Você está com : "+" OBESIDADAE I !!!";
        }
        else if(imc>=35 & imc<=39.99){
            return nome+ " Você está com "+" OBESIDADAE II(SEVERA) !!!";
        }
        else if(imc>40){
            return nome+ " Você está com : "+" OBESIDADE GRAVE !!!";
        }
        return null;
         
    }
}
