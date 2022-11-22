fun main() {
    print(solution("var_1__Int"))
}

fun solution(name: String): Boolean {
    if (name[0].isDigit())
        return false

    for (i in name.indices) {
        if (!name[i].isLetterOrDigit() && name[i] != '_') {
            return false
        }
    }

    return true
}