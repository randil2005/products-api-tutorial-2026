
# Product UML Class Diagram

```mermaid
classDiagram
    class Product {
        -Long id
        -String name
        -double price
        +Product()
        +Product(Long id, String name, double price)
        +Long getId()
        +String getName()
        +double getPrice()
    }
    ```
