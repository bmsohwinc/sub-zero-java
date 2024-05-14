# All things Regex
- Regex is a sequence of characters that match a search pattern

## Theory
### Metacharacters
1. `^a`: Match strings starting with `a`
2. `b$`: Match strings ending with `b`
3. `b.r`: Match any character at `.`
4. `b|a`: Match either `a` or `b`
5. `\`: Skip few escape sequences or special characters

### Quantifiers
1. `+`: One or more present
2. `?`: One or zero occurrence of previous token
3. `*`: Zero of more present
4. `x{n}`: Previous token present _exactly_ `n` times
5. `x{n, }`: Previous token present `n or more` times
6. `x{n,m}`: Previous token present `between n and m` times _inclusive_

### Groups and Ranges
1. `()`: Match everything in the parentheses
2. `{}`: Match a numerical range
3. `[a-zTP]`: Match characters `a to z` or `T` or `P`
4. `[^a-z]`: Not match `a to z` characters
5. `^[a-z]`: Match with starting with `a to z` characters

### Escape characters
1. `\s`: Match whitespace
2. `\n`: Match newline
3. `\d`: Match digits `0-9`
4. `\w`: Match alphanumeric characters `[0-9a-zA-Z]`
5. `\D`: Match non-digit
6. `\W`: Match non-alphanumeric

## References
1. [JavaTPoint Blog](https://www.javatpoint.com/regex)
2. [Ubuntu Blog](https://ubuntu.com/blog/regex-basics)
3. [Online Regex](https://regex101.com/)
4. [HackerRank Practice](https://www.hackerrank.com/domains/regex)

