class Superclass{
    int var;
    Superclass(int var){
        this.var = var;
    }
    public void getVar(){
        System.out.println("var value in super class is "+ var);
    }
}

public class task033_1 extends Superclass{
    task033_1(int var) {
        super(var);
    }
    public static void main(String[] args){
        Superclass sobj = new Superclass(100);
        sobj.getVar();
    }
}
 