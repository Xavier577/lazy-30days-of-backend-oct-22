package day4

import (
	"fmt"
	"testing"
)

func TestValidateCredentailsExample1(t *testing.T) {
	email := "akinwandeakiboluwarin@gmail.com"
	password := "YOucan'tgetmyPassword2"

	result := ValidateCredentails(email, password)

	testPass := result.Email == true && result.Password == true

	if !testPass {
		expectedValue := ValidationResponse{Email: true, Password: true}

		errMsg := fmt.Sprintln("expected", expectedValue, "got", result)

		t.Error(errMsg)
	}

	t.Log(result)

}

func TestValidateCredentailsExample2(t *testing.T) {
	email := "ichigokurosaki@gmail.com"
	password := "getsugaTensho"

	result := ValidateCredentails(email, password)

	testPass := result.Email == true && result.Password == false

	if !testPass {
		expectedValue := ValidationResponse{Email: true, Password: false}

		errMsg := fmt.Sprintln("expected", expectedValue, "got", result)

		t.Error(errMsg)
	}

	t.Log(result)

}

func TestValidateCredentailsExample3(t *testing.T) {
	email := "ichigokurosakigmail.com"
	password := "getsugaTensho"

	result := ValidateCredentails(email, password)

	testPass := result.Email == false && result.Password == false

	if !testPass {
		expectedValue := ValidationResponse{Email: false, Password: false}

		errMsg := fmt.Sprintln("expected", expectedValue, "got", result)

		t.Error(errMsg)
	}

	t.Log(result)

}
