public class Opps {
    public static void main(String[] args) {
        BankAccount employee = new BankAccount();
        employee.employeeName("Atharva Atkari");
        employee.setPassword("atharva");
        employee.depositAmmount(3000);
        employee.withdrawAmmount(500);
        employee.checkCurrentAmmount();
    }
}
class BankAccount{
    String name;
    private String password;
    int deposits;
    int withdraw;
    int curentAmmount;

    public void employeeName(String name){
        this.name = name;
        System.out.println("Name is "+name);
    }
    public void setPassword(String pwd){
        password = pwd;
    }
    public void depositAmmount(int ammount){
        deposits = ammount;
        System.out.println("You have deposited the ammount is "+deposits);
    }
    public void withdrawAmmount(int ammount){
        withdraw = ammount;
        System.out.println("Your withdrawl money is "+withdraw);
    }
    public void checkCurrentAmmount(){
        curentAmmount = deposits - withdraw;
        System.out.println("current ammount is : "+curentAmmount);
    }
}