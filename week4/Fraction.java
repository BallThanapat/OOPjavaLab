public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return (topN+"/"+btmN);
    }
    public String toFloat(){
        double sum = (double)topN/(double)btmN;
        return ""+sum;
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN+f.topN;
            btmN = f.btmN;
        }else if (btmN != f.btmN){
            topN = (topN*f.btmN)+(f.topN*btmN);
            btmN = btmN*f.btmN;
        }
        return;
    }
}
