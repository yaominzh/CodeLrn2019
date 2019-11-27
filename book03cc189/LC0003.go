package main

import "fmt"
func lengthOfNonRepeatingSubStr(s string) int {
	lastOccurred :=make(map[byte]int)
	start :=0
	maxLength :=0
	for i, ch := range[]byte(s) {
		lastI, ok := lastOccurred[ch]
		if ok && lastOccurred[ch] >=start {
			start = lastI+1
		}
		if i-start+1>maxLength{
			maxLength = i - start +1
		}
		lastOccurred[ch] = i
	}
	return maxLength
	
}
func main() {
	fmt.Println(lengthOfNonRepeatingSubStr("abcabcaa"))

	fmt.Println("vim-go")
}
