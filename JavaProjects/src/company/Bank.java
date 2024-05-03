package company;
 class Bank implements User,Owner{
    double account;

     public double getAccount() {
         return account;
     }

     public void setAccount(double account) {
         this.account = account;
     }

     public boolean deleteAccount(){
         account = 0.00;
         return true;
     }

 }