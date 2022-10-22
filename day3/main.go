package main

import (
	"fmt"
	"math"
)


func Fibonacci(n int) []int {
	fibonacciSeq := []int{}

	if(n > 1) {
		a := 0

		b := 1

		fibonacciSeq = append(fibonacciSeq, a)

		fibonacciSeq = append(fibonacciSeq, b)

		for i:=0; i < n;i++ {
			c := a + b

			a = b 

			b = c

			fibonacciSeq = append(fibonacciSeq, int(math.Abs(float64(c))))
		}

	} else if (n == 0) {
		fibonacciSeq = append(fibonacciSeq, 0)
	} else {
		fibonacciSeq = append(fibonacciSeq, 0)

		fibonacciSeq = append(fibonacciSeq, 1)
	}
	return fibonacciSeq
}

func main() {
	a := Fibonacci(10)

	b := Fibonacci(50)
	
	c := Fibonacci(100)

	fmt.Println("a:", a)

	fmt.Println("b:",b)

	fmt.Println("c:",c)
	
}