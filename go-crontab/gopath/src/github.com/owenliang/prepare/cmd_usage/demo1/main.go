package main

import (
	"os/exec"
	"fmt"
)

func main() {
	var (
		cmd *exec.Cmd
		err error
	)


	cmd = exec.Command("/bin/bash", "-c", "echo 3 > /tmp/test;")

	//cmd = exec.Command("/usr/bin/bash", "-c", "echo 1")

	fmt.Println(cmd)


	err = cmd.Run()

	fmt.Println(err)
}
