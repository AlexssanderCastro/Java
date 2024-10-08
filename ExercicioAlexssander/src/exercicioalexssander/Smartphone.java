package exercicioalexssander;

/**
 *
 * @author IFTM
 */
public class Smartphone {
    private String modelo;
    private String marca;
    private int memoriaRAM;
    private int hd;

    public Smartphone(String modelo, String marca, int memoriaRAM, int hd) {
        this.modelo = modelo;
        if(marca.equals("Apple")|| marca.equals("Xiaomi")||marca.equals("Samsung")){
            this.marca=marca;
        }else{
            this.marca="Nao informado";
        }
        if(memoriaRAM<=0 || hd<=0){
            this.memoriaRAM=100;
            this.hd=100;
        }else{
           this.memoriaRAM = memoriaRAM;
           this.hd = hd;  
        }
    }
    
    public Smartphone() {
    }
    
    

    public Smartphone(int memoriaRAM, int hd) {
        
        if(memoriaRAM<=0 || hd<=0){
            this.memoriaRAM=100;
            this.hd=100;
        }else{
           this.memoriaRAM = memoriaRAM;
           this.hd = hd;  
        }
        
    }

    
    
//    public void setModelo(String modelo){
//        if(modelo.equals("Iphone")|| modelo.equals("Xiaomi")||modelo.equals("Samsung")){
//            this.modelo=modelo;
//        }else{
//            this.modelo="Não informado";
//        }
//        
//    }
//    public void setMarca(String marca){
//        this.marca=marca;
//    }
//    public void setMemoriaRAM(int memoriaRAM){
//        this.memoriaRAM=memoriaRAM;
//    }
//    public void setHd(int hd){
//        this.hd=hd;
//    }

     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.equals("Apple")|| marca.equals("Xiaomi")||marca.equals("Samsung")){
            this.marca=marca;
        }else{
            this.marca="Não informado";
        }
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }
    
    
    
}
