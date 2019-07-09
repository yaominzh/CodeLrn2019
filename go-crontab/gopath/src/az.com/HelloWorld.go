package main

import "fmt"

func variableZeroValue() {
	var a int
	var s string
	fmt.Printf("%d %q\n", a, s)
}

func variableInitialValue() {
	var a,b int = 3, 4
	var s string ="abc"
	fmt.Printf("%d %d %q\n", a,b, s)
}

func main() {
	fmt.Println("Hello World")
	variableZeroValue()
	variableInitialValue()

}
