public class OrderTest {

    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // Create instances for invoice generation and email notification
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        EmailNotifier emailNotifier = new EmailNotifierImpl();

        // Generate invoice and send email notification separately
        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}