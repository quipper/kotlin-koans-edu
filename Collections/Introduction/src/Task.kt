fun emptyCustomerList(): List<Customer> =
        emptyList()

fun createCustomerList(vararg customers: Customer): List<Customer> =
        customers.toList()

fun Shop.getSetOfCustomers(): Set<Customer> =
        customers.toSet()
