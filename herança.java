class Produto{
    private String nome;
    private double preco;
    private int cod;
    public Produto(String n,double p,int c){
        this.nome=n;
        this.preco=p;
        this.cod=c;
    }
    public void mostrar(){
        System.out.println("nome: "+nome);
        System.out.println("valor: "+preco);
        System.out.println("codigo: "+cod);
    }
}
class Alimento extends Produto{
    private String nome;
    private double preco;
    private int cod;
    private String validade;
    public Alimento(String n,double p,int c,String v){
        super(n,p,c);
        this.nome = n;
        this.preco= p;
        this.cod=c;
        validade = v;
    }
    @Override
    public void mostrar(){
        System.out.println("nome: "+nome);
        System.out.println("valor: "+preco);
        System.out.println("codigo: "+cod);
        System.out.println("valido: "+validade);
    }
}
class Eletronico extends Produto{
    private String nome;
    private double preco;
    private int cod;
    private String garantia;
    public Eletronico(String n,double p, int c,String g){
        super(n,p,c);
        this.nome=n;
        this.preco=p;
        this.cod=c;
        garantia=g;
    }
    @Override
    public void mostrar(){
        System.out.println("nome: "+nome);
        System.out.println("valor: "+preco);
        System.out.println("codigo: "+cod);
        System.out.println("garantia: "+garantia);
    }
}
public class Main{
    public static void main (String[] args) {
        Alimento a1 = new Alimento("carne",37.70,123,"20/04/2026");
        Eletronico e1 = new Eletronico("controle",127,7533,"12 meses ");
        a1.mostrar();
        e1.mostrar();
    }
}