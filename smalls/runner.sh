javac $1

var1="$1"
var2=${var1%.java}

java $var2

rm *.class

