interface Account{
    void Deposit();
    void Withdraw();
    void Interest();
    void ViewBalances();
    }
class SavigsAccount implements Account{
    double interest;
    double p;
    double r;
    double t;
    double viewbalance;
    SavigsAccount(double P, double R,double T,double Viewbalance){
        this.p = P;
        this.r = R;
        this.t = T;
        this.viewbalance = Viewbalance;
    }
    public void Deposit(){
        System.out.println("You Can Deposit The cash In SavigsAccount");
    }
    public void Withdraw(){
        System.out.println("You Can Withdraw The Cash From SavigsAccount");
    }
    public void Interest(){
        interest = p*r*t;
        System.out.println("You Can See The Interest From SavigsAccount :" + interest);
    }
    public void ViewBalances(){
        System.out.println("You Can ViewBalance From SavigsAccount :" + viewbalance);
    }

}
class CurrentAccount implements Account{
    double interest;
    double p;
    double r;
    double t;
    double viewbalance;

 CurrentAccount(double P,double R,double T,double Viewbalance){
    this.p = P;
    this.r = R;
    this.t = T;
    this.viewbalance = Viewbalance;
}
public void Deposit(){
    System.out.println("You Can Deposit The Cash In CurrentAccount");
}
public void Withdraw(){
    System.out.println("You Can Withdraw The Cash From CurrentAccount");
}
public void Interest(){
    interest = p*r*t;
    System.out.println("You can See Interest From CurrentAccount :");
}
public void ViewBalances(){
    System.out.println("You Can ViewBalances From CurrentAccount :" + viewbalance);
}


}
public class BankAccountInterface {
    public static void main(String[] args) {

        SavigsAccount s1 = new SavigsAccount(5, 9, 7, 30000);
        s1.Deposit();
        s1.Withdraw();
        s1.Interest();
        s1.ViewBalances();

        CurrentAccount c1 = new CurrentAccount(3,7,9,50000);
        c1.Deposit();
        c1.Withdraw();
        c1.Interest();
        c1.ViewBalances();
        
    }
    
}
