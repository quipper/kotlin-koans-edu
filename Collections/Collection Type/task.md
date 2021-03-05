## Collection Types

Kotlin has two types of [collection](https://kotlinlang.org/docs/collections-overview.html#collection-types), read-only and mutable. This 'mutability' is provided through interface and only available at compile time. Both List and MutableList are compiled into Java List collection reference which has both read and mutation method.
It should be safe for 100% Kotlin code but be mindful of this when interop with Java codes, because it's still possible to manipulate Kotlin read-only list.

For this task, make sure the list returned for both function match with return type and maintain the elements.
