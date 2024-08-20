def toUpper(string: String): String = string.toUpperCase

def toLower(string: String): String = string.toLowerCase

def formatNames(name: String)(format: String => String) = format(name)

@main def ls9q3() = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => toUpper(name.take(2)) + name.drop(2)))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => name.head.toUpper + toLower(name.drop(1).init) + name.last.toUpper))
}