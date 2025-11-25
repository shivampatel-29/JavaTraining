class Atm{
    private int TotalBalance=1000000;

    public void getTotalB(){
        System.out.println(TotalBalance);
    }

    public void setBalance(int amount){
        if(amount>0 && TotalBalance>=amount){
            TotalBalance = amount;
            System.out.println(TotalBalance);
        }

    }
};
class encapsulation{
    public static void main(String[] args){
        

    }
}
