
package polidivisible;

public class metodos {
    public boolean esPol(int num){
        int dig = Integer.toString(num).length();
        for(int i = 0; i < dig; i++){
            if(!(num % dig == 0)){
                return false;
            }
            num /= 10;
            dig--;
        }
        return true;
    }
    public boolean  val(String cad){
        try{
            int num = Integer.parseInt(cad);
            if(num > 0 && num <= Math.pow(10, 18)){
                return true;
            }else{
                return false;
            }
        }catch(NumberFormatException e){
            return false;
        }
    }
}

/*Adriana Anzola & Nicolas Rojas*/
