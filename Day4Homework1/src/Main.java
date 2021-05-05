public class Main {

    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager;
        
        baseCustomerManager = new StarbucksCustomerManager();
        baseCustomerManager.Save(new Customer(1, "Mehmut", "Korkmaz", "2000", "15615132749"));
        
        BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
        baseCustomerManager2.Save(new Customer(2, "Mete", "Ayaz", "2003", "46123895413"));

    }

}