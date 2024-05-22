
package tugaslaprog4;


public class saham {
    private String simbol;
    private String nama;
    private double priorClosingPrice;
    private double currentPrice;
    
    
    public saham(String simbol, String nama, double priorClosingPrice, double currentPrice){
        this.simbol=simbol;
        this.nama=nama;
        this.priorClosingPrice=priorClosingPrice;
        this.currentPrice=currentPrice;
    }
    
    public String getSimbol(){
        return simbol;
    }
    public void setSimbol(String simbol){
        this.simbol=simbol;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public double getPriorClosingPrice(){
        return priorClosingPrice;
    }
    public void setPriorClosingPrice(double priorClosingPrice){
        this.priorClosingPrice=priorClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }
    
    public double getChangePercent (){
        return (priorClosingPrice-currentPrice)*100;
    }
    
    public void info(){
        System.out.println("perubahan persentase harga awal dari " +priorClosingPrice+ " menuju ke "+currentPrice+" sebasar "+getChangePercent());
    }
}
