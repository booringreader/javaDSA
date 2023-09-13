public class modifiers {
    public static void main(String args[]){
        Bank_Account acc1 = new Bank_Account();
        acc1.username = "donald_duck";
        acc1.setPass("quack_quack");
    }
}

class Bank_Account{
    public String username;
    private String password;
    public void setPass(String pass){
        password = pass;
    }

}
