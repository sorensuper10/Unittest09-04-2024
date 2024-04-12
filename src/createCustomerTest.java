import org.junit.Test;


public class createCustomerTest {
    @Test
    public void testCreateCustomer() {
        // Opret en dummy kunde
        Customer dummyCustomer = new Customer("Dummy", "dummy@example.com");

        // Opret en rigtig implementation af DbSql
        DbSql dbSql = new DbSql();

        // Opret CustomerService og kald createCustomer metoden
        CustomerService customerService = new CustomerService();
        customerService.createCustomer(dummyCustomer);

        // Tjek om kunden er oprettet korrekt ved at søge efter den i DbSql
        Customer retrievedCustomer = dbSql.getCustomer(dummyCustomer.getId());
        // Her kan du udføre yderligere assertion eller verifikation af retrievedCustomer
    }
}
