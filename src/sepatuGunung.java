public class sepatuGunung extends sepatu {
    private int ketahananSuhu;

    public void setKetahananSuhu(int nilai){
        ketahananSuhu = nilai;
    }

    public void print(){
        super.print();
        System.out.println("Ketahanan nya " + ketahananSuhu);
    }
}
