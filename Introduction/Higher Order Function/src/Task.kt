fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun higherOrderSum(x: Int, y: Int): Int {
    return calculate(x, y, ::sum)
}

fun higherOrderMultiplyInline(x: Int, y: Int): Int {
    return calculate(x, y) { a, b -> a * b }
}
